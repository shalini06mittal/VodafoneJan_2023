import React,{useEffect, useState} from 'react'
import { useDispatch, useSelector } from 'react-redux';
import {useNavigate} from 'react-router-dom';
import { changeRegisterStatus, loginUser } from '../reduxclice/userslice';
const initialState = {
  "username":"shalini",
  "password":"shalini123"
}
export default function Login({setStatus, setusername}) {
// Below user and error are used internally by Login.js to display the UI
  const [user, setuser] = useState(initialState)
  const [error, setError] = useState()
  // routes
  let navigate = useNavigate()

  // dispatch us used to call the actions
  let dispatch = useDispatch()
  // is used to get the current state from the store
  let status = useSelector((state)=> state.userreducer.loginstatus)
	let registerstatus = useSelector((state)=> state.userreducer.registerstatus)
	console.log('register status ', registerstatus)
  useEffect(()=>{
		dispatch(changeRegisterStatus())
		if(status === 'success'){
			//console.log('1',status)
			navigate('/')
		}
		else if(status === 'failure'){
			//console.log('2',status)
			setError('Invalid Credentials')
		}
			
  },[status])
  const handleSubmit = (event)=>{
    event.preventDefault();
      dispatch(loginUser(user))  
	//  console.log('submit')
    }
    
  return (
    <div className="container">
		
		<h1>Login</h1>
    	<p style={{color:'red'}}>{error && error}</p>
		<form>
		<div className="mb-3">
			<label htmlFor="formGroupExampleInput2" className="form-label">User Name
				</label> <input type="text" className="form-control"
				name="username" value={user.username} onChange={(event)=>setuser({...user, [event.target.name]:event.target.value})}
				id="formGroupExampleInput2" placeholder="Username"/>
		</div>
		<div className="mb-3">
			<label htmlFor="formGroupExampleInput2" className="form-label">Password
				</label> <input type="password" className="form-control"
				name="password" value={user.password} onChange={(event)=>setuser({...user,[event.target.name]:event.target.value})}
				id="formGroupExampleInput2" placeholder="Password"/>
		</div>
		<button type="submit" className="btn btn-primary" onClick={handleSubmit}>Login</button>
		</form>
	</div>
  )
}
