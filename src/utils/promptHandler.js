/**
 * This function generates prompt body given the prompt type, input data and context
 * @param promptData prompt input data, for example Java class in unit test generation request
 * @param context additional data sent in the prompt (optional)
 * @param promptType the type of the prompt, for instance "zero-shot" or "multi-step"
 * @returns {string} a String with the generated prompt body
 */
function generatePrompt(promptData, promptType, context = "") {
    let promptBody;
    if (promptType === "zero-shot") {
        promptBody = zeroShotPrompt(promptData);
    } else if (promptType === "one-shot") {
        promptBody = oneShotPrompt(promptData);
    } else if (promptType === "stepOne") {
        promptBody = stepOnePrompt(promptData);
    } else if (promptType === "stepTwo") {
        promptBody = stepTwoPrompt(promptData, context);
    } else if (promptType === "more") {
        promptBody = generateMorePrompt();
    }
    return promptBody;
}

/**
 * This component represents the zero-shot prompt
 * @param promptData input data, such as Java class in a unit generation request
 * @returns {string} a String representation of the zero-shot prompt
 */
const zeroShotPrompt = (promptData) => {
    return "Generate unit tests for the specified Java class using JUnit 4, strive for maximum code" +
        " coverage when generating the unit tests. Return code only. \n\n Java class: \n \"\"\"\"\"\" \n" + promptData +
        "\n \"\"\"\"\"\" \n Unit tests: ";
}


/**
 * This component represents the one-shot prompt
 * @param promptData input data, such as Java class in a unit generation request
 * @returns {string} a String representation of the one-shot prompt
 */
const oneShotPrompt = (promptData) => {
    return "Generate unit tests for the specified Java class using JUnit, strive for maximum code" +
        " coverage when generating the unit tests. Return code only." +

        "\n\n Java class: \n \"\"\"\"\"\" \n" +

        "public class Calculator {\n" +
          	"public int add(int a, int b) {\n" +
          		"return a + b;\n" +
          	"}\n\n" +

          	"public int sub(int a, int b) {\n" +
          		"return a - b;\n" +
          	"}\n\n" +

          	"public int multiply(int a, int b) {\n" +
                "return a * b;\n" +
            "}\n\n" +

          	"public int divide(int a, int b) {\n" +
          		"return a / b;\n" +
          	"}\n" +
        "}\n\n" +

        "\n \"\"\"\"\"\" \n Unit tests: \n" +

        "public class CalculatorTest {\n" +
        	"@Test\n" +
        	"public void testAdd() {\n" +
        		"Calculator calculator = new Calculator();\n" +
        		"int result = calculator.add(2, 2);\n" +
        		"if (result != 4) {\n"  +
        			"Assert.fail();\n" +
        		"}\n" +
        	"}\n\n" +

        	"@Test\n" +
        	"public void testSub() {\n" +
        		"Calculator calculator = new Calculator();\n" +
        		"Assert.assertEquals(0, calculator.sub(2, 2));\n" +
        	"}\n\n" +

        	"@Test\n" +
            "public void testMultiply() {\n" +
                "Calculator calculator = new Calculator();\n" +
                "Assert.assertEquals(18, calculator.multiply(6, 3));\n" +
            "}\n\n" +

        	"@Test\n" +
        	"public void testDivide() {\n" +
        		"Calculator calculator = new Calculator();\n" +
        		"Assert.assertEquals(2, calculator.divide(6, 3));\n" +
        	"}\n\n" +

        	"@Test(expected = ArithmeticException.class)\n" +
        	"public void testDivideWillThrowExceptionWhenDivideOnZero() {\n" +
        		"Calculator calculator = new Calculator();\n" +
        		"calculator.divide(6, 0);\n" +
        	"}\n" +
        "}\n\n"+

        "\n\n Java class: \n \"\"\"\"\"\" \n" + promptData +
        "\n \"\"\"\"\"\" \n Unit tests: ";
}

/**
 * This component represents the first step prompt in the multi-step prompt
 * @param promptData input data, such as Java class in a unit generation request
 * @returns {string} a String representation of the first step prompt in the multi-step prompt
 */
const stepOnePrompt = (promptData) => {
    return "Explain what the given Java class does in five sentences. Include all possible edge cases. \n\n " +
        "Java class: \n \"\"\"\"\"\" \n"
        + promptData + "\n \"\"\"\"\"\" \n Explanation: \n"
}

/**
 * This component represents the second step prompt in the multi-step prompt
 * @param promptData input data, such as Java class in a unit generation request
 * @param explanation provided explanation for the given prompt data
 * @returns {string} a String representation of the second step prompt in the multi-step prompt
 */
const stepTwoPrompt = (promptData, explanation) => {
    return "Generate unit tests using JUnit 4 for the given Java class and its explanation. Return code only." +
        "\n Java class: \n \"\"\"\"\"\" \n" + promptData + "\n \"\"\"\"\"\" \n Explanation: \n \"\"\"\"\"\" \n" +
        explanation +  "\n \"\"\"\"\"\" \n Unit tests: \n"
}


/**
 * This component represents the prompt body of the "Generate more unit tests" prompt
 * @returns {string} a String representation of the "Generate more unit tests" prompt
 */
const generateMorePrompt = () => {
    return "Continue generating if not done. ";
}

export default generatePrompt;
