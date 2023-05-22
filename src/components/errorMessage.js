import {Alert} from "react-bootstrap";
import React from "react";

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