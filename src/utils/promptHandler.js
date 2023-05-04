function generatePrompt(request, promptType) {
    let promptBody;
    if(promptType === "zero-shot"){
        promptBody = zeroShotPrompt(request);
    }
    return promptBody;
}

const zeroShotPrompt = (request) => {
    return "Generate unit tests for the specified Java class using JUnit, strive for maximum code" +
        " coverage when generating the unit tests. Return code only. \n\n Java class: \n \"\"\"\"\"\" \n" + request +
        "\n \"\"\"\"\"\" \n Unit tests: ";
}

export default generatePrompt;