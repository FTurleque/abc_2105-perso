<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;Avez-vous le 1er Tome de Game of Throne ?&quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2etat="inactif" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" epaisseurPoint="2" epaisseurLigne="2" nbDecimales="8" arrondiAuto="vrai" totalBoucles="5000000" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="il_fait_beau EST_DU_TYPE NOMBRE" code="1#NOMBRE#il_fait_beau"/>
        <item algoitem="etat_bicyclette EST_DU_TYPE NOMBRE" code="1#NOMBRE#etat_bicyclette"/>
        <item algoitem="reparation_bicyclette_rapide EST_DU_TYPE NOMBRE" code="1#NOMBRE#reparation_bicyclette_rapide"/>
        <item algoitem="possession_game_of_thrones EST_DU_TYPE NOMBRE" code="1#NOMBRE#possession_game_of_thrones"/>
        <item algoitem="disponibilite_tome1_game_of_thrones EST_DU_TYPE NOMBRE" code="1#NOMBRE#disponibilite_tome1_game_of_thrones"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Fait-il beau ?&quot;" code="4#Fait-il beau ?#0"/>
        <item algoitem="LIRE il_fait_beau" code="2#il_fait_beau#pasliste"/>
        <item algoitem="SI (il_fait_beau) ALORS" code="6#il_fait_beau">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Vous avez indiqué qu'il fait beau ! &quot;" code="4#Vous avez indiqué qu'il fait beau ! #1"/>
            <item algoitem="AFFICHER &quot;La bicyclette est-elle en bon état ? &quot;" code="4#La bicyclette est-elle en bon état ? #0"/>
            <item algoitem="LIRE etat_bicyclette" code="2#etat_bicyclette#pasliste"/>
            <item algoitem="SI (etat_bicyclette) ALORS" code="6#etat_bicyclette">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Votre bicyclette est en bon état, vous pouvez aller vous promener a vélo !&quot;" code="4#Votre bicyclette est en bon état, vous pouvez aller vous promener a vélo !#0"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="AFFICHER &quot;Le vélo est en mauvais état, il nécéssite une réparation ! &quot;" code="4#Le vélo est en mauvais état, il nécéssite une réparation ! #1"/>
                    <item algoitem="AFFICHER &quot;La réparation est-elle rapide ? &quot;" code="4#La réparation est-elle rapide ? #1"/>
                    <item algoitem="LIRE reparation_bicyclette_rapide" code="2#reparation_bicyclette_rapide#pasliste"/>
                    <item algoitem="SI (reparation_bicyclette_rapide) ALORS" code="6#reparation_bicyclette_rapide">
                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                        <item algoitem="AFFICHER &quot;la réparation est immédiate, vous pouvez aller faire du vélo !&quot;" code="4#la réparation est immédiate, vous pouvez aller faire du vélo !#0"/>
                        <item algoitem="FIN_SI" code="8#finsi"/>
                        <item algoitem="SINON" code="9#sinon">
                            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                            <item algoitem="AFFICHER &quot;La réparation est trop longue, allez y à pied !&quot;" code="4#La réparation est trop longue, allez y à pied !#0"/>
                            <item algoitem="FIN_SINON" code="11#finsinon"/>
                        </item>
                    </item>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="AFFICHER &quot;Vous avez indiqué qu'il pleut.&quot;" code="4#Vous avez indiqué qu'il pleut.#1"/>
                <item algoitem="AFFICHER &quot;Avez-vous le 1er Tome de Game of Throne ?&quot;" code="4#Avez-vous le 1er Tome de Game of Throne ?#0"/>
                <item algoitem="LIRE possession_game_of_thrones" code="2#possession_game_of_thrones#pasliste"/>
                <item algoitem="SI (possession_game_of_thrones) ALORS" code="6#possession_game_of_thrones">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;Vous possedez le livre, vous pouvez le relire !&quot;" code="4#Vous possedez le livre, vous pouvez le relire !#0"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="AFFICHER &quot;Vous ne possédez pas le livre, allez à la bibliothèque !&quot;" code="4#Vous ne possédez pas le livre, allez à la bibliothèque !#0"/>
                        <item algoitem="LIRE disponibilite_tome1_game_of_thrones" code="2#disponibilite_tome1_game_of_thrones#pasliste"/>
                        <item algoitem="SI (disponibilite_tome1_game_of_thrones) ALORS" code="6#disponibilite_tome1_game_of_thrones">
                            <item algoitem="DEBUT_SI" code="7#debutsi"/>
                            <item algoitem="AFFICHER &quot;Le Tome 1 est disponible, vous pouvez l'emprunter !&quot;" code="4#Le Tome 1 est disponible, vous pouvez l'emprunter !#0"/>
                            <item algoitem="FIN_SI" code="8#finsi"/>
                            <item algoitem="SINON" code="9#sinon">
                                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                <item algoitem="AFFICHER &quot;Le livre n'est pas disponible, empruntez en un autre !&quot;" code="4#Le livre n'est pas disponible, empruntez en un autre !#0"/>
                                <item algoitem="FIN_SINON" code="11#finsinon"/>
                            </item>
                        </item>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
