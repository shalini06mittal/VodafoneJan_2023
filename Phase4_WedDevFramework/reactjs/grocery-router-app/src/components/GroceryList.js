import React from 'react'
import Header from './Header'

export default function GroceryList({items}) {
  return (
    <div> 
       <div className='container'>
      <Header>
              <h3>List Of Available Items</h3>
      </Header>
      {items && items.length > 0 && 
            items.map(item => (
              <div key={item.id} className='row mb-5'>
                <div>Name : {item.itemname}</div>
                <div>Price : {item.price}</div>
                <div>Description : {item.description}</div>
                <div><img src={item.imageurl} width="200" className='img-fluid'/></div>
              </div>
            ))
          }
      </div>
    </div>
  )
}
