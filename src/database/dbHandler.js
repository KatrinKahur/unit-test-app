import {getDatabase, push, ref} from "firebase/database";

/**
 * This function stores the data obtained during the evaluation of a prompt technique in Firebase Realtime Database
 * @param promptType the type of the tested prompt
 * @param javaClass the Java class used for generating unit tests with the given prompt type
 * @param generatedTests the generated unit tests for the given Java class
 * @param lineCoverage the line coverage value for the obtained tests
 * @param branchCoverage the branch coverage value for the obtained tests
 * @param passedUnitTests the number of unit tests that passed among the ones generated
 * @param maxTokens the max tokens setting used by the API when generating response
 * @param temp the temperature value when generating the tests
 * @param explanation The explanation provided in the multi-step prompt
 */
function documentTestAttempt(promptType, javaClass, generatedTests, lineCoverage, branchCoverage,
                             passedUnitTests, maxTokens, temp, explanation) {
    const tableRef = ref(getDatabase(), "test_attempts/" + promptType + "/temp_" +
        String(temp).replace(".", ""));
    push(tableRef, {
        timestamp: new Date().toLocaleString(),
        java_class: javaClass,
        generated_tests: generatedTests,
        line_coverage: lineCoverage,
        branch_coverage: branchCoverage,
        passed_unit_tests: passedUnitTests,
        max_tokens: maxTokens,
        explanation: explanation
    })
}

export default documentTestAttempt;
