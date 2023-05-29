import logo from "./logo.svg";
import "./App.css";
import Counter from "./components/containers/Counter";
import CounterFunc from "./components/containers/CounterFunc";
import { BrowserRouter as Router, Route, Routes, Link } from "react-router-dom";
function App() {
  return (
    <>
    
    <Router>
    <ul>
        <li>
          <Link to='/'>Class Component</Link>
        </li>
        <li>
          <Link to='/func'>Functional Component</Link>
        </li>
      </ul>
      <Routes>
        <Route path='/' element={<Counter/>}></Route>
        <Route path='/func' element={<CounterFunc />}></Route>
      </Routes> 
    </Router>
    </>
  );
}
export default App;
