import React, { Component } from 'react'
import './PrefSumm.css';
export default class PreferenceSummary extends Component {
  render() {
    
    const {color, displayname, show} = this.props.prefdata;
    
    return (
      <div className='Modal' style={{
        transform : show ? 'translateY(0)' : 'translateY(-100vh)',
        opacity : show ? '1' : '0'
      }}>
        <h3>Preference Summary</h3>
        <p>name : {displayname}</p>
        <p>color : {color}</p>
        <button onClick={this.props.close}>Close</button>
      </div>
    )
  }
}

