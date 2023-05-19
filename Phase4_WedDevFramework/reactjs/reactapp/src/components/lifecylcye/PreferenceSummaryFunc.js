import React, { useEffect} from 'react'
import './PrefSumm.css';
const choices ={
    backgroundColor:'#03DAC6',
    padding:'30px',
    color:'#3700B3'

}
const PreferenceSummaryFunc=(props)=>{
   
  const {color, displayname, show} = props.prefdata;
    // alternatively useEffect is a combination of componentDidMount and componentDidUpdate
     // But passing 2nd parameter as [], changes useEffect as componentDidMount only
    useEffect(()=>{
        console.log('component mount or update')
    },[show])

       
       console.log('summary render', show)
        return (
            <div className='Modal' style={{
                transform:show ? 'translateY(0)' :'translateY(-100vh)', 
                opacity: show ?'1':'0'
            }}>
           
            <div style={choices} >
                <h2>Your Preferences</h2>
                <div>
                    <h3 style={{color:`${color}`}}>Color : {color}</h3>
                    <h3 style={{color:`${color}`}}>Display Name : {displayname}</h3>
                </div>
                <div>
                    <button onClick={props.close}>CLOSE</button>
                </div>
                </div>
            </div>
        )
}

function areEqual(prevProps, nextProps){
    console.log(' are equal')
    return prevProps.preference.show === nextProps.preference.show
}

export default PreferenceSummaryFunc;