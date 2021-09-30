// 4. Écrire un algorithme qui demande un nombre compris entre 1900 et 2021 jusqu'à ce
// que la réponse convienne.

let min = 1900;
let max = 2021;
let userNumber = 0;
let askNumber = 0;
let find = false;

let nbToFind = parseInt(Math.floor(Math.random() * (max - (min + 1)) + min));

alert("Trouvez le nombre mystère en 10 essaient !")
// askNumber = prompt("Choisir un nombre entre 1900 et 2021 :");
// userNumber = parseInt(askNumber);

for (let i = 0; i < 10; i++) {
    askNumber = prompt("Choisir un nombre entre 1900 et 2021 :");
    userNumber = parseInt(askNumber);

    if (userNumber > 1900 && userNumber < 2021) {
        if (userNumber === nbToFind) {
            alert("Bien jouez vous avez trouver le nombre mystère !");
            break;
        } else if (userNumber > nbToFind) {
            alert("Le nombre mystère est plus petit ! Réessayez.");
        } else {
            alert("Le nombre mystère est plus grand ! Réessayez.");
        }
    } else {
        alert("Vous n'avez pas choisi un nombre compris entre 1900 et 2021, recommencer :");
        i--;
    }
}