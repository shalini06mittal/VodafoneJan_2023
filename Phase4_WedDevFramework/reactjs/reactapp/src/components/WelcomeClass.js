// class based
// rcc
import React, { Component } from 'react'

export default class WelcomeClass extends Component {
    // props => to access data from the parent
  render() {
    console.log(this.props)
    let {username, city} = this.props;
    // let username = this.props.username
    // let city = this.props.city;
    return (
      <div style={{backgroundColor:'yellow'}}>
        {/* <h1>Welcome {this.props.username}</h1>
        <p>{this.props.city}</p> */}
        <h1>Welcome {username}</h1>
        <p>{city}</p>
    </div>
    )
  }
}
