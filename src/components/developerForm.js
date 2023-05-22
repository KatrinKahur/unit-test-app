import React from "react";

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