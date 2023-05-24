import React from "react";

/**
 * This component represents the app title.
 * @param titleOne The first line of the title
 * @param titleTwo The second line of the title
 * @returns {JSX.Element} The title of the application
 */
export const AppTitle = ({titleOne, titleTwo}) => {
    return(
        <>
            <h1 data-cy="titleOne" className="toolNameAbrev">{titleOne}</h1>
            <p data-cy="titleTwo" className="toolName">{titleTwo}</p>
        </>
    )
}