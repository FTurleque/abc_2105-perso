<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="myArray[0] PREND_LA_VALEUR 2:5:8:13:18" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2para="" F2etat="inactif" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" totalAffichages="1000" arrondiAuto="vrai" totalBoucles="5000000" epaisseurLigne="2" maxBoucle="500000" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#LISTE#myArray" algoitem="myArray EST_DU_TYPE LISTE"/>
        <item code="1#NOMBRE#index" algoitem="index EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#mystere" algoitem="mystere EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Choisir un nombre compris entre 1 et 20 :#0" algoitem="AFFICHER &quot;Choisir un nombre compris entre 1 et 20 :&quot;"/>
        <item code="2#mystere#pasliste" algoitem="LIRE mystere"/>
        <item code="12#index#0#4" algoitem="POUR index ALLANT_DE 0 A 4">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#myArray#2:5:8:13:18#0" algoitem="myArray[0] PREND_LA_VALEUR 2:5:8:13:18"/>
            <item code="19#myArray[0] PREND_LA_VALEUR 2" algoitem="//myArray[0] PREND_LA_VALEUR 2"/>
            <item code="19#myArray[1] PREND_LA_VALEUR 5" algoitem="//myArray[1] PREND_LA_VALEUR 5"/>
            <item code="19#myArray[2] PREND_LA_VALEUR 8" algoitem="//myArray[2] PREND_LA_VALEUR 8"/>
            <item code="19#myArray[3] PREND_LA_VALEUR 13" algoitem="//myArray[3] PREND_LA_VALEUR 13"/>
            <item code="19#myArray[4] PREND_LA_VALEUR 18" algoitem="//myArray[4] PREND_LA_VALEUR 18"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="6#mystere==myArray[index]" algoitem="SI (mystere==myArray[index]) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Le nombre choisi se trouve bien dans le tableau !#0" algoitem="AFFICHER &quot;Le nombre choisi se trouve bien dans le tableau !&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4#Le nombre choisi n'est pas dans le tableau !#0" algoitem="AFFICHER &quot;Le nombre choisi n'est pas dans le tableau !&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
