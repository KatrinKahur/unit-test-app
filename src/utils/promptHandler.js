function generatePrompt(request, promptType) {
    let promptBody;
    if(promptType === "zero-shot"){
        promptBody = zeroShotPrompt(request);
    } else if (promptType === "one-shot") {
        promptBody = oneShotPrompt(request);
    } else if (promptType === "more") {
            promptBody = generateMore();
        }
    return promptBody;
}

const zeroShotPrompt = (request) => {
    return "Generate unit tests for the specified Java class using JUnit, strive for maximum code" +
        " coverage when generating the unit tests. Return code only. \n\n Java class: \n \"\"\"\"\"\" \n" + request +
        "\n \"\"\"\"\"\" \n Unit tests: ";
}

const oneShotPrompt = (request) => {
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

        "\n\n Java class: \n \"\"\"\"\"\" \n" + request +
        "\n \"\"\"\"\"\" \n Unit tests: ";
}

const generateMore = () => {
    return "Continue generating if not done. ";
}

export default generatePrompt;