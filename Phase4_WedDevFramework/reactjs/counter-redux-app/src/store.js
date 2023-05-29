import {configureStore} from '@reduxjs/toolkit';
import counterreducer from './reducers/counterreducer';

export default configureStore({
    reducer:{
        counterreducer
    }
})