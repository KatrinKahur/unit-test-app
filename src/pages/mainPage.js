import handleFile from "../utils/fileHandler";
import React from "react";
import getResponse from "../api/apiHandler";
import generatePrompt from "../utils/promptHandler";
import '../css/App.css';

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
        <div>
            <h1 className="toolName">Java Unit Test Generation AI (JUTGAI)</h1>
            {/*Generation Of Unit Test In Java (GOUTIJ)*/}
            <div className="inputButt">
                <input type="file"
                    id="file-input"
                    onChange={(event) => handleFile(event, setFileContent)}/>
            </div>
            <h3 className="responseTitle">Response:</h3>
            <div className="responseBlock">
                <pre>{response}</pre>
            </div>
        </div>
    )
} 

export default MainPage;