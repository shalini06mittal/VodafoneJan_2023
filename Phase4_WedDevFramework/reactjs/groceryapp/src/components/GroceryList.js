import React, {useEffect, useState} from 'react'
import GroceryItemDetails from './GroceryItemDetails'
import GroceryEditItem from './GroceryEditItem'

export default function GroceryList({items, deleteItem, editItem}) {

    // editformcomponent will be displayed if isedit = true
    const [isedit, setIsedit] = useState(false)
    const [itemobj, setItemobj] = useState({})


    const handleEdit =(item)=>{
       // console.log('handle edit' ,item);
        let newitem = {...item}
        setItemobj(newitem)
        setIsedit(true)
    }
    
    const hideEdit = (item)=>{
        setIsedit(false);
        editItem(item);
    }
    const cancel=()=>{
        setIsedit(false)
    }
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
                key={item.id}  deleteItem = {deleteItem} handleEdit={handleEdit}
                item={item}/>                       
            )
        }
       <hr/>
       {isedit && <GroceryEditItem itemobj={itemobj} cancel={cancel} hideEdit={hideEdit}/>}
    </div>
  )
}
