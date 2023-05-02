import {getDatabase, push, ref} from "firebase/database";

function documentTestAttempt(promptType, javaClass, generatedTests){
    const tableRef = ref(getDatabase(), "test_attempts/" + promptType);
    push(tableRef, {
        timestamp: new Date().toLocaleString(),
        java_class: javaClass,
        generated_tests: generatedTests
    })
}

export default documentTestAttempt;