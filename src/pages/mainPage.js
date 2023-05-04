import handleFile from "../utils/fileHandler";
import React from "react";
import getResponse from "../api/apiHandler";
import generatePrompt from "../utils/promptHandler";
import '../css/App.css';
import documentTestAttempt from "../database/dbHandler";
import SyntaxHighlighter from 'react-syntax-highlighter';
import railscasts from "react-syntax-highlighter/dist/cjs/styles/hljs/railscasts";
import {Spinner} from "react-bootstrap";

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
    const promptType = "zero-shot";
    const maxTokens = 2050;
    const temp = 1;
    let id = 4;

    React.useEffect(() => {
        if(responseReceived && saveToDatabase){
            documentTestAttempt(promptType, id++, fileContent, response, lineCoverage, branchCoverage,
                passedUnitTests, maxTokens, temp);
            setResponseReceived(false);
            setSaveToDatabase(false);
            setLineCoverage("");
            setBranchCoverage("");
            setPassedUnitTests("");
            setFileContent("");
            setResponse("");

        }
    }, [saveToDatabase])

    React.useEffect(() => {
        if(generateUnitTests) {
            getResponse(generatePrompt(fileContent, promptType), maxTokens, temp).then((data) => {
                console.log("Data is: ", data);
                setResponse(data);
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
            <h1 className="toolName">Java Unit Test Generation AI (JUTGAI)</h1>
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
                            style={railscasts}>{fileContent}
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
                            style={railscasts}>{response}
                        </SyntaxHighlighter>
                    </div>
                </div>
                <form className="testForm" onSubmit={() => {setSaveToDatabase(true);}}>
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