let userEntry = "";
let userTab = new Array();
let result;

alert("Verifier si un mot est un palindrome");

userEntry = prompt("Ecrire un mot :");
userTab = userEntry;

console.table(userTab[0]);
console.table(userTab[userTab.length - 1]);

for (let index = 0, index2 = userTab.length - 1; index < (userTab.length - 1) / 2; index++, index2 --) {
    if (userTab[index] === userTab[index2]) {
        console.log(`La première lettre est : ${userTab[index]}. La dernière lettre est : ${userTab[index2]}.`);
        result = "C'est un Palindrome !";
    } else {
        result = "Ce n'est pas un Palindrome !";
    }
    
}

console.log(result);