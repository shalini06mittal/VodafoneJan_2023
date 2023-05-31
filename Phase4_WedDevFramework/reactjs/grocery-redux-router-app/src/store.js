import {configureStore} from '@reduxjs/toolkit';
import itemreducer from './reduxclice/itemslice';
import userreducer from './reduxclice/userslice'

export default configureStore({
    reducer:{
        itemreducer, 
        userreducer,
        
    }
});