import React, { Component } from 'react'
import './Preferences.css';
import PreferenceSummary from './PreferenceSummary';

export default class Preferences extends Component {

    constructor(props) {
      super(props)
    
      this.state = {
         displayname:"Guest",
         color:'yellow',
         show:false
      }
    }

     changeNameHandler = (e)=>{
        this.setState({displayname:e.target.value})
    }
    changeColorHandler = (e) => {
        this.setState({color: e.target.value})
    }
    close = ()=>{
        this.setState({show:false})
    }
  render() {
    const {displayname, color, show} = this.state;
    return (
      <div className='preferences'>
        <h3>Select Your Preference </h3>
        <div className='mb-3'>
            <label htmlFor='displayname' className='sr-only'>Enter Name</label>
            <input type='text' className='form-control' name='displayname' value={displayname}
            onChange={this.changeNameHandler}/>
        </div>
        <div className='mb-3'>
            <label htmlFor='color' className='sr-only'>Choose your favorite color</label>
            <select className='form-control' name='color' value={color} onChange={this.changeColorHandler}>
                <option value='black'>Black</option>
                <option  value='red'>Red</option>
                <option  value='green'>Green</option>
                <option value='blue'>Blue</option>
                <option value='yellow'>Yellow</option>
            </select>
        </div>
        <div className='mb-3'>
            <button className='btn btn-primary' onClick={() => this.setState({show:true})}>Save preferences</button>
        </div>
        <PreferenceSummary close={this.close} prefdata = {this.state}/>
      </div>
    )
  }
}
