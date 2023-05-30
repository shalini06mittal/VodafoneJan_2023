import React, { useEffect } from 'react'
//import { Link, useSearchParams } from 'react-router-dom'
import { useDispatch, useSelector } from 'react-redux'
import { fetchItems } from '../reduxclice/itemslice';
import GroceryItem from './GroceryItem';
import Spinner from './Spinner';

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
  let content = ''
  if(status === 'loading'){
    content = <Spinner text="Loading..." />;
  }
  else if(status==='success'){
  content = (<div className='container'>
                <h3>List Of Available Items</h3>
                { items.map(item => <GroceryItem key={item.id} item={item}/>)}
            </div>
            )
            }
  return (
   
    <div> {content}
       
    </div>
  )
}
