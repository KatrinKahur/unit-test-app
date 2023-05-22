import React from "react";

export const AppTitle = ({titleOne, titleTwo}) => {
    return(
        <>
            <h1 data-cy="titleOne" className="toolNameAbrev">{titleOne}</h1>
            <p data-cy="titleTwo" className="toolName">{titleTwo}</p>
        </>
    )
}