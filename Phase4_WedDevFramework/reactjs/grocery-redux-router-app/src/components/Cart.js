import React, { useEffect } from "react";
import { cartitems, onAdd, onRemove } from "../reduxclice/cartslice";
import { useDispatch, useSelector } from "react-redux";
import './Cart.css'
import { useNavigate } from "react-router-dom";

export default function Cart() {
  let navigate = useNavigate()
  let cart = useSelector(cartitems);
  let dispatch = useDispatch()
  let isLoggedIn = useSelector((state)=> state.userreducer.isLoggedIn)

  const itemsPrice = cart.reduce((a, c) => a + c.qty * Number(c.price), 0);
  const taxPrice = itemsPrice * 0.14;
  const shippingPrice = itemsPrice > 2000 ? 0 : 20;
  const totalPrice = itemsPrice + taxPrice + shippingPrice;
  
  const onRemoveItem = (item) => {dispatch(onRemove (item))};
  const onAddItem = (item) => {dispatch(onAdd(item))};

  useEffect(()=>{
    if(!isLoggedIn){
      navigate('/login')
    }
  },[])
  return (
    <aside className="container mt-5">
      <h2 className="text-center">Cart Items</h2>
      <div>
        {cart.length === 0 && <div>Cart is empty</div>}
        {cart.map((item) => (
          <div key={item.id} className="row mb-3">
            <div className="col-4">{item.itemname}</div>
            <div className="col-2">
              <button onClick={() => onRemoveItem(item)} className="remove">
                -
              </button>{"     "}
              <button onClick={() => onAddItem(item)} className="add">
                +
              </button>
            </div>

            <div className="col-2 text-right">
             {item.qty} x ${Number(item.price).toFixed(2)}
            </div>
          </div>
        ))}

        {cart.length !== 0 && (
          <>
            <hr></hr>
            <div className="row">
              <div className="col-4"></div>
              <div className="col-2">Items Price</div>
              <div className="col-1 text-right">${itemsPrice.toFixed(2)}</div>
            </div>
            <div className="row">
            <div className="col-4"></div>
              <div className="col-2">Tax Price</div>
              <div className="col-1 text-right">${taxPrice.toFixed(2)}</div>
            </div>
            <div className="row">
            <div className="col-4"></div>
              <div className="col-2">Shipping Price</div>
              <div className="col-1 text-right">
                ${shippingPrice.toFixed(2)}
              </div>
            </div>

            <div className="row">
            <div className="col-4"></div>
              <div className="col-2">
                <strong>Total Price</strong>
              </div>
              <div className="col-1 text-right">
                <strong>${totalPrice.toFixed(2)}</strong>
              </div>
            </div>
            <hr />
            <div className="text-center">
              <button onClick={() => alert("Implement Checkout!")} className="btn btn-success">
                Checkout
              </button></div>
          </>
        )}
      </div>
    </aside>
  );
}
