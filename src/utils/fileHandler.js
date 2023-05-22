function handleFile(event, callback, fileTypeStatus){
    const file = event.target.files[0];
    if (!file) {
        return;
    }
    const reader = new FileReader();
    reader.onload = function(e) {
        let contents = e.target.result;
        if(checkForFileType(['.java'])){
            fileTypeStatus(true);
            callback(contents);
        } else {
            fileTypeStatus(false);
        }
    };
    reader.readAsText(file);
}

function checkForFileType(fileType){
    var fileName = document.getElementById("file-input").value;
    return (new RegExp('(' + fileType.join('|').replace(/\./g, '\\.') + ')$', "i")).test(fileName);
}

export { handleFile, checkForFileType };