import React from "react";

/**
 * This component represents the unit test generation button
 * @returns {JSX.Element} The unit test generation button
 */
export const UnitTestGenerationButton = () => {
    return (
        <input data-cy="test-generation-btn" type="submit" value="Generate unit tests!"
               className="testGeneratorButton" />
    )
}