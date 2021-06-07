<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot; Miles = &quot;"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2defaut="" F2etat="inactif" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" arrondiAuto="vrai" epaisseurPoint="2" nbDecimales="8" totalAffichages="1000" totalBoucles="5000000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#km" algoitem="km EST_DU_TYPE NOMBRE"/>
        <item code="1#CHAINE#sortie" algoitem="sortie EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#calcul" algoitem="calcul EST_DU_TYPE NOMBRE"/>
        <item code="1#CHAINE#choix" algoitem="choix EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#mi" algoitem="mi EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="15#sortie!=&quot;q&quot;" algoitem="TANT_QUE (sortie!=&quot;q&quot;) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="4#Pour choisir la conversion en kilomètre tapez : km !#1" algoitem="AFFICHER &quot;Pour choisir la conversion en kilomètre tapez : km !&quot;"/>
            <item code="4#Pour choisir la conversion en Miles tapez : mi !#1" algoitem="AFFICHER &quot;Pour choisir la conversion en Miles tapez : mi !&quot;"/>
            <item code="2#choix#pasliste" algoitem="LIRE choix"/>
            <item code="6#choix == &quot;km&quot; &amp;&amp; choix != &quot;mi&quot;" algoitem="SI (choix == &quot;km&quot; &amp;&amp; choix != &quot;mi&quot;) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="4#Saisir une valeur en Kilomètre compris entre 0.01 et 1 000 000 : #1" algoitem="AFFICHER &quot;Saisir une valeur en Kilomètre compris entre 0.01 et 1 000 000 : &quot;"/>
                <item code="2#km#pasliste" algoitem="LIRE km"/>
                <item code="6#km > 0.01 &amp;&amp; km &lt;= 1000000" algoitem="SI (km > 0.01 &amp;&amp; km &lt;= 1000000) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="5#calcul#km/1.609#pasliste" algoitem="calcul PREND_LA_VALEUR km/1.609"/>
                    <item code="3#km#0#pasliste" algoitem="AFFICHER km"/>
                    <item code="4# Kilomètres = #0" algoitem="AFFICHER &quot; Kilomètres = &quot;"/>
                    <item code="3#calcul#0#pasliste" algoitem="AFFICHER calcul"/>
                    <item code="4# Miles#1" algoitem="AFFICHER &quot; Miles&quot;"/>
                    <item code="4#Appuyez sur q pour sortir ou sur une autre touche pour recommencer !#0" algoitem="AFFICHER &quot;Appuyez sur q pour sortir ou sur une autre touche pour recommencer !&quot;"/>
                    <item code="2#sortie#pasliste" algoitem="LIRE sortie"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="4#Vous n'avez pas indiqué un nombre entre 0.01 et 1 000 000, recommancer !#1" algoitem="AFFICHER &quot;Vous n'avez pas indiqué un nombre entre 0.01 et 1 000 000, recommancer !&quot;"/>
                        <item code="5#sortie#&quot;a&quot;#pasliste" algoitem="sortie PREND_LA_VALEUR &quot;a&quot;"/>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="4#Saisir une valeur en Miles compris entre 0.01 et 1 000 000 : #1" algoitem="AFFICHER &quot;Saisir une valeur en Miles compris entre 0.01 et 1 000 000 : &quot;"/>
                    <item code="2#mi#pasliste" algoitem="LIRE mi"/>
                    <item code="6#mi > 0.01 &amp;&amp; mi &lt;= 1000000" algoitem="SI (mi > 0.01 &amp;&amp; mi &lt;= 1000000) ALORS">
                        <item code="7#debutsi" algoitem="DEBUT_SI"/>
                        <item code="5#calcul#mi*1.609#pasliste" algoitem="calcul PREND_LA_VALEUR mi*1.609"/>
                        <item code="3#mi#0#pasliste" algoitem="AFFICHER mi"/>
                        <item code="4# Miles = #0" algoitem="AFFICHER &quot; Miles = &quot;"/>
                        <item code="3#calcul#0#pasliste" algoitem="AFFICHER calcul"/>
                        <item code="4# Kilomètres#1" algoitem="AFFICHER &quot; Kilomètres&quot;"/>
                        <item code="4#Appuyez sur q pour sortir ou sur une autre touche pour recommencer !#0" algoitem="AFFICHER &quot;Appuyez sur q pour sortir ou sur une autre touche pour recommencer !&quot;"/>
                        <item code="2#sortie#pasliste" algoitem="LIRE sortie"/>
                        <item code="8#finsi" algoitem="FIN_SI"/>
                        <item code="9#sinon" algoitem="SINON">
                            <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                            <item code="4#Vous n'avez pas indiqué un nombre entre 0.01 et 1 000 000, recommancer !#1" algoitem="AFFICHER &quot;Vous n'avez pas indiqué un nombre entre 0.01 et 1 000 000, recommancer !&quot;"/>
                            <item code="5#sortie#&quot;a&quot;#pasliste" algoitem="sortie PREND_LA_VALEUR &quot;a&quot;"/>
                            <item code="11#finsinon" algoitem="FIN_SINON"/>
                        </item>
                    </item>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
