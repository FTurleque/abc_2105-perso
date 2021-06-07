<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_SI" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" epaisseurPoint="2" totalBoucles="5000000" nbDecimales="8" totalAffichages="1000" maxBoucle="500000" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="a EST_DU_TYPE NOMBRE" code="1#NOMBRE#a"/>
        <item algoitem="b EST_DU_TYPE NOMBRE" code="1#NOMBRE#b"/>
        <item algoitem="c EST_DU_TYPE NOMBRE" code="1#NOMBRE#c"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Choisir un nombre pour a :&quot;" code="4#Choisir un nombre pour a :#0"/>
        <item algoitem="LIRE a" code="2#a#pasliste"/>
        <item algoitem="AFFICHER &quot;Choisir un nombre pour b :&quot;" code="4#Choisir un nombre pour b :#0"/>
        <item algoitem="LIRE b" code="2#b#pasliste"/>
        <item algoitem="AFFICHER &quot;Choisir un nombre pour c&quot;" code="4#Choisir un nombre pour c#0"/>
        <item algoitem="LIRE c" code="2#c#pasliste"/>
        <item algoitem="SI (a&lt;b) ALORS" code="6#a&lt;b">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="SI (c>a &amp;&amp; c&lt;b) ALORS" code="6#c>a &amp;&amp; c&lt;b">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Nombre dans l'ordre croissant sont :&quot;" code="4#Nombre dans l'ordre croissant sont :#1"/>
                <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="SI (c&lt;a ) ALORS" code="6#c&lt;a ">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Nombre dans l'ordre croissant sont :&quot;" code="4#Nombre dans l'ordre croissant sont :#1"/>
                <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="SI (c>b) ALORS" code="6#c>b">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Nombre dans l'ordre croissant sont :&quot;" code="4#Nombre dans l'ordre croissant sont :#1"/>
                <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (c&lt;b) ALORS" code="6#c&lt;b">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;Nombre dans l'ordre croissant sont :&quot;" code="4#Nombre dans l'ordre croissant sont :#1"/>
                    <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                    <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                    <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                    <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                    <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                </item>
                <item algoitem="SI (c>a) ALORS" code="6#c>a">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;Nombre dans l'ordre croissant sont :&quot;" code="4#Nombre dans l'ordre croissant sont :#1"/>
                    <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                    <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                    <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                    <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                    <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                </item>
                <item algoitem="SI (c>b &amp;&amp; c&lt;a) ALORS" code="6#c>b &amp;&amp; c&lt;a">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;Nombre dans l'ordre croissant sont :&quot;" code="4#Nombre dans l'ordre croissant sont :#1"/>
                    <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                    <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                    <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                    <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                    <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
        <item algoitem="SI (a==b) ALORS" code="6#a==b">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="SI (c==a) ALORS" code="6#c==a">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;a, b et c sont tous trois égaux !&quot;" code="4#a, b et c sont tous trois égaux !#0"/>
                <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="SI (c&lt;a) ALORS" code="6#c&lt;a">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Nombre dans l'ordre croissant sont :&quot;" code="4#Nombre dans l'ordre croissant sont :#1"/>
                <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                <item algoitem="AFFICHER &quot; = &quot;" code="4# = #0"/>
                <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="AFFICHER &quot;Nombre dans l'ordre croissant sont :&quot;" code="4#Nombre dans l'ordre croissant sont :#0"/>
                    <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                    <item algoitem="AFFICHER &quot; = &quot;" code="4# = #0"/>
                    <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                    <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                    <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
