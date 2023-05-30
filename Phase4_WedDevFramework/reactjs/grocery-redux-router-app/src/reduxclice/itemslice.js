import {createSlice, createAsyncThunk} from '@reduxjs/toolkit';
const initialState = {
    items:[],
    status:"idle",
    error:''
}

export const fetchItems = createAsyncThunk('fetch/Items',async()=>{
        let response = await fetch('http://localhost:3000/items')
    return response.json()
    
})
const itemslice = createSlice({
    name:"items",
    initialState, 
    reducers:{
    },
    extraReducers(builder){
        builder.addCase(fetchItems.pending, (state, action)=>{
            state.status='loading'
        })
        builder.addCase(fetchItems.fulfilled, (state, action)=>{
            state.status = 'success';
            state.items = state.items.concat(action.payload)
        })
        builder.addCase(fetchItems.rejected, (state, action)=>{
            state.status='error'
        })
    }
})
console.log(itemslice.reducer)
export default itemslice.reducer;