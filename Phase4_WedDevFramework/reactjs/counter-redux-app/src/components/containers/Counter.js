import React, { Component } from 'react'
import CounterControl from '../output/CounterControl'
import CounterOutput from '../output/CounterOutput'
import { connect } from 'react-redux'
import { increment, decrement, addByValue, subByValue } from '../../reducers/counterreducer'

class Counter extends Component {
    // state={
    //     count:0
    // }
     handleCounterChange = (action, value)=>{
    //     switch(action){
    //         case 'inc':
    //             this.setState({count:this.state.count+1});
    //             break;
    //         case 'dec':
    //                 this.setState({count:this.state.count-1});
    //                 break;
    //         case 'add':
    //                     this.setState({count:this.state.count+value});
    //                     break;
    //         case 'sub':
    //             this.setState({count:this.state.count-value});
    //             break;
    //     }
     }
  render() {
      console.log(this.props)
    return (
      <div>
          <CounterOutput value={this.props.count}/>
          <CounterControl label='Increment' clicked={()=>this.props.onIncrement()}/>
          <CounterControl label='Decrement' clicked={()=>this.props.onDecrement()}/>
          <CounterControl label='Add 5' clicked={()=>this.props.onAddByValue(5)}/>
          <CounterControl label='Sub 3' clicked={()=>this.props.onSubByValue(3)}/>
      </div>
    )
  }
}

const mapStateOfStoreToProps = (state)=>{
  return {count : state.counterreducer.count}
}
const mapDispatchActionsToProps = (dispatch)=>{
  return {  
    onIncrement : () => dispatch(increment()),
    onDecrement : () => dispatch(decrement()),
    onAddByValue : (data) => dispatch(addByValue(data)),
    onSubByValue : (data) => dispatch(subByValue(data))
  }
}
export default connect(mapStateOfStoreToProps, mapDispatchActionsToProps)(Counter);