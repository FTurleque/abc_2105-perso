// 2.2 Demander 3 noms d'utilisateur
let askUserName;
let userName = new Array();
for (let index = 0; index < 3; index++) {
    askUserName = prompt("Veuillez renseigner un nom quelconque :");
    userName[index] = askUserName;
    // console.log(askUserName);
    // console.log(userName[index]);
}

console.table(userName);
