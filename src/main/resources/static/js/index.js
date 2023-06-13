const uploadText = async(ev) => {

    ev.preventDefault();
    const textInput = document.getElementById('text-input');

    if(! textInput.value.length > 0 ) return null;

    const textRequestBody = {
        text: textInput.value
    };

    const response = await fetch('/app/uploadText',
        {
            body: JSON.stringify(textRequestBody),
            method: 'POST',
            headers: {"Content-Type": "application/json"}
        });
    const data = await  response.json();
    console.log(data)

}

function upload(ev) {

}

document.getElementById('submit-text').addEventListener('submit', event => uploadText(event));