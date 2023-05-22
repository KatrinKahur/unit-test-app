import React from "react";

export const UnitTestGenerationButton = () => {
    return (
        <input data-cy="test-generation-btn" type="submit" value="Generate unit tests!"
               className="testGeneratorButton" />
    )
}