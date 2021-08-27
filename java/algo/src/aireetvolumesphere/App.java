package aireetvolumesphere;

import java.lang.Math;
import java.util.Scanner;

public class App {

    // Intialization of Scanner variable in the class for used everywere
    static Scanner scanner = new Scanner(System.in);
    private static double volume;
    private static double aire;

    public static void main(String[] args) {
        // Variable declaration
        double ray = 0;
        String rayCircle;

        System.out.println("Calcul de l’aire et du volume d’une sphère !");
        rayCircle = new String();

        // Save user input in a variable
        ray = userEntry(rayCircle);

        // I break down the formulas
        aire = Math.PI * Math.pow(ray, 2);
        volume = Math.PI * Math.pow(ray, 3);
        
        // calculation of the mean
        System.out.println("L'aire de la sphère est de : " + 4 * aire);
        System.out.println("Le volume de la sphère est de : " + ((4 / 3) * volume));
    }

    // I ask the user to enter a value
    static double userEntry(String userNumber) {
        do {
            // I print on a screen a sentece
            System.out.println("Choisir le rayon de la sphère : ");
            userNumber = scanner.nextLine();

            // Test of the user input
            try {
                return Double.parseDouble(userNumber);
                // return rayCircle;
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Vous n'avez pas ecrit un nombre recommencez !");
            }
        } while (true);
    }
}
