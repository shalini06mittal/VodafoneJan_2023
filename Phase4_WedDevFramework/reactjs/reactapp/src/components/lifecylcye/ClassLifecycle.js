import React, { Component } from 'react'

export default class  extends Component {

    constructor(props) {
      super(props)
    
      this.state = {
        currdate: new Date().toLocaleString()
     }
    }
    
    // once
    componentDidMount()
    {
        console.log('component did mount called');
        this.intv =  setInterval(() => {
            this.updateTime();
        }, 1000);
    }
    componentDidUpdate()
    {
        console.log('component did update');
    }

    shouldComponentUpdate()
    {
        console.log('should component update');
        return true;
    }
    // once
    componentWillUnmount()
    {
        console.log('component will unmount');
        clearInterval(this.intv);
    }
    updateTime()
    {
        console.log('update time')
        this.setState({currdate : new Date().toLocaleString()})
    }
  render() {
    console.log('render')
    return (
      <div>
        <h1>Lifecycle methods of Class Component</h1>
        <p>{this.state.currdate}</p>
      </div>
    )
  }
}
