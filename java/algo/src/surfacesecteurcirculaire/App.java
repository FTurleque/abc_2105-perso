package surfacesecteurcirculaire;

import java.util.Scanner;
import java.lang.Math;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String userEnter = new String();
    static double ray = 0;
    static double angle = 0;
    private static double aire;

    public static void main(String[] args) {
        System.out.println("Calcul de la surface d’un secteur circulaire");

        // I break down the formulas
        ray = userEntryRay("Choisir le rayon de la sphère :");
        angle = userEntryAngle("Choisir l'angle de la sphère :");

        // Display of the calculation
        System.out.println("L'aire du secteur circulaire est de : " + sectorArea());
    }

    // Asks the user to enter a number
    static double userEntryRay(String message) {
        do {
            System.out.println(message);
            userEnter = scanner.nextLine();

            // Test of the user input
            try {
                return Double.parseDouble(userEnter);
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Vous n'avez pas rentrer un nombre ! Recommencez !");
            }
        } while (true);
    }

    // Asks the user to enter a number
    static double userEntryAngle(String message) {
        do {
            System.out.println(message);
            userEnter = scanner.nextLine();

            // Test of the user input
            try {
                return Double.parseDouble(userEnter);
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Vous n'avez pas rentrer un nombre ! Recommencez !");
            }
        } while (true);
    }

    // calculation of the mean
    static Double sectorArea() {
        double result = 0;

        aire = Math.PI * Math.pow(ray, 2);

        result = aire * angle / 360;
        return result;
    }
}
