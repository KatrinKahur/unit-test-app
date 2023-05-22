import {FileUploadButton} from "./fileUploadButton";
import {handleFile} from "../utils/fileHandler";
import {UnitTestGenerationButton} from "./unitTestGenerationButton";
import React from "react";

export const UnitTestGenerationForm = ({onSubmit, storeFileContent, setCorrectFileType}) => {
    return(
        <form onSubmit={onSubmit}>
            <FileUploadButton onChange={(event) => handleFile(event, storeFileContent, setCorrectFileType)}/>
            <UnitTestGenerationButton />
        </form>
    )
}