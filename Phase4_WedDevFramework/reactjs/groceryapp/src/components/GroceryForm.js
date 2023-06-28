import React, {useEffect, useState} from 'react'

const initialState ={
    'name':'',
    'price':0,
    'description':'',
}
export default function GroceryForm(props) {

    const [item, setItem] = useState(initialState)

    // error handling and validations
    const [errors, setErrors] = useState()
    const [touched, setTouched] = useState({nameTouched:false, priceTouched:false, descTouched:false})
    const [submit, setSubmit] = useState(false)
    
    const [itemname, setItemname] = useState('');
    const [price, setPrice] = useState(0.0);
    const [description, setDescription] = useState('');

    const isValid = ()=>{
        return (
           errors.name.length===0 && errors.description.length===0 && errors.price.length===0 
        )
    }
    useEffect(()=> {if(errors && isValid()) setSubmit(true) 
                else setSubmit(false)} ,[errors])

    const validate = (item)=>
    {
        let newerrors = {name:'', price:'' ,description:''};
        if(item.name.length === 0 )
            newerrors.name = "Item name is required"
        
         if(item.price === '' || item.price === 0)
            newerrors.price = "Price should be greater than 0"
        
         if(item.description === '')
            newerrors.description = "Item description is required "

        if(item.description.length < 10  ) 
         newerrors.description = "Item description should be > 10"
           // console.log(newerrors)
        setErrors(newerrors);
        
    }

    //  console.log(errors.name.length===0 || errors.description.length===0 || errors.price.length===0)
    // event handler
    const handleChangeItem =(event)=>{
        let name = event.target.name;
        let value = event.target.value; 
        console.log('value ', value)
        if(name === 'price') 
            if(value){
                console.log('if')
                value = isNaN(parseInt(value)) ? 0 : parseInt(value);
            } 
        let newitem = {...item, [name]:value}
        validate(newitem)
        setItem(newitem)
        
    }

    const handleChange =(event)=>{
        let name = event.target.name;
        let value = event.target.value;
        console.log(name, value)
        switch(name){
            case 'itemname' : setItemname(value);
            break;
            case 'price' : setPrice(value);
            break;
            case 'description' : setDescription(value);
            break;
        }
    }

    const handleSubmit = (e)=>{
        e.preventDefault();
        if(!isValid()){
            alert('Please fill in the form')
            return;
        } 
        //alert(JSON.stringify(item))
        setItem(initialState)
        props.addItem(item);
    }
    
  return (
    <div>
        {/* <div className="row mb-3">
            <div className="col">
                <input type="text" className="form-control" 
                name='itemname' value={itemname} onChange={handleChange}
                placeholder="Enter Item" aria-label="First name"/>
            </div>
            <div className="col">
                <input type="text" className="form-control" 
                name='price' value={price} onChange={handleChange}
                placeholder="Enter Price" aria-label="Last name"/>
            </div>
            <div className="col">
                <input type="text" className="form-control" 
                name='description' value={description} onChange={handleChange}
                placeholder="Enter Description" aria-label="Last name"/>
            </div>
        </div> */}
        <form onSubmit={handleSubmit}>
            <div className="row mb-3">
                <div className="col">
                    <input type="text" className="form-control" 
                    name='name' value={item.name} onChange={handleChangeItem} onBlur={()=>setTouched({...touched,nameTouched:true})}
                    placeholder="Enter Item" aria-label="First name"/>
                   <span style={styles.error}>{touched.nameTouched && errors && errors.name.length > 0 && errors.name}</span>
                </div>
                <div className="col">
                    <input type="text" className="form-control" 
                    name='price' value={item.price} onChange={handleChangeItem} onBlur={()=>setTouched({...touched,priceTouched:true})}
                    placeholder="Enter Price" aria-label="Last name"/>
                    <span style={styles.error}>{touched.priceTouched &&  errors && errors.price.length > 0 && errors.price}</span>
                </div>
                <div className="col">
                    <input type="text" className="form-control" 
                    name='description' value={item.description} onChange={handleChangeItem} onBlur={()=>setTouched({...touched, descTouched:true})}
                    placeholder="Enter Description" aria-label="Last name"/>
                    <span style={styles.error}>{touched.descTouched &&  errors && errors.description.length > 0 && errors.description}</span>
                </div>
            </div>
            <div className='row text-center mb-3'>
                <div className="col-12">
                    <button type="submit" 
                     disabled = {!submit}
                    className="btn btn-primary">ADD ITEM</button>
                </div>
            </div>
        </form>
  </div>
  )
}

const styles={
    error:{'color':'red'}
}