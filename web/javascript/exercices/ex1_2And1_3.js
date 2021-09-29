// 1.2 Saisie information utilisateur :
let firstname = prompt("Quel est votre prénom ?");
let lastname = prompt("Quel est votre nom ? :");
let age = prompt("quel est votre age ? ");

// 1.3 Remplacer l'âge par l'année
let annee = new Date().getFullYear();
console.log(annee);

let born = annee - age
alert(`Vous vous appelez ${firstname} ${lastname} et vous avez ${age} ans. vous êtes nées en ${born}`);


