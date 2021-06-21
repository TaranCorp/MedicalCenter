import './App.css';
import {BrowserRouter} from "react-router-dom"
import Header from "./Components/Header/Header";
import Content from "./Components/Content/Content";

function App() {
  return (
    <BrowserRouter>
      <Header/>
      <Content/>
    </BrowserRouter>
  );
}

export default App;
