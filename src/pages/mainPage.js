import handleFile from "../utils/fileHandler";
import React from "react";
import getResponse from "../api/apiHandler";
import generatePrompt from "../utils/promptHandler";
import '../css/App.css';
import documentTestAttempt from "../database/dbHandler";
import SyntaxHighlighter from 'react-syntax-highlighter';
import railscasts from "react-syntax-highlighter/dist/cjs/styles/hljs/railscasts";

function MainPage(){
    const [fileContent, setFileContent] = React.useState("");
    const [response, setResponse] = React.useState("");
    const [sendRequest, setSendRequest] = React.useState(false);
    const [responseReceived, setResponseReceived] = React.useState(false);

    React.useEffect(() => {
        if(sendRequest) {
            if(fileContent.length > 0){
                setResponse("");
                getResponse(generatePrompt(fileContent)).then((data) => {
                    setResponse(data);
                }).then(() => setResponseReceived(true)).catch((err) => console.error(err));
            }
            setSendRequest(false);
        }
    }, [sendRequest])

    React.useEffect(() => {
        if(responseReceived){
            documentTestAttempt("zero-shot", fileContent, response);
            setResponseReceived(false);
        }
    }, [responseReceived])
    return(
        <div>
            <h1 className="toolName">Java Unit Test Generation AI (JUTGAI)</h1>
            {/*Generation Of Unit Test In Java (GOUTIJ)*/}
            <div className="inputButt">
                <input type="file"
                    id="file-input"
                    onChange={(event) => handleFile(event, setFileContent)}/>
            </div>
            <button type="button"
                    className="testGeneratorButton"
                    onClick={() => setSendRequest(true)}>
                Generate unit tests!
            </button>
            <div className="codeBlockWrapper">
                <div className="requestBlockWrapper">
                    <h3>Java class: </h3>
                    <div className="requestBlock">
                        <SyntaxHighlighter language="java" style={railscasts}>{fileContent}</SyntaxHighlighter>
                    </div>
                </div>
                <div className="responseBlockWrapper">
                    <h3>Tests: </h3>
                    <div className="responseBlock">
                        <SyntaxHighlighter language="java" style={railscasts}>{response}</SyntaxHighlighter>
                    </div>
                </div>
            </div>
        </div>
    )
} 

export default MainPage;