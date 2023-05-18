import React, { useState } from 'react'

export default function ClockFunc() {

    const [currdate, setCurrDate] = useState(new Date().toLocaleString())
    const [counter, setcounter] = useState(0)
    const updateTime = ()=>
    {
         console.log(`before ${currdate}`);
         //this.state.currdate = new Date().toLocaleString();
         setCurrDate(new Date().toLocaleString())
         setcounter(counter+1)
         console.log(`after ${currdate}`);
    }
  return (
    <div>
        <h1>Clock function</h1>
        <p>{counter}</p>
        <p>{currdate}</p>

        
        <div><button onClick={updateTime}>Show Time</button></div>
    </div>
  )
}
