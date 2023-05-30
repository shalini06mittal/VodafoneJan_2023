import {createSlice, createAsyncThunk} from '@reduxjs/toolkit';
const initialState = {
    status:'failure',
    username:''
}

export const loginUser = createAsyncThunk('login/User',async(user)=>{
    let response = await fetch(`http://localhost:3000/users?username=${user.username}`)
    let fetchuser = response.json()
    if(fetchuser.length > 0 && fetchuser[0].password === user.password)
        return Promise.resolve(fetchuser[0].username)
    Promise.reject('error')
})