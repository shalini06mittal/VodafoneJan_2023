import {createSlice} from '@reduxjs/toolkit';

const initialState = { count : 0}

const counter = createSlice({
    name:'counter',
    initialState,
    reducers:{
        increment : (state) =>{
            state.count++;
        }
    }
})
console.log(counter.actions)
console.log(counter)
console.log(counter.reducer)
export let {increment} = counter.actions
export default counter.reducer;