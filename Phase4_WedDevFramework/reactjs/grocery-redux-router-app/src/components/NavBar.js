import React, { useEffect , useState} from "react";
import { Link, NavLink } from "react-router-dom";
import { useDispatch, useSelector } from 'react-redux';
import './NavBar.css';
import { logoutUser } from "../reduxclice/userslice";
import { cartitems } from "../reduxclice/cartslice";
export default function NavBar() {

  const isLoggedIn = useSelector((state)=> state.userreducer.isLoggedIn);
  const dispatch = useDispatch();
  const username = useSelector((state)=> state.userreducer.username);
  const cart = useSelector(cartitems);
  console.log('navbar username', cart.length)
  console.log(cart)
  return (
    <div>
      <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <div className="container-fluid">
          <a className="navbar-brand" to="#">
            TechGatha
          </a>
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
              <li className="nav-item">
                <NavLink className="nav-link" aria-current="page" to="">
                  Home
                </NavLink>
              </li>
              <li className="nav-item">
                <NavLink className="nav-link" to="/about">
                  About 
                </NavLink>
              </li>
              {
                !isLoggedIn && 
              <li className="nav-item">
                <NavLink className="nav-link" to="/login">
                  Login 
                </NavLink>
              </li>
              }
              {
                isLoggedIn && 
              <li className="nav-item">
                <a className="nav-link" href="/" onClick={()=>dispatch(logoutUser())}>
                  Logout 
                </a>
              </li>
          }
              {
                !isLoggedIn && 
              <li className="nav-item">
                <NavLink className="nav-link" to="/register">
                  Register 
                </NavLink>
              </li>
          }
              <li className="nav-item">
                <NavLink className="nav-link" to="/contact">
                  Contact 
                </NavLink>
              </li>
            </ul>
          </div>
          
          {
                isLoggedIn &&
                <NavLink className="nav-link" to="/cart">
                            <i className="fa badge fa-lg" style={{color:'crimson'}} 
                            value={cart.length}>&#xf290;</i>
                </NavLink>        
      }
          {
                isLoggedIn && 
          <div><NavLink className="nav-link" to={`/profile/${username}`}>
                  {username} 
                </NavLink></div>
        }
        </div>
      </nav>
    </div>
  );
}
