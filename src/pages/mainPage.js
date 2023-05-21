import handleFile from "../utils/fileHandler";
import React from "react";
import generatePrompt from "../utils/promptHandler";
import '../css/App.css';
import documentTestAttempt from "../database/dbHandler";
import SyntaxHighlighter from 'react-syntax-highlighter';
//import railscasts from "react-syntax-highlighter/dist/cjs/styles/hljs/railscasts";
import {Spinner} from "react-bootstrap";
import {clearStateVariables} from "../utils/stateVariables";
import {countTokens} from "../utils/tokenCounter";
import handleRequest from "../api/apiHandler";
import { a11yLight } from 'react-syntax-highlighter/dist/esm/styles/hljs';
import { gradientLight } from 'react-syntax-highlighter/dist/esm/styles/hljs';


/**
 * This function represents the main page of the JUTGAI application.
 * @returns {JSX.Element} the main page
 */
function MainPage(){
    const [isLoading, setIsLoading] = React.useState(false);
    const [fileContent, setFileContent] = React.useState("");
    const [response, setResponse] = React.useState("");
    const [lineCoverage, setLineCoverage] = React.useState("");
    const [branchCoverage, setBranchCoverage] = React.useState("");
    const [passedUnitTests, setPassedUnitTests] = React.useState("");
    const [generateUnitTests, setGenerateUnitTests] = React.useState(false);
    const [saveToDatabase, setSaveToDatabase] = React.useState(false);
    const [responseReceived, setResponseReceived] = React.useState(false);
    const [explanation, setExplanation] = React.useState("");
    let promptType = "zero-shot";
    //let maxTokens = 4096 - countTokens(generatePrompt(fileContent, "stepOne"));
    let maxTokens = 4096 - countTokens(generatePrompt(fileContent, promptType));
    const temp = 1;

    React.useEffect(() => {
        if(responseReceived && saveToDatabase){
            documentTestAttempt(promptType, fileContent, response, lineCoverage, branchCoverage,
                passedUnitTests, maxTokens, temp, explanation);
            document.getElementById("result-form").reset();
            setResponseReceived(false);
            setSaveToDatabase(false);
            clearStateVariables([setLineCoverage,
                setBranchCoverage, setPassedUnitTests, setFileContent, setResponse, setExplanation]);
            promptType = "multi-step";
        }
    }, [saveToDatabase]);

    React.useEffect(() => {
        setResponse("");
    }, [fileContent])

    React.useEffect(() => {
        if(generateUnitTests) {
            handleRequest(fileContent, promptType, maxTokens, temp).then((data) => {
                if (typeof data === 'string'){
                    setResponse(response + "\n" + data);
                } else if (typeof data === 'object') {
                    setResponse(response + "\n" + data.response);
                    setExplanation(data.explanation);
                } else {
                    setResponse("Oops! Something went wrong.");
                }
            }).then(() => {
                setIsLoading(false);
                setResponseReceived(true);
            }).catch((err) => console.error(err));
            setGenerateUnitTests(false);
        }
    }, [generateUnitTests]);


    return(
        <body>
        <div>
            <h1 className="toolNameAbrev">JUTAI</h1>
            <p className="toolName">Java Unit Testing with AI</p>
            {/*<p className="underlineText">test</p>*/}
            {/*Generation Of Unit Test In Java (GOUTIJ)*/}
            <form onSubmit={(event) => {
                event.preventDefault();
                setResponse("");
                setIsLoading(true);
                setGenerateUnitTests(true);
            }}>
                <div className="inputButt">
                <input type="file"
                       id="file-input"
                       onChange={(event) => handleFile(event, setFileContent)}
                       required
                />
                </div>
                <input type="submit" value="Generate unit tests!"
                        className="testGeneratorButton" />
            </form>
            <div className="codeBlockWrapper">
                <div className="requestBlockWrapper">
                    <h3>Java class: </h3>
                    <div className="requestBlock">
                        <SyntaxHighlighter
                            wrapLines={true}
                            lineProps={{style: {whiteSpace: 'pre-wrap'}}}
                            language="java"
                            style={a11yLight}>{fileContent}
                        </SyntaxHighlighter>
                    </div>
                </div>
                <div className="responseBlockWrapper">
                    <h3>Tests: </h3>
                    <div className="responseBlock">
                        {isLoading && <Spinner animation="border" variant="light" />}
                        <SyntaxHighlighter
                            wrapLines={true}
                            lineProps={{style: {whiteSpace: 'pre-wrap'}}}
                            language="java"
                            style={a11yLight}>{response}
                        </SyntaxHighlighter>
                    </div>
                </div>
                    {/**<button className="moreTestsButton" onClick={() => { promptType = "more";
                        setIsLoading(true);
                        setGenerateUnitTests(true);
                    }}>Generate more</button>**/}
                <form className="testForm" id="result-form"
                      onSubmit={(event) =>
                      {event.preventDefault();setSaveToDatabase(true);}}>
                    <div>
                        <label className="inputSquare">
                            <p className="testText">Line Coverage</p>
                            <textarea type="text" name="name" className="inputBox" required="required"
                            onChange={(e) => setLineCoverage(e.target.value)}/>
                        </label>
                        <label className="inputSquare">
                            <p className="testText">Branch Coverage</p>
                            <textarea type="text" name="name" className="inputBox" required="required"
                            onChange={(e) => setBranchCoverage(e.target.value)}/>
                        </label>
                        <label className="inputSquare">
                            <p className="testText">Passed Unit Tests</p>
                            <textarea type="text" name="name" className="inputBox" required="required"
                            onChange={(e) => setPassedUnitTests(e.target.value)}/>
                        </label>
                    </div>
                    <input type="submit" value="Submit" className="testSubmitButt"/>
                </form>
            </div>
        </div>
        </body>
    )
} 

export default MainPage;
