function handleFile(event, callback){
    const file = event.target.files[0];
    if (!file) {
        return;
    }
    const reader = new FileReader();
    reader.onload = function(e) {
        let contents = e.target.result;
        callback(contents);
    };
    reader.readAsText(file);
}

export default handleFile;