import React, { useState } from 'react'
import CounterControl from '../output/CounterControl'
import CounterOutput from '../output/CounterOutput'
import { useDispatch, useSelector } from 'react-redux'
import { addByValue, decrement, increment, subByValue , incrementAsync} from '../../reducers/counterreducer'

export default function CounterFunc() {
    const [value, setValue] = useState(0)

    //const [count, setcount] = useState(0)

    const dispatch = useDispatch()
    const count = useSelector((state)=> state.counterreducer.count)

  return (
    <div>
        <h1>Functional Component</h1>
          <CounterOutput value={count}/>
          <div>
              <input type='text' style={{
                  margin:'20px',
                  width:'80px',
                  height:'30px',
                  textAlign:'center'
              }}
              value={value} onChange={(e)=>setValue(Number(e.target.value))}/>
          </div>
          <CounterControl label='Increment' clicked={()=>dispatch(increment())}/>
          <CounterControl label='Increment Async' clicked={()=>dispatch(incrementAsync())}/>
          <CounterControl label='Decrement'clicked={()=>dispatch(decrement())} />
          <CounterControl label='Add ' clicked={()=>dispatch(addByValue(value))}/>
          <CounterControl label='Sub ' clicked={()=>dispatch(subByValue(value))}/>
      </div>
  )
}
