// functional based
// rfc
import React from 'react'
import WelcomeClass from './WelcomeClass'
import './Welcome.css'
export default function WelcomeFunc(props) {
    console.log(props)
  return (
    <div style={styles.main}>
            <WelcomeClass/>
            <h1 className='head'>Welcome {props.username}</h1>
        <p>{props.city}</p>
        </div>
  )
}

const styles = {
    main:{
        backgroundColor:'lightgreen',
        padding:'6px',
        color:'black',
        borderBottom:'3px solid black'
    },
    text:{
        fontSize:'16px',
        color:'red'
    }
}