import React from 'react'
import Header from './Header'
import GroceryItem from './GroceryItem'
import { Link } from 'react-router-dom'

export default function GroceryList({items}) {
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
              <div key={item.id} className='row mb-5'>
              <div>Name : <Link to={`${item.id}`}>{item.itemname}</Link></div>
            </div>
            ))
      }
      </ul>
      </div>
    </div>
  )
}
