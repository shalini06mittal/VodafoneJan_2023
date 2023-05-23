import React , {useState, useEffect} from 'react'

export default function GroceryEditItem({itemobj, cancel, hideEdit}) {

    const [item, setItem] = useState(itemobj);

    console.log('edit component ', itemobj)
    
    useEffect(()=>{
        console.log('use effect')
        setItem(itemobj)
    },[itemobj]);

    const handleChangeItem =(event)=>{
        let name = event.target.name;
        let value = event.target.value; 
        if(name === 'price') 
            if(value){
                console.log('if')
                value = isNaN(parseInt(value)) ? 0 : parseInt(value);
            } 
        let newitem = {...item, [name]:value}
        setItem(newitem)
        
    }

    const handleSubmit = (e)=>{
        e.preventDefault();
        hideEdit(item);
    }

  return (
    <div>
        <form onSubmit={handleSubmit}>
            <div className="row mb-3">
                <div className="col">
                    <input type="text" className="form-control" 
                    name='name' 
                    value={item.name} onChange={handleChangeItem}
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
                    <button type="submit" 
                    className="btn btn-primary">EDIT ITEM</button>
                    &nbsp;&nbsp;
                    <button type="submit" 
                    className="btn btn-primary" onClick={()=>cancel(true)}>CANCEL ITEM</button>
                </div>
            </div>
        </form>
    </div>
  )
}
