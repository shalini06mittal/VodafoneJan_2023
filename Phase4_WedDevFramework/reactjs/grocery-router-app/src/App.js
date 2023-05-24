import logo from './logo.svg';
import './App.css';
import Header from './components/Header';
import { useEffect, useState } from 'react';
import NavBar from './components/NavBar';
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import GroceryList from './components/GroceryList';
import About from './components/About';
import Login from './components/Login';
import Register from './components/Register';
import Contact from './components/Contact';
/*
{
      "itemname": "Cookies",
      "price": "150",
      "description": "The ingredients of this traditional recipe are butter, white and brown sugar and semi-sweet chocolate chip cookies. These delicious cookies with chocolate chips and yet they are so crunchy that you will surely fall in love with them from the first bite",
      "imageurl": "https://m.media-amazon.com/images/I/713DwU6ONGL._SX522_.jpg",
      "id": 4
    }
    */

  /*
1. npm i react-router-dom => execute from the project folder [grocery-router-app]
2. import {BrowserRouter, Route, Routes} from 'react-router-dom'; in App.js
3. Wrap the entire content wiihtin App.js in BrowserRouter
4. Create Routes in App.js
5. Update NavBar.js for Link tag instead of <a>
6. Update GroceryList.js
  */
const initialState = []

function App() {

  const [items, setitems] = useState(initialState)

  useEffect(()=>{
    console.log('use effect')
    fetch('http://localhost:3000/items')
    .then(res => res.json())
    .then(data => setitems(data))
  },[])

  return (
    <BrowserRouter>
    <NavBar/>
      <div className="App">
          <Header>
              <h1>Fill Your Basket</h1>
            </Header> 
      </div>
      <Routes>
          <Route path='' element={<GroceryList items={items}/>}></Route>
          <Route path='/about' element={<About/>}></Route>
          <Route path='/contact' element={<Contact/>}></Route>
          <Route path='/login' element={<Login/>}></Route>
          <Route path='/register' element={<Register/>}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
