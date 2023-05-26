import React, { useEffect, useState } from 'react'
import { getUserByUsername, isUserLoggedIn } from '../reatapi/userapi'
import { Navigate } from 'react-router-dom'

export default function Profile({username}) {

    const [userprofile, setuserprofile] = useState()

    useEffect(()=>{
        getUserByUsername(username)
        .then(profile => setuserprofile(profile))
    },[])
  return (
    <div className='container mt-4'>
        {
            isUserLoggedIn()  ?
            userprofile &&
            <div>
                <h1>User Profile</h1>
                <p>Name : {userprofile.username}</p>
                <p>Email : {userprofile.email}</p>
                <p>Role : {userprofile.role}</p>
            </div>
                :
            <Navigate to='/login'/>
        }
        
    </div>
  )
}
