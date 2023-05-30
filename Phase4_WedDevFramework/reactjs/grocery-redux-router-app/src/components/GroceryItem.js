import React from "react";
import { useParams, createSearchParams, useNavigate} from "react-router-dom";

export default function GroceryItem({item}) {
  let navigate = useNavigate()
  return (
    <div className="container mt-3">
      {/* <button className="btn btn-warning" onClick={()=>
                                                navigate({pathname:'/', search:createSearchParams({id:id}).toString()})
                                              }>Go Back</button> */}
      {item !== undefined ? (
        <div className="row mt-5">
          <div className="col-md-6">
            <p>
              <img src={item.imageurl} className="img-fluid" />
            </p>
          </div>
          <div className="col-md-6">
            <p>{item.itemname}</p>
            <p>{item.price}/-</p>
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
