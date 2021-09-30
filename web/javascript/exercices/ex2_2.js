// 2.2 Demander 3 noms d'utilisateur
// let askUserName;
// let userName = new Array();
// for (let index = 0; index < 3; index++) {
//     askUserName = prompt("Veuillez renseigner un nom quelconque :");
//     userName[index] = askUserName;
//     // console.log(askUserName);
//     // console.log(userName[index]);
// }

// console.table(userName);

// for (let index = 0, index2 = index + 1; index < userName.length - 1; index++) {
//     if (userName[index] < userName[index2]) {
//         document.write("Le tableau est trié par ordre croissant !");
//     } else {
//         document.write("Le tableau n'est pas trié par ordre croissant !");
//     }
// }

name1 = prompt("Veuillez renseigner un nom quelconque :");
name2 = prompt("Veuillez renseigner un nom quelconque :");
name3 = prompt("Veuillez renseigner un nom quelconque :");

if (name1 < name2 && name2 < name3) {
    document.write("Le tableau est trié par ordre croissant !");
} else {
    document.write("Le tableau n'est pas trié par ordre croissant !");
}