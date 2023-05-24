import {Alert} from "react-bootstrap";
import React from "react";

/**
 * This component represents an error message displayed by JUTAI.
 * @param message The contents of the error message displayed to the user
 * @param show The status of whether the message should be shown or not
 * @param setShow The callback that sets the status of the show variable
 * @returns {JSX.Element|null} The error message component
 */
export const ErrorMessage = ({message, show, setShow}) => {

    if(message === null){
        return null
    }

    if(show){
        return (
            <Alert data-cy="error-message" style={{position: "fixed", top:'6%', left: '60%', right: '10%', zIndex: 999}} variant="danger" onClose={() => setShow(false)} dismissible>
                <Alert.Heading>Error!</Alert.Heading>
                <p>{message}</p>
            </Alert>
        );
    }
}