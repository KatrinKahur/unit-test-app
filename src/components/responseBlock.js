import {Spinner} from "react-bootstrap";
import SyntaxHighlighter from "react-syntax-highlighter";
import React from "react";
import {a11yLight} from "react-syntax-highlighter/dist/esm/styles/hljs";

/**
 * This component represents the response block, where the generated unit tests are displayed for the user.
 * @param loadingStatus The loading status
 * @param response The generated unit tests
 * @returns {JSX.Element} The response block
 */
export const ResponseBlock = ({loadingStatus, response}) => {
    return(
        <div className="responseBlockWrapper">
            <h3>Tests: </h3>
            <div className="responseBlock">
                {loadingStatus && <Spinner data-cy="spinner" animation="border" variant="secondary" />}
                <SyntaxHighlighter
                    data-cy="response-block"
                    wrapLines={true}
                    lineProps={{style: {whiteSpace: 'pre-wrap'}}}
                    language="java"
                    style={a11yLight}>{response}
                </SyntaxHighlighter>
            </div>
        </div>
    )
}