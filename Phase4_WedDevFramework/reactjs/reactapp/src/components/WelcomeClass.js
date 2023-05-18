// class based
// rcc
import React, { Component } from 'react'

import './Welcome.css'

export default class WelcomeClass extends Component {
    // props => to access data from the parent
  render() {
    console.log(this.props)
    let {username, city} = this.props;
    // let username = this.props.username
    // let city = this.props.city;
    return (
    //   <div style={{backgroundColor:'yellow'}}>
    <div style={styles.main} id="main">
        {/* <h1>Welcome {this.props.username}</h1>
        <p>{this.props.city}</p> */}
        <h1 className='head'>Welcome {username}</h1>
        <p style={styles.text}>{city}</p>
    </div>
    )
  }
}
const styles = {
    main:{
        backgroundColor:'lightyellow',
        padding:'6px',
        color:'black',
        borderBottom:'3px solid black'
    },
    text:{
        fontSize:'16px',
        color:'red'
    }
}
