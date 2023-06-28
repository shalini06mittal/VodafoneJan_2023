import React, {  useState} from 'react'
import { registerUser } from '../reatapi/userapi'
import { useNavigate } from 'react-router-dom'
const initialState = {
  "username":"",
  "password":"",
  "email":""
}

export default function Register() {
  const [user, setuser] = useState(initialState)
  const [error, setError] = useState()
  let navigate = useNavigate()

  const handleSubmit = (event)=>{
    event.preventDefault();
    registerUser(user)
    .then(response => {
        console.log(response)
        navigate('/login')
    } )
    .catch(err=>{
      console.log("failure")
      setError('error', err);
    })

  }
  return (
    <div className="container">
		
		<h1>Register</h1>
    <p style={{color:'red'}}>{error && error}</p>
		<form>
		<div className="mb-3">
			<label htmlFor="formGroupExampleInput2" className="form-label">User Name
				</label> <input type="text" className="form-control"
				name="username" value={user.username} onChange={(event)=>setuser({...user, [event.target.name]:event.target.value})}
				id="formGroupExampleInput2" placeholder="Username"/>
		</div>
    <div className="mb-3">
			<label htmlFor="formGroupExampleInput2" className="form-label">User Email
				</label> <input type="email" className="form-control"
				name="email" value={user.email} onChange={(event)=>setuser({...user, [event.target.name]:event.target.value})}
				id="formGroupExampleInput2" placeholder="Email"/>
		</div>
		<div className="mb-3">
			<label htmlFor="formGroupExampleInput2" className="form-label">Password
				</label> <input type="password" className="form-control"
				name="password" value={user.password} onChange={(event)=>setuser({...user,[event.target.name]:event.target.value})}
				id="formGroupExampleInput2" placeholder="Password"/>
		</div>
		<button type="submit" className="btn btn-primary" onClick={handleSubmit}>Register</button>
		</form>
	</div>
  )
}
