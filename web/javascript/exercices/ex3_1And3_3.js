let myArray = [5, 18, 8, 2, 10];
let userEntry = 0;
let userNumber = 0;
let find = false;


alert("Verifiez si un nombre est dans le tableau.");

do {
    userEntry = prompt("Choisir un nombre entre 1 et 20 :");
    try {
        userNumber = parseInt(userEntry);
        if (userNumber > 0 && userNumber < 21) {
            numberToFind();
        } else {
            throw new error;
        }
        
    } catch (error) {
        alert("Vous n'avez pas choisi un nombre entre 1 et 20. Réessayez :")
    }
} while (find === false);


function numberToFind() {
    for (let index = 0; index < myArray.length; index++) {
        if (myArray[index] === userNumber) {
            find = true;
        }
    }

    if (find) {
        alert("Bien joué, le chiffre est dans le tableau !");
    } else {
        alert("Le nombre choisi n'est pas dans le tableaux.");
    }
}

alert(`Le nombre le plus petit du tableau est : ${Math.min.apply(null, myArray)}`);