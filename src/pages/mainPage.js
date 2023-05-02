import handleFile from "../utils/fileHandler";
import React from "react";
import getResponse from "../api/apiHandler";
import generatePrompt from "../utils/promptHandler";

function MainPage(){
    const [fileContent, setFileContent] = React.useState("");
    const [response, setResponse] = React.useState("");

    React.useEffect(() => {
        if(fileContent.length > 0){
            getResponse(generatePrompt(fileContent)).then((data) => {
                setResponse(data);
            }).catch((err) => console.error(err));
        }
    }, [fileContent])
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