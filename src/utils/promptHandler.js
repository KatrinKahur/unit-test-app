function generatePrompt(request) {
    const promptBody = "Generate unit tests for the specified Java class using JUnit, strive for maximum code" +
        " coverage when generating the unit tests. Return code only."
    return promptBody + "\n" + request;
}

export default generatePrompt;