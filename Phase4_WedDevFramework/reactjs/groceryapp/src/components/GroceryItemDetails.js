import React, {useState} from "react";
import GroceryEditItem from "./GroceryEditItem";

export default function GroceryItemDetails(props) {
  let { item } = props;

  // const [isedit, setIsedit] = useState(false)

  return (
    <div>
    <div className="row">
      <div className="col-md-3">
        <p>{item.name}</p>
      </div>
      <div className="col-md-3">
        <p>{item.price}/-</p>
      </div>
      <div className="col-md-3">
        <p>{item.description}</p>
      </div>
      <div className="col-md-3">
            {/* <button className="btn btn-warning" onClick={()=>setIsedit(true)}>Edit</button>  */}
            <button className="btn btn-warning" onClick={()=>props.handleEdit(item)}>Edit</button>
            &nbsp;&nbsp;
            <button className="btn btn-warning" onClick={()=>props.deleteItem(item.id)}>Delete</button>
      </div>
    </div>
    {/* {
      isedit && <GroceryEditItem itemobj={item}/>
    } */}
    
    </div>
  );
}
