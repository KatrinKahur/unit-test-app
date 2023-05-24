import {FileUploadButton} from "./fileUploadButton";
import {handleFile} from "../utils/fileHandler";
import {UnitTestGenerationButton} from "./unitTestGenerationButton";
import React from "react";

/**
 * This component displays the form for submitting a Java class for unit test generation
 * @param onSubmit the function called when a file is uploaded and the button forn generating unit tests is pressed
 * @param storeFileContent the submitted file
 * @param setCorrectFileType file type status, true if the file has java format, false otherwise
 * @returns {JSX.Element} The form for submitting a Java class
 */
export const UnitTestGenerationForm = ({onSubmit, storeFileContent, setCorrectFileType}) => {
    return(
        <form onSubmit={onSubmit}>
            <FileUploadButton onChange={(event) => handleFile(event, storeFileContent, setCorrectFileType)}/>
            <UnitTestGenerationButton />
        </form>
    )
}