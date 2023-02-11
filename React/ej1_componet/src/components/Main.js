import React, { Component } from "react";
import { Card } from "./Card";

export default class Main extends Component {
  constructor(props) {
    super(props);
  }
  componentDidMount() {}
  render() {
    return (
      <div>
        <Card name="Gino" photo="./img/gino.jpeg" description="Este es mi gato, es blanco y gris." />
      </div>
    );
  }
}

/* export default Main
 
 export function Main() {
  return (
    <div className="card" style={{width: "18rem"}}>
      <img src="/img/gino.jpeg" className="card-img-top" alt="..." />
      <div className="card-body">
        <h5 className="card-title">GINO</h5>
        <p className="card-text">
          Some quick example text to build on the card title and make up the
          bulk of the card's content.
        </p>
        <a href="#" className="btn btn-primary">
          Go somewhere
        </a>
      </div>
    </div>
  );
}*/
