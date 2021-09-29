// Écrire un programme qui demande le Hors Taxes (HT) d'un article et le nombre
// d'articles. Fournir le prix Toutes Taxes Comprises (TTC) en y appliquant une Taxe sur la
// Valeur Ajoutée (TVA) de 20%
// aide : calcule de 20% de 40 => (40 / 100) * 20 = 8

let article1 = prompt("Quel est le prix hors taxe de l'article ?");
let articleNb = prompt("Combien d'articles souhaitez vous acheter ?");
let priceTTC = (parseFloat(article1) + ((parseFloat(article1) * 20) /100)) * articleNb;

alert(`Le prix de l'article TTC est de : ${priceTTC} € !`);
alert("Le prix de l'article TTC est de : " + priceTTC + " € !");