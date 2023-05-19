import React, { Component } from 'react'
import './PrefSumm.css';
export default class PreferenceSummary extends Component {

    componentDidUpdate()
    {
        console.log('component did update')
    }
    shouldComponentUpdate(nextProps, nextState)
    {

        console.log('should component update')
        console.log('next props', nextProps.prefdata.show)
        console.log('this props', this.props.prefdata.show)
        return nextProps.prefdata.show != this.props.prefdata.show;
    }

  render() {
   // console.log('pref summary')
    const {color, displayname, show} = this.props.prefdata;
    
    return (
      <div className='Modal' style={{
        transform : show ? 'translateY(0)' : 'translateY(-100vh)',
        opacity : show ? '1' : '0'
      }}>
        <h3>Preference Summary</h3>
        <p>name : {displayname}</p>
        <p>color : {color}</p>
        <button onClick={this.props.close}>Close</button>
      </div>
    )
  }
}

