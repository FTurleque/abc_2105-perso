// 1.2 Saisie information utilisateur :
let firstname = prompt("Quel est votre prénom ?");
let lastname = prompt("Quel est votre nom ? :");
let age = prompt("quel est votre age ? ");

// 1.3 Remplacer l'âge par l'année
let annee = (new Date()).getFullYear();
alert(annee);

let born = ((new Date()).getFullYear()) - age
console.log(`Vous vous appelez : ${firstname} ${lastname} et vous avez ${age} ans. vous êtes nées en : ${born}`);


