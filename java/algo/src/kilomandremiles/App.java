package kilomandremiles;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static Double userNumber = (double)0;
    static String unity = new String();
    static String exit = new String();
    static String userEnter;

    public static void main(String[] args) {
        System.out.println("Conversion kilomètre en Miles et inversement !");
        
        do {
            // Save user input in a variable
            userNumber = userEntryNumber("Choisir une valeur comprise entre 0.01 et 1 000 000 :");
            
            if (userNumber > 0.01 && userNumber <= 100000) {
                System.out.println(userEntryUnity());

                // Program output
                exitOrNot("Appuyez sur q pour sortir du programme ou une autre touche pour recommencer !");
            }  else {
                System.out.println("Vous n'avez pas indiqué une valeur entre 0.001 et 1 000 000 !");
            }
        } while (true);
    }

    // Asks the user to enter a number
    static double userEntryNumber(String message) {
        System.out.println(message);
        do {
            userEnter = scanner.nextLine();

            // Test of the user input
            try {
                return Double.parseDouble(userEnter);
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas choisi un nombre, recommencez !");
            }
        } while (true);
    }

    // Asks the user to enter a unity
    static String userEntryUnity() {
        do {
            System.out.println("Choisir l'unitée à convertir, tapez km pour Kilomètre et mi pour Miles :");
            unity = scanner.nextLine();
    
            // Test of the user input
            try {
                if (unity.equalsIgnoreCase("km") || unity.equalsIgnoreCase("mi") || unity.isEmpty()) {
                    // Display of the calculation
                    if (unity.equalsIgnoreCase("km") || unity.isEmpty()) {  
                        return userNumber + " Kilomètre = " + userNumber/1.609 + " Miles !";
                    } else {
                        return userNumber + " Miles = " + userNumber*1.609 + " Kilomètre !";
                    }
                } else {
                    // generates a new exception
                    throw new Exception("Ceci est une erreur");
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas écrit km ou mi, recommencez !");
            }
        } while (true);
    }

    // Program output
    static void exitOrNot(String message) {
        System.out.println(message);
        exit = scanner.nextLine();
        if (exit.equalsIgnoreCase("q") || exit.isEmpty()) {
            System.exit(0);
        }
        //return exit;
    }
}
