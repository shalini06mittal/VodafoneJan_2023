import logo from './logo.svg';
import './App.css';
import GroceryList from './components/GroceryList';

function App() {
  return (
    <div>
      <h2 className="App">Grocery List</h2>
      <div className="container">
        <GroceryList/>
      </div>
    </div>
  );
}

export default App;
