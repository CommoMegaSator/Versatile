import React from 'react';
import logo from './logo.svg';
import './App.css';
import axios from "axios";
import store from "./store";
import { Provider } from 'react-redux'
import { Button } from "react-bootstrap"
import './App.scss';

function App() {

  return (
    <Provider store={store}>
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo" />
                <p>
                    Edit <code>src/App.tsx</code> and save to reload.
                </p>
                <Button onClick={function (){
                    axios.get('http://localhost:5000')
                        .then(function (response) {
                            alert(response.status)
                        })
                        .catch(()=>alert("Server is not responding"))
                }
                }>request to backend</Button><br/>
            </header>
        </div>
    </Provider>
  );
}

export default App;
