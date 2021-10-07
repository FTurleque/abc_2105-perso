let userEntry = "";
let userTab = new Array();
let result = true;


userEntry = prompt("Ecrire un mot");
userTab = userEntry.split('');

// console.table(userTab);

for (let index = 0, index2 = userTab.length - 1; index < (userTab.length) / 2; index++, index2--) {
    console.log(`La première lettre est : ${userTab[index]}. La dernère lettre : ${userTab[index2]}`);

    if (userTab[index] === userTab[index2]) {

    } else {
        result = false;
    }
}

if (result === true) {
    console.log("C'est un Palindrome !");
} else {
    console.log("Ce n'est pas un Palindrome !");
}