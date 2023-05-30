import React, { useEffect } from 'react'
//import { Link, useSearchParams } from 'react-router-dom'
import { useDispatch, useSelector } from 'react-redux'
import { fetchItems } from '../reduxclice/itemslice';
import GroceryItem from './GroceryItem';

export default function GroceryList() {

  const dispatch = useDispatch()
  const state = useSelector((state) => state.itemreducer)
  const status = state.status;
  const items = state.items;

  console.log(state)
  useEffect(()=>{
    if(status==='idle'){
        dispatch(fetchItems());
    }
  },[])
  return (
    <div> 
       <div className='container'>
          <h3>List Of Available Items</h3>
      <ul>
      {
      items && items.length > 0 && 
            items.map(item =>(  
              <div key={item.id} className='row mb-2'>
              {/* <div>Name : <Link style={
                {textDecoration:'none', 
                color:'crimson',
                borderBottom : item.id === id ? '2px solid blue': ''
            }} to={`${item.id}`}>{item.itemname}</Link></div> */}
            <GroceryItem item={item}/>
            </div>
            ))
      }
      </ul>
      </div>
    </div>
  )
}
