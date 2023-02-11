import React, { useState } from "react";

const Main = () => {
  const [click, setClick] = useState(0);
  const [text, setText] = useState("");


  const handleClick = () => {
    // setClick(click+1); esto esta mal, pero "funciona"
    setClick((prevClick) => prevClick + 1);
  };

  
  const handleChange = (e) => {
    setText(e.target.value);
  };
  return (
    <div>
      <div>
        <p>El contador es: {click}</p>
        <button
          type="button"
          className="btn btn-primary"
          onClick={handleClick}
        >
          Click me!
        </button>
      </div>

      <br />
      <div>
        <form className="row g-3">
          <div className="col-auto">
            <label for="inputPassword2" className="visually-hidden">
              Password
            </label>
            <input
              type="password"
              className="form-control"
              id="inputPassword2"
              placeholder="Password"
              onChange={handleChange}
            />
          </div>
        </form>
        El texto es: {text}
      </div>
    </div>
  );
};

export default Main;
