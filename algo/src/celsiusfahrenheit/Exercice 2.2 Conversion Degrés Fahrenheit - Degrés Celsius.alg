<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="LIRE sortie" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2defaut="" F2etat="inactif" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000" epaisseurPoint="2" nbDecimales="8" epaisseurLigne="2" totalBoucles="5000000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="temp EST_DU_TYPE NOMBRE" code="1#NOMBRE#temp"/>
        <item algoitem="unite EST_DU_TYPE CHAINE" code="1#CHAINE#unite"/>
        <item algoitem="sortie EST_DU_TYPE CHAINE" code="1#CHAINE#sortie"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="TANT_QUE (sortie!=&quot;q&quot;) FAIRE" code="15#sortie!=&quot;q&quot;">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="AFFICHER &quot;Saisir une température :&quot;" code="4#Saisir une température :#1"/>
            <item algoitem="LIRE temp" code="2#temp#pasliste"/>
            <item algoitem="SI (temp>=-459.67 &amp;&amp; temp&lt;=5000000) ALORS" code="6#temp>=-459.67 &amp;&amp; temp&lt;=5000000">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Saisir son unitée de mesure Celsius ou Fahrenheit (C ou F) :&quot;" code="4#Saisir son unitée de mesure Celsius ou Fahrenheit (C ou F) :#1"/>
                <item algoitem="LIRE unite" code="2#unite#pasliste"/>
                <item algoitem="SI (unite==&quot;C&quot; &amp;&amp; unite!=&quot;F&quot;) ALORS" code="6#unite==&quot;C&quot; &amp;&amp; unite!=&quot;F&quot;">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER temp" code="3#temp#0#pasliste"/>
                    <item algoitem="AFFICHER &quot; °C = &quot;" code="4# °C = #0"/>
                    <item algoitem="AFFICHERCALCUL (temp*9/5)+32" code="20#(temp*9/5)+32#0"/>
                    <item algoitem="AFFICHER &quot; °F&quot;" code="4# °F#1"/>
                    <item algoitem="AFFICHER &quot;Saisir q pour sortir du programme !&quot;" code="4#Saisir q pour sortir du programme !#0"/>
                    <item algoitem="LIRE sortie" code="2#sortie#pasliste"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="AFFICHER temp" code="3#temp#0#pasliste"/>
                        <item algoitem="AFFICHER &quot; °F = &quot;" code="4# °F = #0"/>
                        <item algoitem="AFFICHERCALCUL (temp-32)*5/9" code="20#(temp-32)*5/9#0"/>
                        <item algoitem="AFFICHER &quot; °C&quot;" code="4# °C#1"/>
                        <item algoitem="AFFICHER &quot;Saisir q pour sortir du programme !&quot;" code="4#Saisir q pour sortir du programme !#0"/>
                        <item algoitem="LIRE sortie" code="2#sortie#pasliste"/>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="AFFICHER &quot;Vous avez saisie une valeur hors limite !&quot;" code="4#Vous avez saisie une valeur hors limite !#1"/>
                    <item algoitem="sortie PREND_LA_VALEUR &quot;a&quot;" code="5#sortie#&quot;a&quot;#pasliste"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
