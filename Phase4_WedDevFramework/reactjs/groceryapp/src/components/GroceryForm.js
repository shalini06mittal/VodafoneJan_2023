import React, {useState} from 'react'

export default function GroceryForm(props) {

    const [item, setItem] = useState({
        'name':'',
        'price':0,
        'description':'',
    })

    const [errors, setErrors] = useState({'name':'', 'price':0,'description':''})

    const [itemname, setItemname] = useState('');
    const [price, setPrice] = useState(0.0);
    const [description, setDescription] = useState('');


    const validate = ()=>
    {
        let errors = {'name':'', 'price':'', 'description':''};
        if(item.name.length === 0 || item.name === '' )
            errors.name = "Item name is required"
        
        if(item.price === 0 )
            errors.price = "Price should be greater than 0"
        
        if(item.description.length < 10 && item.description === '' )
            errors.description = "Item description is required and should be > 10"

        return errors;

    }

    const isValid = ()=>{
        return (
            errors.name.length===0 && errors.description.length===0 && errors.price.length===0
        )
    }

    const handleChangeItem =(event)=>{
        let name = event.target.name;
        let value = event.target.value;
       // console.log(name, value)
        setItem({...item, [name]:value})
        setErrors(()=>validate(item))
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
        alert(JSON.stringify(item))
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
                    name='name' value={item.name} onChange={handleChangeItem}
                    placeholder="Enter Item" aria-label="First name"/>
                    {errors.name.length===0 && 
                        <span className='error'>{errors.name}</span>
                    }
                </div>
                <div className="col">
                    <input type="text" className="form-control" 
                    name='price' value={item.price} onChange={handleChangeItem}
                    placeholder="Enter Price" aria-label="Last name"/>
                </div>
                <div className="col">
                    <input type="text" className="form-control" 
                    name='description' value={item.description} onChange={handleChangeItem}
                    placeholder="Enter Description" aria-label="Last name"/>
                </div>
            </div>
            <div className='row text-center mb-3'>
                <div className="col-12">
                    <button type="submit" 
                    disabled = {item.itemname ==='' || item.description==='' || item.price===0
                    || item.name.length==0 || item.description.length===0
                    }
                    className="btn btn-primary">ADD ITEM</button>
                </div>
            </div>
        </form>
  </div>
  )
}
