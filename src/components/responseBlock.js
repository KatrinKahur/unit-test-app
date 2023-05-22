import {Spinner} from "react-bootstrap";
import SyntaxHighlighter from "react-syntax-highlighter";
import railscasts from "react-syntax-highlighter/dist/cjs/styles/hljs/railscasts";
import React from "react";

export const ResponseBlock = ({loadingStatus, response}) => {
    return(
        <div className="responseBlockWrapper">
            <h3>Tests: </h3>
            <div className="responseBlock">
                {loadingStatus && <Spinner animation="border" variant="light" />}
                <SyntaxHighlighter
                    wrapLines={true}
                    lineProps={{style: {whiteSpace: 'pre-wrap'}}}
                    language="java"
                    style={railscasts}>{response}
                </SyntaxHighlighter>
            </div>
        </div>
    )
}