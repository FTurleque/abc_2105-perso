package kilomandremiles;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static Double userNumber = (double)0;
    static String unity = new String();
    static String exit = new String();

    public static void main(String[] args) {
        String userEnter;

        System.out.println("Conversion kilomètre en Miles et inversement !");
        userEnter = new String();
        
        do {
            userNumber = userEnterNumber(userEnter);
            
            if (userNumber > 0.01 && userNumber <= 100000) {
                System.out.println(userEnterUnity());

                exitOrNot("Appuyez sur q pour sortir du programme ou une autre touche pour recommencer !");
            }  else {
                System.out.println("Vous n'avez pas indiqué une valeur entre 0.001 et 1 000 000 !");
            }
        } while (true);
    }

    static double userEnterNumber(String userEnter) {

        do {
            System.out.println("Choisir une valeur comprise entre 0.01 et 1 000 000 :");
            userEnter = scanner.nextLine();

            try {
                return Double.parseDouble(userEnter);
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas choisi un nombre, recommencez !");
            }
        } while (true);
    }

    static String userEnterUnity() {

        do {
            System.out.println("Choisir l'unitée à convertir, tapez km pour Kilomètre et mi pour Miles :");
            unity = scanner.nextLine();
    
            try {
                if (unity.equalsIgnoreCase("km") || unity.equalsIgnoreCase("mi") || unity.isEmpty()) {
                    if (unity.equalsIgnoreCase("km") || unity.isEmpty()) {  
                        return userNumber + " Kilomètre = " + userNumber/1.609 + " Miles !";
                    } else {
                        return userNumber + " Miles = " + userNumber*1.609 + " Kilomètre !";
                    }
                } else {
                    // génére une nouvelle exception
                    throw new Exception("Ceci est une erreur");
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas écrit km ou mi, recommencez !");
            }
        } while (true);
    }

    static void exitOrNot(String message) {
        System.out.println(message);
        exit = scanner.nextLine();
        if (exit.equalsIgnoreCase("q") || exit.isEmpty()) {
            System.exit(0);
        }
        //return exit;
    }
}
