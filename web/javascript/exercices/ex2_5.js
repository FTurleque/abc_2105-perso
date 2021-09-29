// 6) Écrire un algorithme qui calcule la factorielle d'un nombre.

let askNumber;
let numberToFact;
let factNb = new Array();
let sumFactNb= 0;

askNumber = prompt("Choisir un nombre pour en calculer le factorielle");
numberToFact = parseInt(askNumber);
for (let index = 0; numberToFact > index; index++) {
    // factNb[index] = (index + (index + 1));
    let toto = (index + (index + 1));
    factNb[index] = toto;
}

console.table(factNb);

for (let index = 0; index < factNb.length; index++) {
    // sumFactNb += factNb[index];
    sumFactNb = sumFactNb + factNb[index];
}

document.write(`Le factorielle de ${numberToFact} est : ${sumFactNb}`);