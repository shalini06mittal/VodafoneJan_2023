import React, { useState } from "react";
import { useParams, createSearchParams, useNavigate} from "react-router-dom";
import { onAdd } from "../reduxclice/cartslice";
import {useDispatch, useSelector} from 'react-redux';

export default function GroceryItem({item}) {
  let navigate = useNavigate()
  let dispatch = useDispatch();
  let isLoggedIn = useSelector(state => state.userreducer.isLoggedIn)
  const onAddToCart = ()=>
  {
    if(!isLoggedIn) {
      alert('Please lgin')
      navigate('/login')
    }
    else
    dispatch(onAdd(item))
  }
  return (
    <div className="container mt-3">
      {/* <button className="btn btn-warning" onClick={()=>
                                                navigate({pathname:'/', search:createSearchParams({id:id}).toString()})
                                              }>Go Back</button> */}
      {item !== undefined ? (
        <div className="row mt-5">
          <div className="col-md-6">
            <p>
              <img src={item.imageurl} className="img-fluid" />
            </p>
          </div>
          <div className="col-md-6">
            <p>{item.itemname}</p>
            <p>{item.price}/-</p>
            <p>{item.description}</p>
            <div className="">
            
        <button className="btn btn-warning" onClick={onAddToCart}>ADD TO CART</button>

        </div>  
          </div>
          
        </div>
        
      ) : (
        <div>No item yet</div>
      )}
    </div>
  );
}
