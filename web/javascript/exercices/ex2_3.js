// 3. Écrire un algorithme qui demande une heure (heures minutes secondes) ) un utilisateur
// et affiche l'heure qu'il sera 1 seconde plus tard. Vérifier la validité des données saisies.



setInterval(function() {
    let d = new Date();
    console.log("L'heure courante est : " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
}, 1000)