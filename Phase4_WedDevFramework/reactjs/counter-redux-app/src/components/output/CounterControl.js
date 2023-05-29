import React from 'react'
import './CounterControl.css';

// +, -, add(5), subtract
export default function CounterControl(props) {
  return (
    <div className='control' onClick={props.clicked}>
        {props.label}
    </div>
  )
}
