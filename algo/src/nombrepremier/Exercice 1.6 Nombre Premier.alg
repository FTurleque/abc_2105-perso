<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_TANT_QUE" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" epaisseurPoint="2" maxBoucle="500000" totalAffichages="1000" arrondiAuto="vrai" epaisseurLigne="2" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="n EST_DU_TYPE NOMBRE" code="1#NOMBRE#n"/>
        <item algoitem="diviseur EST_DU_TYPE NOMBRE" code="1#NOMBRE#diviseur"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Choisissez un nombre entier :&quot;" code="4#Choisissez un nombre entier :#0"/>
        <item algoitem="LIRE n" code="2#n#pasliste"/>
        <item algoitem="diviseur PREND_LA_VALEUR 2" code="5#diviseur#2#pasliste"/>
        <item algoitem="TANT_QUE (n%diviseur!=0 &amp;&amp; diviseur&lt;=sqrt(n)) FAIRE" code="15#n%diviseur!=0 &amp;&amp; diviseur&lt;=sqrt(n)">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="diviseur PREND_LA_VALEUR diviseur+1" code="5#diviseur#diviseur+1#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="SI (diviseur>sqrt(n)) ALORS" code="6#diviseur>sqrt(n)">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Vous avez choisis un nombre premier !&quot;" code="4#Vous avez choisis un nombre premier !#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="AFFICHER &quot;Le nombre choisis n'est pas un nombre premier !&quot;" code="4#Le nombre choisis n'est pas un nombre premier !#0"/>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
