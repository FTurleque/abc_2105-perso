package aireetvolumesphere;

import java.lang.Math;
import java.util.Scanner;

public class App {

    private static double volume;
    private static double aire;

    public static void main(String[] args) {
        
        String rayon;
        int rayonR = 0;
        Boolean find = false;
        Scanner scanner;

        System.out.println("Calcul de l’aire et du volume d’une sphère !");
        // Intialization of Scanner variable
        scanner = new Scanner(System.in);

        do {
            // I print on a screen a sentece
            System.out.println("Choisir le rayon de la sphère : ");
            // I ask the user to enter a value
            rayon = scanner.nextLine();

            try {
                rayonR = Integer.parseInt(rayon);
                find = true;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Vous n'avez pas ecrit un nombre recommencez !");
            }
        
        } while (find.equals(false));

        // I break down the formulas
        aire = Math.PI*Math.pow(rayonR, 2);
        volume = Math.PI*Math.pow(rayonR, 3);

        
        System.out.println("L'aire de la sphère est de : " + 4 * aire);

        System.out.println("Le volume de la sphère est de : " + volume * 4 / 3);
        // System.out.println("Le volume de la sphère est de : " + Math.PI*Math.pow(rayonR, 3) * 4 / 3);
        // System.out.println("Le volume de la sphère est de : " + ((4d / 3d) * volume));  // Formule exact le 4/3 est considéré comme un double, un nombre a virgule donc on rajoute un d

        scanner.close();

    }
}
