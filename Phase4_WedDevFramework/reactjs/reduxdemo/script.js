//import redux from 'redux';
const redux = require('redux');
const initialState = {count:0}
const {createStore} = redux;

const INCR = 'INCR'
const DECR = 'DECR'
const ADDBYVALUE = 'ADDBYVALUE'
const SUBBYVALUE = 'SUBBYVALUE'

// action creators
const incr = ()=>{
    return {type:INCR}
}

const addbyvalue = (data)=>{
    return {type:ADDBYVALUE, payload:data}
}

function counterReducer(state = initialState, action){
    switch(action.type){
        case INCR: 
            return {...state, count : state.count+1}
        case DECR: 
            return {...state, count :state.count-1}
        case ADDBYVALUE: 
            return {...state, count :state.count + action.payload}
        case SUBBYVALUE: 
            return {...state, count :state.count - action.payload.value}
        default:
                return state;
    }
}
const store = createStore(counterReducer);
console.log(store.getState())
store.dispatch({type:'INCR'})
console.log(store.getState())
store.dispatch({type:'INCR'})
console.log(store.getState())
store.dispatch({type:'INCR'})
console.log(store.getState())
store.dispatch({type:'DECR'})
console.log(store.getState())
store.dispatch({type:'ADDBYVALUE', payload:5})
console.log(store.getState())
store.dispatch({type:'SUBBYVALUE', payload:{value:3}})
console.log(store.getState())

store.dispatch(incr())
console.log(store.getState())

store.dispatch(addbyvalue(10))
console.log(store.getState())
