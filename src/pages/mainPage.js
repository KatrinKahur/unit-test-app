import handleFile from "../utils/fileHandler";
import React from "react";
import getResponse from "../api/apiHandler";
import generatePrompt from "../utils/promptHandler";
import documentTestAttempt from "../database/dbHandler";

function MainPage(){
    const [fileContent, setFileContent] = React.useState("");
    const [response, setResponse] = React.useState("");
    const [responseReceived, setResponseReceived] = React.useState(false)

    React.useEffect(() => {
        if(fileContent.length > 0){
            getResponse(generatePrompt(fileContent)).then((data) => {
                setResponse(data);
            }).then(() => setResponseReceived(true)).catch((err) => console.error(err));
        }
    }, [fileContent])

    React.useEffect(() => {
        if(responseReceived){
            documentTestAttempt("zero-shot", fileContent, response);
            setResponseReceived(false);
        }
    }, [responseReceived])
    return(
        <>
            <input type="file"
                   id="file-input"
                   onChange={(event) => handleFile(event, setFileContent)}/>
            <h3>Response:</h3>
            <pre>{response}</pre>
        </>
    )
}

export default MainPage;