import React, {useState } from 'react'
import './Preferences.css';
import PreferenceSummaryFunc from './PreferenceSummaryFunc';

export default function PreferencesFunc(){
    
  const [displayname, setDisplay] = useState('Guest');
  const [color, setColor] = useState('Red');
  const [show, setShow] = useState(false);
  
  const changeHandler= (event)=>{
      let name = event.target.name;
      switch(name){
          case 'color': setColor(event.target.value)
          break;
          case 'displayname': setDisplay(event.target.value)
          break;
      }
  }
  const close=()=>{
      setShow(false)
  }
  const savePref=()=>{
      setShow(true)
  }
      return (
          <div className="preferences">
              <h1>Select your Preferences</h1>
              <p>The preferences that you choose will be saved for you.</p>
              <div className='container1'>
                  <div className='form-group'>
                  <label htmlFor="displayname" className="sr-only">Enter name to be displayed</label>
                      <input className="form-control" type='text' name='displayname'
                       value={displayname}
                      onChange={changeHandler}/>
                  </div>
                  <div className='form-group'>
                  <label htmlFor="color" className="sr-only">Enter your favorite color</label>
                      <select className="form-control" name='color' value={color}
                      onChange={changeHandler}>
                          <option>Black</option>
                          <option>Red</option>
                          <option>Green</option>
                          <option>Blue</option>
                          <option>Yellow</option>
                          </select>
                  </div>
                  <div>
                  <button onClick={savePref}>SAVE PREFERENCES</button>
                  </div>
                  
              </div>
              <PreferenceSummaryFunc prefdata={{color, displayname, show}} close={close}/>
          </div>
      )
}
