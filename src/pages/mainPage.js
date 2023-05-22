import React from "react";
import generatePrompt from "../utils/promptHandler";
import '../css/App.css';
import documentTestAttempt from "../database/dbHandler";
import {clearStateVariables} from "../utils/stateVariables";
import {countTokens} from "../utils/tokenCounter";
import handleRequest from "../api/apiHandler";
import {UnitTestGenerationForm} from "../components/unitTestGenerationForm";
import {AppTitle} from "../components/appTitle";
import {RequestBlock} from "../components/requestBlock";
import {ResponseBlock} from "../components/responseBlock";
import {DeveloperForm} from "../components/developerForm";
import {ErrorMessage} from "../components/errorMessage";


/**
 * This function represents the main page of the JUTAI application.
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
    const [correctFileType, setCorrectFileType] = React.useState(true);
    const [errorMsg, setErrorMsg] = React.useState("");
    const [showErrorMsg, setShowErrorMsg] = React.useState(false);
    const promptType = "zero-shot";
    const maxTokens = 4096 - countTokens(generatePrompt(fileContent, promptType));
    const temp = 0.5;

    function submitUnitTests(event){
        event.preventDefault();
        if(correctFileType){
            setResponse("");
            setIsLoading(true);
            setGenerateUnitTests(true);
        }
    }

    React.useEffect(() => {
        if(!correctFileType){
            setErrorMsg("Wrong file format. Please try again!")
            setShowErrorMsg(true);
        } else {
            if (showErrorMsg){
                setShowErrorMsg(false);

            }
        }
    }, [correctFileType])

    React.useEffect(() => {
        if(responseReceived && saveToDatabase){
            documentTestAttempt(promptType, fileContent, response, lineCoverage, branchCoverage,
                passedUnitTests, maxTokens, temp, explanation);
            document.getElementById("result-form").reset();
            setResponseReceived(false);
            setSaveToDatabase(false);
            clearStateVariables([setLineCoverage,
                setBranchCoverage, setPassedUnitTests, setFileContent, setResponse, setExplanation]);
        }
    }, [saveToDatabase]);

    React.useEffect(() => {
        setResponse("");
    }, [fileContent])

    React.useEffect(() => {
        if(generateUnitTests) {
            console.log("Prompt type is before: " + promptType);
            handleRequest(fileContent, promptType, maxTokens, temp).then((data) => {
                console.log("Prompt type is after: " + promptType);
                if (typeof data === 'string') {
                    setResponse(response + "\n" + data);
                } else if (typeof data === 'object') {
                    if(data.response.length > 0){
                        setResponse(response + "\n" + data.response);
                        setExplanation(data.explanation);
                    } else {
                        setResponse("Oops! Something went wrong.")
                    }
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
            <ErrorMessage message={errorMsg} show={showErrorMsg} setShow={setShowErrorMsg}/>
            <AppTitle titleOne="JUTAI" titleTwo="Java Unit Testing with AI"/>
            <UnitTestGenerationForm onSubmit={submitUnitTests}
                                    storeFileContent={setFileContent}
                                    setCorrectFileType={setCorrectFileType}/>
            <div className="codeBlockWrapper">
                <RequestBlock javaClass={fileContent}/>
                <ResponseBlock loadingStatus={isLoading} response={response}/>
                <DeveloperForm
                    onSubmit={(event) => {event.preventDefault();setSaveToDatabase(true)}}
                    setLineCoverage={setLineCoverage}
                    setBranchCoverage={setBranchCoverage}
                    setPassedUnitTests={setPassedUnitTests} />
            </div>
        </div>
        </body>
    )
} 

export default MainPage;
