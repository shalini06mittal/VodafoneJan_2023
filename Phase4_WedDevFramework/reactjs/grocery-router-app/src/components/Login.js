import React,{useState} from 'react'
import { validateUser } from '../reatapi/userapi';

const initialState = {
  "id":"1",
  "password":"shalini123"
}
export default function Login() {

  const [user, setuser] = useState(initialState)

  const handleSubmit = (event)=>{
    event.preventDefault();
    validateUser(user.id, user.password)
    .then(loggeduser => {
      console.log('success')
    } )
    .catch(err=>console.log("failure"))

  }
  return (
    <div className="container">
		
		<h1>Login</h1>
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
