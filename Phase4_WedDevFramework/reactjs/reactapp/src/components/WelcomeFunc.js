// functional based
// rfc
import React from 'react'
import WelcomeClass from './WelcomeClass'

export default function WelcomeFunc(props) {
    console.log(props)
  return (
    <div style={{backgroundColor:'lightcoral',
        padding:'10px'}}>
            <WelcomeClass/>
            <h1>Welcome {props.username}</h1>
        <p>{props.city}</p>
        </div>
  )
}
