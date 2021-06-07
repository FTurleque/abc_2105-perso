<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHERCALCUL 4/3*Math.PI*pow(rayon_R,3)"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2lignes="" F2etat="inactif" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" epaisseurPoint="2" totalAffichages="1000" totalBoucles="5000000" nbDecimales="8" arrondiAuto="vrai" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#rayon_R" algoitem="rayon_R EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Choisissez le rayon de la sphère : #0" algoitem="AFFICHER &quot;Choisissez le rayon de la sphère : &quot;"/>
        <item code="2#rayon_R#pasliste" algoitem="LIRE rayon_R"/>
        <item code="4#L'aire de la spère est de : #0" algoitem="AFFICHER &quot;L'aire de la spère est de : &quot;"/>
        <item code="20#4*Math.PI*pow(rayon_R,2)#1" algoitem="AFFICHERCALCUL 4*Math.PI*pow(rayon_R,2)"/>
        <item code="4#Le volume de la sphère est de : #0" algoitem="AFFICHER &quot;Le volume de la sphère est de : &quot;"/>
        <item code="20#4/3*Math.PI*pow(rayon_R,3)#0" algoitem="AFFICHERCALCUL 4/3*Math.PI*pow(rayon_R,3)"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
