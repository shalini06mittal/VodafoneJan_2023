import {createSlice} from '@reduxjs/toolkit';

const initialState = { count : 10}
// thunk or middleware
export const incrementAsync = ()=>{
    return (dispatch)=> setTimeout(() => {
        console.log('times up')
        dispatch(increment())
    }, 5000); 
}

const counter = createSlice({
    name:'counter',
    initialState,
    reducers:{
        increment : (state) =>{
            state.count++;
        },
        decrement : (state) =>{
            state.count--;
        },
        addByValue : (state, action) =>{
            state.count+=action.payload;
        },
        subByValue : (state, action) =>{
            state.count-=action.payload;
        }
    }
})
// console.log(counter.actions)
// console.log(counter)
// console.log(counter.reducer)
export let {increment, decrement, subByValue, addByValue} = counter.actions
export default counter.reducer;