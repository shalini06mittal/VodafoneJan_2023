import logo from './logo.svg';
import './App.css';
import GroceryList from './components/GroceryList';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import NavBar from './components/NavBar';
function App() {
  return (
    <BrowserRouter>
    <NavBar/>
      <Routes>
        <Route path='/' element={<GroceryList/>}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
