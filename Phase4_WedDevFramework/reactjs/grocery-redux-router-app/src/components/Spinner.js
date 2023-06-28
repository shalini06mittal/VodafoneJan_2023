import React from "react";

const Spinner = ({ text = "", size = "5em" }) => {
  const header = text ? <h4>{text}</h4> : null;
  return (
    <div className="spinner">
      <div className="spinner-border text-warning" role="status">
        <span className="visually-hidden">{header}</span>
      </div>
    </div>
  );
};
export default Spinner;
