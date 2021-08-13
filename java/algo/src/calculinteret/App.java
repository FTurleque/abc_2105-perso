package calculinteret;

import java.util.Scanner;
import java.lang.Math;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String userEnter = new String();

    public static void main(String[] args) {
        float account, bankInterest;
        int years;

        System.out.println("Calcul d’intérêts");

        // Save user input in a variable
        account = getUserAcount("Quel est la somme placée sur le compte ?");
        bankInterest = getBankInterest("Quel est l'intérêt offert par la banque en pourcentage ?");
        years = getYears("Pendant combien d'années cette somme a-t-elle été placée ?");

        // I break down the formulas
        double interetsimple = account * (1 + years * bankInterest);
        double interetcompose = account * Math.pow((1 + bankInterest), years);

        // Display of the calculation
        System.out.println("Avec un intérêt simple vous aurez gagné : " + (interetsimple - account));
        System.out.println("Avec un intérêt composé vous aurez gagné : " + (interetcompose - account));
    }

    // Asks the user to enter a number
    static float getUserAcount(String question) {
        do {
            System.out.println(question);
            userEnter = scanner.nextLine();

            // Test of the user input
            try {
                return Float.parseFloat(userEnter);
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Vous n'avez pas entré un nombre ! Recommencez !");
            }
        } while (true);
    }

    // Asks the user to enter a number
    static float getBankInterest(String question) {
        do {
            System.out.println(question);
            userEnter = scanner.nextLine();

            // Test of the user input
            try {
                return Float.parseFloat(userEnter);
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Vous n'avez pas entré un nombre ! Recommencez !");
            }
        } while (true);
    }

    // Asks the user to enter a year
    static int getYears(String question) {
        do {
            System.out.println(question);
            userEnter = scanner.nextLine();

            // Test of the user input
            try {
                return Integer.parseInt(userEnter);
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Vous n'avez pas entré un nombre entier ! Recommencez !");
            }
        } while (true);
    }
}
