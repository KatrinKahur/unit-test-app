import {Alert} from "react-bootstrap";
import React from "react";

export const ErrorMessage = ({message, show, setShow}) => {

    if(message === null){
        return null
    }

    if(show){
        return (
            <Alert data-testid="error-message" style={{position: "fixed", top:10, left: 0, right: 0, zIndex: 999}} variant="secondary" onClose={() => setShow(false)} dismissible>
                <Alert.Heading>Error!</Alert.Heading>
                <p>{message}</p>
            </Alert>
        );
    }
}