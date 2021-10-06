/** Création HTML */
let formElement = document.createElement("form");
let divElement = document.createElement("div");
let divElement2 = document.createElement("div");
let divElement3 = document.createElement("div");
let labelElement = document.createElement("label");
let labelElement2 = document.createElement("label");
let inputElement = document.createElement("input");
let inputElement2 = document.createElement("input");
let inputElement3 = document.createElement("input");

/** Assignation de classe */
formElement.className = "form-element";
formElement.method = "get";
formElement.action = "";
/** 1er element du formulaire */
divElement.classList.add("first");
labelElement.textContent = "Enter product name : ";
inputElement.id = "productName";
inputElement.type = "text";
inputElement.name = "product";
inputElement.required;
divElement2.classList.add("second");
labelElement2.textContent = "How many : ";
inputElement2.id = "productNb";
inputElement2.name = "number";
inputElement2.defaultValue = 1;
divElement3.classList.add("third");
inputElement3.type = "submit";
inputElement3.id = "Basket_add ";

/** Mise en place de l'HTML */
document.body.appendChild(formElement);
formElement.appendChild(divElement);
divElement.appendChild(labelElement);
divElement.appendChild(inputElement);
formElement.appendChild(divElement2);
divElement2.appendChild(labelElement2);
divElement2.appendChild(inputElement2);
formElement.appendChild(divElement3);
divElement3.appendChild(inputElement3);

/** programme */
let product = inputElement.value;
console.log(product);


