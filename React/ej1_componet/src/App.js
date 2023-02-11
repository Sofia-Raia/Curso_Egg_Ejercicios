import "./App.css";
import { Route, Routes, BrowserRouter } from "react-router-dom";
import { Footer } from "./components/Footer";
import Main from "./components/Main";
import Main2 from "./components/Main2";
import { NavBar } from "./components/NavBar";
/*la funcion app es un componente*/
function App() {
  const title = "Informacion de mascotas.";
  const subtitle = "Gatos:";

  return (
    <div>
      <BrowserRouter>
        <NavBar />
        <h1>{title}</h1>
        <h2>{subtitle}</h2>
        <Routes>
          <Route exact path="main" element={<Main />} />
          <Route exact path="main2" element={<Main2 />} />
        </Routes>
      </BrowserRouter>

      <Footer />
    </div>
  );
}

export default App;
