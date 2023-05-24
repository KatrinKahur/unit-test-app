import SyntaxHighlighter from "react-syntax-highlighter";
import { a11yLight } from 'react-syntax-highlighter/dist/esm/styles/hljs';
import React from "react";

/**
 * This component represents the request block where the Java class submitted by the user is displayed
 * @param javaClass The contents of the submitted Java class
 * @returns {JSX.Element} The request block
 */
export const RequestBlock = ({javaClass}) => {
    return(
        <div className="requestBlockWrapper">
            <h3>Java class: </h3>
            <div className="requestBlock">
                <SyntaxHighlighter
                    data-cy="request-block"
                    data-testid="request-block"
                    wrapLines={true}
                    lineProps={{style: {whiteSpace: 'pre-wrap'}}}
                    language="java"
                    style={a11yLight}>{javaClass}
                </SyntaxHighlighter>
            </div>
        </div>
    )
}