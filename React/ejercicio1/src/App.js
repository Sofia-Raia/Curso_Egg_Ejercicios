import React from "react";
import { BrowserRouter } from "react-router-dom";
import About from "./pages/About";
import Home from "./pages/Home";
import PageNotFound from "./pages/PageNotFound";
import "./App.css";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import { Navigate } from "react-router-dom";
import Users from './pages/Users';
import Body from "./components/Body";

function App() {
  return (
    <Body />





    /*
    <BrowserRouter>
      <div className="App">
        <Routes>
          <Route exact path='/' element={<Home />} />
          <Route exact path='/about' element={<About />} />
          <Route exact path='*' element={<PageNotFound />} />
          <Route exact path='/redirect' element={<Navigate to={"/"} />} />
          <Route exact path='/users/:id' element={<Users />} />
        </Routes>
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/asd">PageNotFound</Link>
            </li>
            <li>
              <Link to="/users">Users</Link>
            </li>
            <li>
              <Link to="/users/1">Users id 1</Link>
            </li>
          </ul>
        </nav>
      </div>
    </BrowserRouter>*/

  );
}
export default App;
