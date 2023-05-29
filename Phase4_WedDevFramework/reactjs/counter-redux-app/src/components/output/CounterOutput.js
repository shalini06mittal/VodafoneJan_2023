import React from 'react'
const styles={
    width:'100%',
    backgroundColor: '#fa923f',
    color:'white',
    fontSize:'1.8rem',
    padding:'20px'
}
export default function CounterOutput(props) {
  return (
    <div style={styles}>
        Current Counter : {props.value}
    </div>
  )
}
