import React from "react";
//<Link to={`/${item.id}`}>{item.itemname}</Link>
export default function About() {
  return (
    <div className="container">
      <h1>About Us</h1>
      <div className="row">
        <div className="col-md-8">
          <img
            src="https://assets.aboutamazon.com/dims4/default/d13d39a/2147483647/strip/true/crop/1279x720+0+0/resize/2640x1486!/format/webp/quality/90/?url=https%3A%2F%2Famazon-blogs-brightspot.s3.amazonaws.com%2Ffb%2F1f%2Fa53279a446ccbf19e4c881fde4f4%2Fecho-amazon-4-1.jpg"
            className="img-fluid"
          />
        </div>
        <div className="col-md-4">
        <p style={{fontSize:'1em'}}>This is a website that allows you to purchase items. Shop at the comfort of your home</p>
        <p style={{fontSize:'1em'}}>This is a website that allows you to purchase items. Shop at the comfort of your home</p>
        <p style={{fontSize:'1em'}}>This is a website that allows you to purchase items. Shop at the comfort of your home</p>
        <p style={{fontSize:'1em'}}>This is a website that allows you to purchase items. Shop at the comfort of your home</p>
        <p style={{fontSize:'1em'}}>This is a website that allows you to purchase items. Shop at the comfort of your home</p>
          </div>
      </div>
     
    </div>
  );
}
