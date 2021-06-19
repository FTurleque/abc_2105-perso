<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHERCALCUL s_init*(1+n_années*i_interet)-s_init"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2lignes="" F2defaut="" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" epaisseurPoint="2" maxBoucle="500000" nbDecimales="8" epaisseurLigne="2" arrondiAuto="vrai" totalBoucles="5000000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="i_interet EST_DU_TYPE NOMBRE" code="1#NOMBRE#i_interet"/>
        <item algoitem="s_init EST_DU_TYPE NOMBRE" code="1#NOMBRE#s_init"/>
        <item algoitem="n_années EST_DU_TYPE NOMBRE" code="1#NOMBRE#n_années"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Quel est la somme placée sur le compte ?&quot;" code="4#Quel est la somme placée sur le compte ?#0"/>
        <item algoitem="LIRE s_init" code="2#s_init#pasliste"/>
        <item algoitem="AFFICHER &quot;Quel est l'intérêt offert par la banque en pourcentage ?&quot;" code="4#Quel est l'intérêt offert par la banque en pourcentage ?#0"/>
        <item algoitem="LIRE i_interet" code="2#i_interet#pasliste"/>
        <item algoitem="AFFICHER &quot;Pendant combien d'années cette somme a-t-elle été placée ?&quot;" code="4#Pendant combien d'années cette somme a-t-elle été placée ?#0"/>
        <item algoitem="LIRE n_années" code="2#n_années#pasliste"/>
        <item algoitem="AFFICHER &quot;Avec un intérêt simple vous aurez gagné : &quot;" code="4#Avec un intérêt simple vous aurez gagné : #0"/>
        <item algoitem="AFFICHERCALCUL s_init*(1+n_années*i_interet)-s_init" code="20#s_init*(1+n_années*i_interet)-s_init#1"/>
        <item algoitem="AFFICHER &quot;Avec un intérêt composé vous aurez gagné : &quot;" code="4#Avec un intérêt composé vous aurez gagné : #0"/>
        <item algoitem="AFFICHERCALCUL s_init*pow(1+i_interet,n_années)-s_init" code="20#s_init*pow(1+i_interet,n_années)-s_init#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
