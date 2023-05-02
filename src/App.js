import './App.css';
import React from "react";
import { initializeApp } from "firebase/app";
import firebaseConfig from "./config/firebase";
import handleFile from "./fileHandler";
import getResponse from "./apiHandler";
import generatePrompt from "./promptHandler";


function App() {
    const [fileContent, setFileContent] = React.useState("");
    const [response, setResponse] = React.useState("");

    React.useEffect(() => {
        initializeApp(firebaseConfig);
    }, [])

    React.useEffect(() => {
        if(fileContent.length > 0){
            getResponse(generatePrompt(fileContent)).then((data) => {
                setResponse(data);
            }).catch((err) => console.error(err));
        }
    }, [fileContent])
    return (
        <>
            <input type="file"
                   id="file-input"
                   onChange={(event) => handleFile(event, setFileContent)}/>
            <h3>Response:</h3>
            <pre>{response}</pre>
        </>
    );
}

export default App;
