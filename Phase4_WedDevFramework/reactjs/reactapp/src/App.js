import logo from './logo.svg';
import './App.css';
import WelcomeClass from './components/WelcomeClass';
import WelcomeFunc from './components/WelcomeFunc';
import ClockClass from './components/ClockClass';
import ClockFunc from './components/ClockFunc';
import Login from './components/Login';
import ClassLifecycle from './components/lifecylcye/ClassLifecycle';
import { useState } from 'react';
import Preferences from './components/lifecylcye/Preferences';
// JSX -> component
function App() {
  let username = 'VodaFone';
  const [selected, setselected] = useState(true);

  return (
    <div className="App">
      <Preferences/>
      {/* {selected ? <ClassLifecycle/> : <h3>Component Unmouonted</h3>}
      <input type='checkbox' checked={selected} onChange={()=>setselected(!selected)}/> */}
      {/* <Login/>
      <ClockClass/>
      <ClockFunc/> */}
      {/* data is always passed from parent to child */}
      {/* <WelcomeClass username={username} 
      city ="Mumbai"/>
      <WelcomeFunc username={username} 
      city ="Pune"/> */}
      {/* JSX expression {} */}
      {/* <p>{new Date().toLocaleString()}</p>
      <p>Sqrt of 16 : {Math.sqrt(16)}</p> */}
    </div>
  );
}

export default App;
