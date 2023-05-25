import React, { useState } from "react";
import { useParams } from "react-router-dom";
import { getItemById } from "../reatapi/itemsapi";

export default function GroceryItem() {
  let { id } = useParams();
  id = Number(id);
  let item = getItemById(id);
  return (
    <div className="container">
      {item !== undefined ? (
        <div className="row mt-5">
          <div className="col-md-6">
            <p>
              <img src={item.imageurl} className="img-fluid" />
            </p>
          </div>
          <div className="col-md-6">
            <p>{item.itemname}</p>
            <p>{item.price}</p>
            <p>{item.description}</p>
          </div>
        </div>
      ) : (
        <div>No item yet</div>
      )}
      {/* <div className="col-md-3">
            
            <button className="btn btn-warning" onClick={()=>props.handleEdit(item)}>Edit</button>
            &nbsp;&nbsp;
            <button className="btn btn-warning" onClick={()=>props.deleteItem(item.id)}>Delete</button>
      </div> */}
    </div>
  );
}
