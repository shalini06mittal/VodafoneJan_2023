import React, { Component } from 'react'

export default class PreferenceSummary extends Component {
  render() {
    
    const {color, displayname, show} = this.props.prefdata;
    
    return (
      <div >
        <h3>Preference Summary</h3>
        <p>name : {displayname}</p>
      </div>
    )
  }
}
