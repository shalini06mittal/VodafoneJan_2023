import {configureStore} from '@reduxjs/toolkit';
import itemreducer from './reduxclice/itemslice';

export default configureStore({
    reducer:{
        itemreducer
    }
});