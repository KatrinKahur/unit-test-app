import SyntaxHighlighter from "react-syntax-highlighter";
import railscasts from "react-syntax-highlighter/dist/cjs/styles/hljs/railscasts";
import React from "react";

export const RequestBlock = ({javaClass}) => {
    return(
        <div className="requestBlockWrapper">
            <h3>Java class: </h3>
            <div className="requestBlock">
                <SyntaxHighlighter
                    data-testid="request-block"
                    wrapLines={true}
                    lineProps={{style: {whiteSpace: 'pre-wrap'}}}
                    language="java"
                    style={railscasts}>{javaClass}
                </SyntaxHighlighter>
            </div>
        </div>
    )
}