import {Spinner} from "react-bootstrap";
import SyntaxHighlighter from "react-syntax-highlighter";
import React from "react";
import {a11yLight} from "react-syntax-highlighter/dist/esm/styles/hljs";

export const ResponseBlock = ({loadingStatus, response}) => {
    return(
        <div className="responseBlockWrapper">
            <h3>Tests: </h3>
            <div className="responseBlock">
                {loadingStatus && <Spinner animation="border" variant="secondary" />}
                <SyntaxHighlighter
                    wrapLines={true}
                    lineProps={{style: {whiteSpace: 'pre-wrap'}}}
                    language="java"
                    style={a11yLight}>{response}
                </SyntaxHighlighter>
            </div>
        </div>
    )
}