
// 1.Inversion de valeurs :
// let valious1 = 10;
// let valious2 = 5;
// let valious3 = 0;

// alert("La valeur de valious1 est : " + valious1);
// alert("La valeur de valious2 est : " + valious2);

// valious3 = valious1;
// valious1 = valious2;
// valious2 = valious3;

// alert("La valeur de valious1 est : " + valious1);
// alert("La valeur de valious2 est : " + valious2);

// 2.Saisie information utilisateur :
// let firstname = prompt("Quel est votre prénom ?");
// let lastname = prompt("Quel est votre nom ? :");
// let age = prompt("quel est votre age ? ");

// 3.Remplacer l'âge par l'année
// let annee = (new Date()).getFullYear();
// let born = ((new Date()).getFullYear()) - age

// alert(annee);

// console.log(`Vous vous appelez : ${firstname} ${lastname} et vous avez ${age} ans. vous êtes nées en : ${born}`);


// Écrire un programme qui demande le Hors Taxes (HT) d'un article et le nombre
// d'articles. Fournir le prix Toutes Taxes Comprises (TTC) en y appliquant une Taxe sur la
// Valeur Ajoutée (TVA) de 20%
// aide : calcule de 20% de 40 => (40 / 100) * 20 = 8

let article1 = prompt("Quel est le prix hors taxe de l'article ?");
let articleNb = prompt("Combien d'articles souhaitez vous acheter ?");
let priceTTC = article1 += ((article1 * 20) /100);

console.log(`Le prix de l'article TTC est de : ${priceTTC}`);