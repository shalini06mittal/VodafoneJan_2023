import React,{useState} from 'react'
import { success, validateUser } from '../reatapi/userapi';
import {useNavigate, redirect} from 'react-router-dom';
const initialState = {
  "id":"1",
  "password":"shalini123"
}
export default function Login({setStatus}) {

  const [user, setuser] = useState(initialState)
  const [error, setError] = useState()
  let navigate = useNavigate()

  const handleSubmit = (event)=>{
    event.preventDefault();
    validateUser(user.id, user.password)
    .then(response => {
      if(response === success){
        console.log("store in storage")
        sessionStorage.setItem('id', user.id);
        setStatus(true)
         navigate('/')
        
    }
    } )
    .catch(err=>{
      console.log("failure")
      setError('Invalid Credentials');
      setStatus(false)
    })

  }
  return (
    <div className="container">
		
		<h1>Login</h1>
    <p style={{color:'red'}}>{error && error}</p>
		<form>
		<div className="mb-3">
			<label htmlFor="formGroupExampleInput2" className="form-label">User Id
				</label> <input type="email" className="form-control"
				name="id" value={user.id} onChange={(event)=>setuser({...user, [event.target.name]:event.target.value})}
				id="formGroupExampleInput2" placeholder="Email"/>
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
