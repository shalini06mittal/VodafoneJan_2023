import React, { useState } from 'react'
import CounterControl from '../output/CounterControl'
import CounterOutput from '../output/CounterOutput'

export default function CounterFunc() {
    const [value, setValue] = useState(0)
    const [count, setcount] = useState(0)

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
          <CounterControl label='Increment' clicked={()=>setcount(count+1)}/>
          <CounterControl label='Decrement'clicked={()=>setcount(count-1)} />
          <CounterControl label='Add ' clicked={()=>setcount(count + (value))}/>
          <CounterControl label='Sub ' clicked={()=>setcount(count - value)}/>
      </div>
  )
}
