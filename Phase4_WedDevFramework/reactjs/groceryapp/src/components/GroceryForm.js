import React, {useState} from 'react'

export default function GroceryForm(props) {

    const [item, setItem] = useState({
        'name':'',
        'price':0,
        'description':'',
    })

    const [itemname, setItemname] = useState('');
    const [price, setPrice] = useState(0.0);
    const [description, setDescription] = useState('');

    const handleChangeItem =(event)=>{
        let name = event.target.name;
        let value = event.target.value;
       // console.log(name, value)
        setItem({...item, [name]:value})
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

    const handleSubmit = ()=>{
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
         <div className="row mb-3">
            <div className="col">
                <input type="text" className="form-control" 
                name='name' value={item.name} onChange={handleChangeItem}
                placeholder="Enter Item" aria-label="First name"/>
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
                <button type="submit"  onClick={handleSubmit}
                disabled = {item.itemname ==='' || item.description==='' || item.price===0}
                className="btn btn-primary">ADD ITEM</button>
            </div>
        </div>
  </div>
  )
}
