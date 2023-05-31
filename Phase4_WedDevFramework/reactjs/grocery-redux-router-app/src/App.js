import logo from './logo.svg';
import './App.css';
import GroceryList from './components/GroceryList';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import NavBar from './components/NavBar';
import About from './components/About';
import Login from './components/Login';
import Contact from './components/Contact';
import Profile from './components/Profile';
import Register from './components/Register';
/**
 Cart.js => display the cart items if lenth is > 0 else display a message No items added in the cart
 cartslice.js => initialstate{cartitems:[]} , addItem
 GroceryItem.js => add a button for ADD TO CART => call the addItem of cartslice
 */
function App() {

  return (
    <BrowserRouter>
    <NavBar/>
      <Routes>
        <Route path='/' element={<GroceryList/>}></Route>
        <Route path='/about' element={<About/>}></Route>
          <Route path='/contact' element={<Contact/>}></Route>
          <Route path='/login' element={<Login/>}></Route>
          <Route path='/register' element={<Register/>}></Route>
          <Route path='/profile/:username' element={<Profile/>}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
