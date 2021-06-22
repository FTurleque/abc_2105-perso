package kmandmilestwo;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String   userEnter,
                 unity;
        String[] boardValious;
        int valious;

        System.out.println("Conversion Kilomètre en Miles et inversement !");
        unity = new String();


        do {
            System.out.println("Choisir une valeur et sont unité de mesure suivi d'un espace :");
            System.out.println("km pour kilomètre et mi pour miles.");
            userEnter = scanner.nextLine();
        
            // I split userEnter in a board with two valious in the format string
            boardValious = userEnter.split(" ");
            
            /* Check what is in the table 
            System.out.println(boardValious[0]);
            System.out.println(boardValious[1]);
            */
            
            if (!boardValious[0].equalsIgnoreCase("quit")) {
                // I convert the first box of the table in a integer 
                valious = Integer.parseInt(boardValious[0]);
            
                if (boardValious.length < 2) {
                    unity = "km";
                } else {
                    unity = boardValious[1];
                }

                if (unity.equalsIgnoreCase("km")) {
                    System.out.println(valious + " Kilomètre = " + valious/1.609 + " Miles !");
                } 
                else if (unity.equalsIgnoreCase("mi")) {
                    System.out.println(valious + " Miles = " + valious*1.609 + " Kilomètre !");
                } 
                else {
                    System.out.println("Vous n'avez pas saisie une valeur ou quit pour quitter !");
                }
            }
            
        } while (!boardValious[0].equalsIgnoreCase("quit"));
    }
}
