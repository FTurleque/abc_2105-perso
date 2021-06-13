package kmandmilesthree;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String   userEnter,
                 go,
                 unity;
        String[][] boardValious;
        Scanner scanner;
        int valious = 0;

        System.out.println("Conversion Kilomètre en Miles et inversement !");
        scanner = new Scanner(System.in);
        unity = new String();
        userEnter = new String();
        boardValious = new String[6][2];


        do {
            System.out.println("Choisir plusieurs valeurs et sont unité de mesure suivi d'un espace :");
            System.out.println("km pour kilomètre et mi pour miles.");
            System.out.println("Tapez go pour lancer les calculs.");

            while (!userEnter.equals("go")) {
                
                userEnter = scanner.nextLine();

                if (!userEnter.equalsIgnoreCase("go")) {
                    // I split userEnter in a board with two valious in the format string
                    boardValious = userEnter.split(" ");

                    // I convert the first box of the table in a integer 
                    valious = Integer.parseInt(boardValious[0]);
            
                    if (boardValious.length < 2) {
                    unity = "km";
                    } else {
                        unity = boardValious[1];
                    }
                }

            }
            
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

        scanner.close();
        
    }
    
}
