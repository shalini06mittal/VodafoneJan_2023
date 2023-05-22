import logo from './logo.svg';
import './App.css';
import GroceryList from './components/GroceryList';
import GroceryForm from './components/GroceryForm';
import { useState } from 'react';

const initialState = [
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

function App() {

  const [items, setItems] = useState(initialState)
  const addItem = (newitem)=>{
    console.log(newitem);
    newitem.id = items.length+1;
    setItems([...items, newitem])
  }

  const deleteItem = (itemid)=>{
    console.log(itemid)
    const newItems = items.filter(item => item.id !== itemid);
    setItems(newItems);
  }
  
  return (
    <div>
      <h2 className="App">Grocery List</h2>
      <div className="container">
        <GroceryForm addItem={addItem}/>
        <GroceryList items={items} deleteItem={deleteItem}/>
      </div>
    </div>
  );
}

export default App;
