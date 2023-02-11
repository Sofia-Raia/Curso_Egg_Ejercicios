import React from "react";

 export function Card(props) {
  return (
    <div className="card" style={{ width: "18rem",float: "left" }}>
    <img src={props.photo} className="card-img-top" alt="..." />
     <div className="card-body">
       <h5 className="card-title">{props.name}</h5>
       <p className="card-text">
         {props.description}
       </p>
       <a href="#" className="btn btn-primary">
         Go somewhere
       </a>
     </div>
   </div>
  );
};
