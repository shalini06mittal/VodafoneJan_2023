import React, { Component } from 'react'
import './Preferences.css';
import PreferenceSummary from './PreferenceSummary';

export default class Preferences extends Component {

    constructor(props) {
      super(props)
    
      this.state = {
         displayname:"Guest",
         color:'yellow',
         show:true
      }
    }

     changeNameHandler = (e)=>{
        this.setState({displayname:e.target.value})
    }
    changeColorHandler = (e) => {
        this.setState({color: e.target.value})
    }
  render() {
    const {displayname, color} = this.state;
    return (
      <div className='preferences'>
        <h3>Select Your Preference</h3>
        <div className='form-group'>
            <label htmlFor='displayname' className='sr-only'>Enter Name</label>
            <input type='text' className='form-control' name='displayname' value={displayname}
            onChange={this.changeNameHandler}/>
        </div>
        <div className='form-group'>
            <label htmlFor='color' className='sr-only'>Choose your favorite color</label>
            <select className='form-control' name='color' value={color} onChange={this.changeColorHandler}>
                <option value='black'>Black</option>
                <option  value='red'>Red</option>
                <option  value='green'>Green</option>
                <option value='blue'>Blue</option>
                <option value='yellow'>Yellow</option>
            </select>
        </div>
        <div className='form-group'>
            <button onClick={() => this.setState({show:true})}>Save preferences</button>
        </div>
        <PreferenceSummary prefdata = {this.state}/>
      </div>
    )
  }
}
