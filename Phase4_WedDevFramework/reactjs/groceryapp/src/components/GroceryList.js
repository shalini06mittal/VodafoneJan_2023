import React from 'react'
import GroceryItemDetails from './GroceryItemDetails'

const items = [
    {
        'id':1,
        'name':'Milk',
        'price':50,
        'description':'Amul milk good for health'
    },
    {
        'id':2,
        'name':'Bread',
        'price':40,
        'description':'Wibs Wheat bread'
    },
    {
        'id':3,
        'name':'Cookies',
        'price':150,
        'description':'Good Day chocolate chip cookies'
    },
    {
        'id':4,
        'name':'Potatoes',
        'price':60,
        'description':'Frresh and organic'
    },
]

export default function GroceryList() {

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
                key={item.id} 
                item={item}/>                       
            )
        }
       
    </div>
  )
}
