package kmandmilesthree;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String   userEnter,
                 go,
                 unity;
        String[] boardValious;
        int valious = 0;

        System.out.println("Conversion Kilomètre en Miles et inversement !");
        unity = new String();
        userEnter = new String();
        boardValious = new String[12];


        do {
            System.out.println("Choisir plusieurs valeurs et sont unité de mesure suivi d'un espace :");
            System.out.println("km pour kilomètre et mi pour miles.");
            System.out.println("Tapez go pour lancer les calculs.");

            do {
                
                userEnter = scanner.nextLine();

                // I split userEnter in a board with two valious in the format string
                boardValious = userEnter.split(" ");

                if (!userEnter.equalsIgnoreCase("go")) {

                    // I convert the first box of the table in a integer 
                    valious = Integer.parseInt(userEnter);
            
                    if (boardValious.length < 2) {
                    unity = "km";
                    } else {
                        unity = boardValious[1];
                    }
                }

            } while (!userEnter.equals("go"));
            
            System.out.println(boardValious[0]);
            System.out.println(boardValious[1]);
            System.out.println(boardValious[2]);
            System.out.println(boardValious[3]);
            System.out.println(boardValious[4]);
            System.out.println(boardValious[5]);
            
            if (!boardValious[0].equalsIgnoreCase("quit")) {
                

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
