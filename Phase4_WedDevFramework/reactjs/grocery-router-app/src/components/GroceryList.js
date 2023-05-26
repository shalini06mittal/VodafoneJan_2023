import React, { useEffect } from 'react'
import Header from './Header'
import GroceryItem from './GroceryItem'
import { Link, useSearchParams } from 'react-router-dom'

export default function GroceryList({items}) {



  let [searchParams] = useSearchParams()
  let id = Number(searchParams.get('id'))
  console.log('id', id)
  
  useEffect(()=>{

  })
  return (
    <div> 
       <div className='container'>
      <Header>
              <h3>List Of Available Items</h3>
      </Header>
      <ul>
      {
      items && items.length > 0 && 
            items.map(item =>(  
              <div key={item.id} className='row mb-2'>
              <div>Name : <Link style={
                {textDecoration:'none', 
                color:'crimson',
                borderBottom : item.id === id ? '2px solid blue': ''
            }} to={`${item.id}`}>{item.itemname}</Link></div>
            </div>
            ))
      }
      </ul>
      </div>
    </div>
  )
}
