import React, { useEffect, useState } from 'react'
import { getUserByUsername, getUsername, isUserLoggedIn } from '../reatapi/userapi'
import { Link, Navigate, Outlet } from 'react-router-dom'

export default function Profile({username}) {

    const [userprofile, setuserprofile] = useState()

   
    useEffect(()=>{
        console.log(userprofile)
        getUserByUsername(getUsername())
        .then(profile => setuserprofile(profile))
    },[])
  return (
    <div className='container mt-4'>
        <div className='row'>
            <div className='col-md-4'>
        {
            isUserLoggedIn()  ?
            userprofile ?
            <div>
                <h1>User Profile</h1>
                <p>Name : {userprofile.username}</p>
                <p>Email : {userprofile.email}</p>
                <p>Role : {userprofile.role}</p>
            </div> : ''
                :
            <Navigate to='/login'/>
        }
        {
           userprofile && <Link  to={`${userprofile.username}`}>Edit</Link>
        }
       
        </div>
        <div className='col-md-8'>
            <Outlet/>
        </div>
        </div>
    </div>
  )
}
