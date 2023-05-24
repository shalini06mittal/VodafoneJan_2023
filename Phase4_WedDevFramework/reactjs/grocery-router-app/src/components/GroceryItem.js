import React, {useState} from "react";
import GroceryEditItem from "./GroceryEditItem";

export default function GroceryItem() {
  
    let item= undefined

  // const [isedit, setIsedit] = useState(false)

  return (
    <div>
        { item !== undefined ? (
                    <div className="row">
                        <div className="col-md-3">
                             <p>{item.name}</p>
                        </div>
                        <div className="col-md-3">
                             <p>{item.price}</p>
                        </div>
                        <div className="col-md-3">
                            <p>{item.description}</p>
                        </div>
                    </div>
                )
                : <div>No item yet</div>
        }
    
      {/* <div className="col-md-3">
            
            <button className="btn btn-warning" onClick={()=>props.handleEdit(item)}>Edit</button>
            &nbsp;&nbsp;
            <button className="btn btn-warning" onClick={()=>props.deleteItem(item.id)}>Delete</button>
      </div> */}
    </div>
  );
}
