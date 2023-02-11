import React, {useState, useEffect} from "react";
import {comunication} from '../services/bodyService';

const Body = () => {
  const [results, setResults] = useState([]);
  useEffect(() => {
    comunication().then((data) => setResults(data.results));
  }, [])

  return (
    <div>kk
      <table className="table">
        <thead>
          <tr>
            <th scope="col">Numero de Personaje</th>
            <th scope="col">Personaje</th>k
          </tr>
        </thead>
        <tbody>
          {results.map((elem,index) => {
            return (
              <tr key={index}>
                <td>{elem.id}</td>
                <td>{elem.name}</td>
              </tr>
            )
            })}
        </tbody>
      </table>
    </div>
  );
};

export default Body;
