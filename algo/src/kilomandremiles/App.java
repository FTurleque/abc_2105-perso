package kilomandremiles;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double userNumber = 0;
        String unity,
               exit,
               userEnter;

        System.out.println("Conversion kilomètre en Miles et inversement !");
        exit = new String();
        userEnter = new String();

        
        do {
            //System.out.println("Choisir une valeur comprise entre 0.01 et 1 000 000 :");
            //userNumber = scanner.nextDouble();
            userNumber = userEnterNumber(userEnter);
            
            if (userNumber > 0.01 && userNumber <= 100000) {
                System.out.println("Choisir l'unitée à convertir, tapez km pour Kilomètre et mi pour Miles :");
                unity = scanner.next();

                if (unity.equalsIgnoreCase("km")) 
                {  
                    System.out.println(userNumber + " Kilomètre = " + userNumber/1.609 + " Miles !");

                } else {
                    System.out.println(userNumber + " Miles = " + userNumber*1.609 + " Kilomètre !");

                }

                System.out.println("Appuyez sur q pour sortir du programme ou une autre touche pour recommencer !");
                exit = scanner.next(); 
                
            }  else {
                System.out.println("Vous n'avez pas indiqué une valeur entre 0.001 et 1 000 000 !");
            }
        } while (!exit.equalsIgnoreCase("q"));
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

    static String userEnterUnity(String unity) {
        System.out.println("Choisir l'unitée à convertir, tapez km pour Kilomètre et mi pour Miles :");
        unity = scanner.next();

    }
}
