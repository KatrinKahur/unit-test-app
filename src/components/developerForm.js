import React from "react";

/**
 * This component is the development form of JUTAI,
 * used for collecting the measurements taken when evaluating its prompts
 * @param onSubmit The function called when submitting the measurements
 * @param setLineCoverage The function that sets the value of the line coverage criteria
 * @param setBranchCoverage The function that sets the value of the branch coverage criteria
 * @param setPassedUnitTests The function that sets the value of the passed unit tests criterua
 * @returns {JSX.Element} The developer form
 */
export const DeveloperForm = ({onSubmit, setLineCoverage, setBranchCoverage, setPassedUnitTests}) => {
    return(
        <form className="testForm" id="result-form"
              onSubmit={onSubmit}>
            <div>
                <label className="inputSquare">
                    <p className="testText">Line Coverage</p>
                    <textarea type="text" name="name" className="inputBox" required="required"
                              onChange={(e) => setLineCoverage(e.target.value)}/>
                </label>
                <label className="inputSquare">
                    <p className="testText">Branch Coverage</p>
                    <textarea type="text" name="name" className="inputBox" required="required"
                              onChange={(e) => setBranchCoverage(e.target.value)}/>
                </label>
                <label className="inputSquare">
                    <p className="testText">Passed Unit Tests</p>
                    <textarea type="text" name="name" className="inputBox" required="required"
                              onChange={(e) => setPassedUnitTests(e.target.value)}/>
                </label>
            </div>
            <input type="submit" value="Submit" className="testSubmitButt"/>
        </form>
    )
}