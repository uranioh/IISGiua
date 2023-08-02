function submitForm(event) {
    event.preventDefault();

    let form = document.getElementById("form");
    let inputValues = [];

    inputValues.push(form.elements[0].value); // lastName
    inputValues.push(form.elements[1].value); // firstName
    inputValues.push(form.elements[2].value); // regNo
    inputValues.push(form.elements[3].value); // region
    inputValues.push(form.elements[4].value); // email
    inputValues.push(form.elements[5].value); // phone
    inputValues.push(form.elements[6].value); // requests

    // Check if any field is empty (except requests)
    if (checkEmptyFields(inputValues)) {
        alert("Compila tutti i campi");
    } else {
        // Check if email is valid
        if (!checkEmail(inputValues[4])) {
            alert("Email non valida");
        }

        // Check if phone number is valid
        if (!checkPhone(inputValues[5])) {
            alert("Numero di telefono non valido");
        }
    }

    if (isFormValid(inputValues)) {
        alert("Form inviato!");
    }
}

function isFormValid(inputValues) {
    return !checkEmptyFields(inputValues) && checkEmail(inputValues[4]) && checkPhone(inputValues[5]);
}

function checkEmptyFields(inputValues) {
    for (let i = 0; i < inputValues.length - 1; i++) {
        if (inputValues[i] === "") {
            return true;
        }
    }

    return false;
}

function checkEmail(email) {
    let at = email.indexOf("@");
    let dot = email.lastIndexOf(".");

    return !(at < 1 || dot < at + 2 || dot + 2 >= email.length);
}

function checkPhone(phone) {
    // Regular expression pattern for Italian phone number
    const italianPhoneNumberPattern = /^(?:\+39|0039)?\s?3[0-9]{2}\s?[0-9]{6,7}$/;

    return italianPhoneNumberPattern.test(phone);
}
