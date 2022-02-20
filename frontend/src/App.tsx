import React from 'react';
import logo from './logo.svg';
import './App.css';
import axios from "axios";

function App() {

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.tsx</code> and save to reload.
        </p>
        <button onClick={function (){
          axios.get('http://localhost:5000').then(
              function (response){
                alert(response.status)
              }).catch(()=>alert("Server is not responding"))
        }
        }>request to backend</button><br/>
      </header>
    </div>
  );
}

export default App;
