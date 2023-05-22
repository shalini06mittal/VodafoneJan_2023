import React from 'react'
import GroceryItemDetails from './GroceryItemDetails'


export default function GroceryList({items, deleteItem}) {

  return (
    <div>
        <div className='row'>
            <div className='col-md-3'>
                Item
            </div>
            <div className='col-md-3'>
                Price
            </div>
            <div className='col-md-3'>
                Description
            </div>
            <div className='col-md-3'>
                Action
            </div>
        </div>
        <hr/>
        {/* {
            items.map(item =>  (
                                <div key={item.id} className='row'>
                                    <div className='col-md-4'>
                                        <p>{item.name}</p>
                                    </div>
                                    <div className='col-md-4'>
                                        <p>{item.price}</p>
                                    </div>
                                    <div className='col-md-4'>
                                        <p>{item.description}</p>
                                    </div>
                                </div>
                            )
            )
        } */}
        {
            items.map(item => <GroceryItemDetails 
                key={item.id}  deleteItem = {deleteItem}
                item={item}/>                       
            )
        }
       
    </div>
  )
}
