/**
 * This components represents the button for generating more tests.
 * @param onClick The callback for when the button is clicked
 * @returns {JSX.Element} The button for generating more tests
 */
export const MoreTestsButton = ({onClick}) => {
    return(
        <button className="moreTestsButton" onClick={onClick}>Generate more</button>
    )
}