import {configureStore} from '@reduxjs/toolkit';
import itemreducer from './reduxclice/itemslice';
import userreducer from './reduxclice/userslice'
import cartreducer from './reduxclice/cartslice'
export default configureStore({
    reducer:{
        itemreducer, 
        userreducer,
        cartreducer
    }
});