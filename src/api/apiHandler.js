async function getResponse(request, maxTokens, temp) {
    const {Configuration, OpenAIApi} = require("openai");
    const configuration = new Configuration({
        apiKey: process.env.REACT_APP_OPENAI_API_KEY
    });
    const openai = new OpenAIApi(configuration);
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

export default getResponse;