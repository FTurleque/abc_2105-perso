package aireetvolumesphere;

import java.lang.Math;
import java.util.Scanner;

public class App {

    // Intialization of Scanner variable in the class for used everywere
    static Scanner scanner = new Scanner(System.in);
    private static double volume;
    private static double aire;

    public static void main(String[] args) {
        int ray = 0;
        String rayCircle;

        System.out.println("Calcul de l’aire et du volume d’une sphère !");
        rayCircle = new String();

        ray = userEnter(rayCircle);
        
        // I break down the formulas
        aire = Math.PI*Math.pow(ray, 2);
        volume = Math.PI*Math.pow(ray, 3);

        System.out.println("L'aire de la sphère est de : " + 4 * aire);

        //System.out.println("Le volume de la sphère est de : " + volume * 4 / 3);
        //System.out.println("Le volume de la sphère est de : " + Math.PI*Math.pow(rayonR, 3) * 4 / 3);
        System.out.println("Le volume de la sphère est de : " + ((4d / 3d) * volume));
    }

    static int userEnter(String userNumber) {
        int rayCircle = 0;

        do {
            // I print on a screen a sentece
            System.out.println("Choisir le rayon de la sphère : ");
            // I ask the user to enter a value
            userNumber = scanner.nextLine();

            try {
                rayCircle = Integer.parseInt(userNumber);
                return rayCircle;
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas ecrit un nombre recommencez !");
            }
        } while (true);
    }
}
