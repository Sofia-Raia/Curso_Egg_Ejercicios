import React, { Component } from "react";
import { Card } from "./Card";

export default class Main2 extends Component {
  constructor(props) {
    super(props);
  }
  componentDidMount() {}
  render() {
    return (
      <div>
        <Card name="Olivia" photo="./img/olivia.jpg" description="Esta es la gata de mi mama, es gris y viejita."/>
      </div>
    );
  }
}
