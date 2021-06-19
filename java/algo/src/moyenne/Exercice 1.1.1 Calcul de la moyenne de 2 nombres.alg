<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="B EST_DU_TYPE NOMBRE"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" totalBoucles="5000000" maxBoucle="500000" epaisseurPoint="2" totalAffichages="1000" arrondiAuto="vrai" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="A EST_DU_TYPE NOMBRE" code="1#NOMBRE#A"/>
        <item algoitem="B EST_DU_TYPE NOMBRE" code="1#NOMBRE#B"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Choisissez un nombre entier pour A : &quot;" code="4#Choisissez un nombre entier pour A : #0"/>
        <item algoitem="LIRE A" code="2#A#pasliste"/>
        <item algoitem="AFFICHER &quot;Coisissez un nombre entier pour B : &quot;" code="4#Coisissez un nombre entier pour B : #0"/>
        <item algoitem="LIRE B" code="2#B#pasliste"/>
        <item algoitem="AFFICHER &quot;La moyenne est : &quot;" code="4#La moyenne est : #0"/>
        <item algoitem="AFFICHERCALCUL (A+B)/2" code="20#(A+B)/2#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
