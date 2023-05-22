import React from "react";

export default function GroceryItemDetails(props) {
  let { item } = props;
  return (
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
      <div className="col-md-3">
            <button className="btn btn-warning">Edit</button>
            &nbsp;&nbsp;
            <button className="btn btn-warning" onClick={()=>props.deleteItem(item.id)}>Delete</button>
      </div>
    </div>
  );
}
