import React, { Component } from 'react'
import CounterControl from '../output/CounterControl'
import CounterOutput from '../output/CounterOutput'

class Counter extends Component {
    state={
        count:0
    }
    handleCounterChange = (action, value)=>{
        switch(action){
            case 'inc':
                this.setState({count:this.state.count+1});
                break;
            case 'dec':
                    this.setState({count:this.state.count-1});
                    break;
            case 'add':
                        this.setState({count:this.state.count+value});
                        break;
            case 'sub':
                this.setState({count:this.state.count-value});
                break;
        }
    }
  render() {
      console.log(this.props)
    return (
      <div>
          <CounterOutput value={this.state.count}/>
          <CounterControl label='Increment' clicked={()=>this.handleCounterChange('inc')}/>
          <CounterControl label='Decrement' clicked={()=>this.handleCounterChange('dec')}/>
          <CounterControl label='Add 5' clicked={()=>this.handleCounterChange('add',5)}/>
          <CounterControl label='Sub 3' clicked={()=>this.handleCounterChange('sub',3)}/>
      </div>
    )
  }
}
export default Counter;