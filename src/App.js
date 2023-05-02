import './css/App.css';
import React from "react";
import { initializeApp } from "firebase/app";
import firebaseConfig from "./config/firebase";
import MainPage from "./pages/mainPage";


function App() {
    initializeApp(firebaseConfig);
    return (
        <MainPage />
    );
}

export default App;
