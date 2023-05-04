/**
 * This function clears the values of the specified state variables
 * @param stateVariableCallbacks array with state variable callbacks
 */
export function clearStateVariables(stateVariableCallbacks){
    stateVariableCallbacks.forEach((cb) => cb(""))
}