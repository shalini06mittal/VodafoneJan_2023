import logo from './logo.svg';
import './App.css';
import Header from './components/Header';
import { useEffect, useState } from 'react';
/*
{
      "itemname": "Cookies",
      "price": "150",
      "description": "The ingredients of this traditional recipe are butter, white and brown sugar and semi-sweet chocolate chip cookies. These delicious cookies with chocolate chips and yet they are so crunchy that you will surely fall in love with them from the first bite",
      "imageurl": "https://m.media-amazon.com/images/I/713DwU6ONGL._SX522_.jpg",
      "id": 4
    }
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
    <>
      <div className="App">
          <Header title="Grocery List"/>
      </div>
      <div className='container'>
      {items.length > 0 && 
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
    </>
  );
}

export default App;
