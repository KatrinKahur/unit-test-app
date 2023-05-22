/**
 * This function represents a file upload button.
 * @param callback The function called when a file is selected.
 * @returns {JSX.Element} file upload button
 */
export const FileUploadButton = ({onChange}) => {
    return (
        <div className="inputButt">
            <input type="file"
                   id="file-input"
                   data-testid="file-input"
                   onChange={onChange}
                   required
            />
        </div>
    )
}