import {getDatabase, push, ref} from "firebase/database";

function documentTestAttempt(promptType, javaClass, generatedTests, lineCoverage, branchCoverage, passedUnitTests,
                             maxTokens, temp) {
    const tableRef = ref(getDatabase(), "test_attempts/" + promptType + "/temp_" + String(temp));
    push(tableRef, {
        timestamp: new Date().toLocaleString(),
        java_class: javaClass,
        generated_tests: generatedTests,
        line_coverage: lineCoverage,
        branch_coverage: branchCoverage,
        passed_unit_tests: passedUnitTests,
        max_tokens: maxTokens
    })
}

export default documentTestAttempt;