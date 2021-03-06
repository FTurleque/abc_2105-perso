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
let ulElement = document.createElement("ul");
let liElement = document.createElement("li");

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
// inputElement.required = "required";
// inputElement.checkValidity;
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
document.body.appendChild(ulElement);

/** Programme */
let userEntry,
    product,
    number;
let productTab = new Array,
    numberTab = new Array;

inputElement3.addEventListener("click", (event) => {
    event.preventDefault();

    product = askUserEntry(inputElement);
    number = askUserEntry(inputElement2);
    checkProduct(product, number);
    creationHTML(product, number);
    productTab.push(product);
    numberTab.push(number);
    console.log(productTab);
    console.log(numberTab);
    inputElement.value = inputElement.defaultValue;
    inputElement2.value = inputElement2.defaultValue;
});

function askUserEntry (_elementHTML) {
    return userEntry = _elementHTML.value;
}

function creationHTML(_product, _number) {
    let liElement = document.createElement("li");
    ulElement.appendChild(liElement);
    liElement.textContent = _number + " " + _product;
}

function checkProduct(_product, _number) {
    if (productTab.indexOf(product) === -1) {
        // creationHTML(_product, _number);

    } else {
        for (let i = 0; i < productTab.length; i++) {
            if (_product === productTab[i]) {
                number = parseInt(_number) + parseInt(numberTab[i]);
                let child = document.getElementsByTagName("li")[i];
                child.parentNode.removeChild(child);
                productTab.splice(i, 1);

            }
        }
    }
}


// function matrix(rows, cols, defaultValue) {
//     let arr = [];

//     /** Create all line */
//     for (let i = 0; i < rows; i++) {
//         /** Create an empty line */
//         arr.push([]);

//         /** Add cols to the empty line */
//         arr[i].push(new Array(cols));

//         for (let j = 0; j < cols; j++) {
//             /** Initializes */
//             arr[i][j] = defaultValue;
//         }

//     }
//     return arr;
// }
