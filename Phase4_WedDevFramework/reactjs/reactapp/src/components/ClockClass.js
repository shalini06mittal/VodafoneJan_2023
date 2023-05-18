import React, { Component } from 'react'

export default class ClockClass extends Component {

    constructor(props) {
      super(props)
      this.state = {
         currdate: new Date().toLocaleString()
      }
    }
    // updateTime = ()=>
    // {
    //     console.log(this)
    //     // console.log(`before ${this.state.currdate}`);
    //     // this.state.currdate = new Date().toLocaleString();
    //     // console.log(`after ${this.state.currdate}`);
    // }
    updateTime()
    {
        console.log(this)
        console.log(`before ${this.state.currdate}`);
        //this.state.currdate = new Date().toLocaleString();
        this.setState({currdate : new Date().toLocaleString()})
        console.log(`after ${this.state.currdate}`);
    }
  render() {
    return (
      <div>
        <p>{this.state.currdate}</p>
        {/* <div><button onClick={this.updateTime}>Show current time</button></div> */}
        <div><button onClick={()=>this.updateTime()}>Show current time</button></div>
      </div>
    )
  }
}
