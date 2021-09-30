// 6) Écrire un algorithme qui calcule la factorielle d'un nombre.

let askNumber;

askNumber = parseInt(prompt("Choisir un nombre pour en calculer le factorielle"));
for (let index = askNumber - 1; index >= 1; index--) {
    askNumber *= index;
}

alert(`Le factorielle est ${askNumber}`);

// console.table(factNb);
