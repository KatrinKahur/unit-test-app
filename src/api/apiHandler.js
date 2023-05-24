import generatePrompt from "../utils/promptHandler";
import {countTokens} from "../utils/tokenCounter";

/**
 * This function sends an OpenAI API request
 * @param request the contents of the request
 * @param maxTokens max tokens to be generated in reponse body
 * @param temp temperature value (between 0 and 1)
 * @returns {Promise<*>} a Promise with the response
 */
async function getResponse(request, maxTokens, temp) {
    const {Configuration, OpenAIApi} = require("openai");
    const configuration = new Configuration({
        apiKey: process.env.REACT_APP_OPENAI_API_KEY
    });
    const openai = new OpenAIApi(configuration);
    console.log("Request: ", request);
    console.log("Max tokens: ", maxTokens);
    try {
        const response = await openai.createChatCompletion({
            model: "gpt-3.5-turbo",
            messages: [{"role": "user", "content": request}],
            max_tokens: maxTokens,
            temperature: temp
        });
        return response.data.choices[0].message.content;
    } catch (error) {
        console.log("Error: " + error);
        return error;
    }
}

/**
 * This function handles an api request.
 * @param promptData input data sent in the prompt
 * @param promptType the specified prompt type
 * @param maxTokens max tokens to be generated in the response
 * @param temp temperature value (between 0 and 1)
 * @returns {Promise<*|undefined>} a Promise with the response
 */
function handleRequest(promptData, promptType, maxTokens, temp){
    let prompt;
    if(promptType === "multi-step") {
        return handleMultiStepRequest(promptData, maxTokens, temp);
    } else if (promptType === "more") {
        prompt = generatePrompt(promptData, promptType);
        return getResponse(prompt, 3000, temp);
    }
    else {
        prompt = generatePrompt(promptData, promptType);
        return getResponse(prompt, maxTokens, temp);
    }
}

/**
 * This function handles a multi-step prompt request.
 * @param promptData input data, such as Java class
 * @param maxTokens max number of tokens to be generated in the response
 * @param temp temperature value (between 0 and 1)
 * @returns {Promise<unknown>} a Promise with the generated response
 */
function handleMultiStepRequest(promptData, maxTokens, temp){
    return new Promise((resolve, reject) => {
        handleFirstStep(promptData, maxTokens, temp).then((response) => {
            handleSecondStep(promptData, response, temp).then((finalResponse) => {
                resolve(finalResponse);
            })
        }).catch((error) => {reject(error.message)})
    })
}

/**
 * This function handles the first step of a multi-step prompt request.
 * @param promptData input data, such as Java class
 * @param maxTokens max number of tokens to be generated in the response
 * @param temp temperature value (between 0 and 1)
 * @returns {Promise<unknown>} a Promise with the generated response from the first step request
 */
function handleFirstStep(promptData, maxTokens, temp){
    return new Promise((resolve, reject) => {
        let prompt = generatePrompt(promptData, "stepOne");
        getResponse(prompt, maxTokens, temp).then((response) => {
            resolve(response);
        }).catch((error) => {
            reject("Error happened when generating first response " + error.message);
        });
    });
}

/**
 * This function handles the second step of a multi-step prompt request.
 * @param promptData input data, such as Java class
 * @param explanation explanation of the input data
 * @param temp temperature value (between 0 and 1)
 * @returns {Promise<unknown>} a Promise with the generated response from the second step request
 */
function handleSecondStep(promptData, explanation, temp){
    return new Promise((resolve, reject) => {
        let prompt = generatePrompt(promptData, "stepTwo", explanation);
        let maxTokens = 4096 - countTokens(prompt);
        getResponse(prompt, maxTokens, temp).then((response) => {
            resolve({response: response, explanation: explanation});
        }).catch((error) => {
            reject("Second step failed: " + error.message);
        })
    })
}
export default handleRequest;