<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_TANT_QUE" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2etat="inactif" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurLigne="2" nbDecimales="8" totalBoucles="5000000" totalAffichages="1000" maxBoucle="500000" epaisseurPoint="2" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="km EST_DU_TYPE NOMBRE" code="1#NOMBRE#km"/>
        <item algoitem="sortie EST_DU_TYPE CHAINE" code="1#CHAINE#sortie"/>
        <item algoitem="calcul EST_DU_TYPE NOMBRE" code="1#NOMBRE#calcul"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="TANT_QUE (sortie!=&quot;q&quot;) FAIRE" code="15#sortie!=&quot;q&quot;">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="AFFICHER &quot;Saisir une valeur en Kilomètre compris entre 0.01 et 1 000 000 : &quot;" code="4#Saisir une valeur en Kilomètre compris entre 0.01 et 1 000 000 : #1"/>
            <item algoitem="LIRE km" code="2#km#pasliste"/>
            <item algoitem="SI (km > 0.01 &amp;&amp; km &lt;= 1000000) ALORS" code="6#km > 0.01 &amp;&amp; km &lt;= 1000000">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="calcul PREND_LA_VALEUR km/1.609" code="5#calcul#km/1.609#pasliste"/>
                <item algoitem="AFFICHER km" code="3#km#0#pasliste"/>
                <item algoitem="AFFICHER &quot; Kilomètres = &quot;" code="4# Kilomètres = #0"/>
                <item algoitem="AFFICHER calcul" code="3#calcul#0#pasliste"/>
                <item algoitem="AFFICHER &quot; Miles&quot;" code="4# Miles#1"/>
                <item algoitem="AFFICHER &quot;Appuyez sur q pour sortir ou sur une autre touche pour recommencer !&quot;" code="4#Appuyez sur q pour sortir ou sur une autre touche pour recommencer !#0"/>
                <item algoitem="LIRE sortie" code="2#sortie#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="AFFICHER &quot;Vous n'avez pas indiqué un nombre entre 0.01 et 1 000 000, recommancer !&quot;" code="4#Vous n'avez pas indiqué un nombre entre 0.01 et 1 000 000, recommancer !#1"/>
                    <item algoitem="sortie PREND_LA_VALEUR &quot;a&quot;" code="5#sortie#&quot;a&quot;#pasliste"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
