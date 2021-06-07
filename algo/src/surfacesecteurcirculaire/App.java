package surfacesecteurcirculaire;

import java.util.Scanner;
import java.lang.Math;

public class App {
    
    private static double aire;

    public static void main(String[] args) {
        
        int rayon;
        int angle;
        Scanner scanner;

        System.out.println("Calcul de la surface d’un secteur circulaire");

        scanner = new Scanner(System.in);

        System.out.println("Choisir le rayon de la sphère : ");
        rayon = scanner.nextInt();

        System.out.println("Choisir l'angle de la sphère : ");
        angle = scanner.nextInt();

        aire = Math.PI * Math.pow(rayon, 2);

        System.out.println("L'aire du secteur circulaire est de : " + aire * angle / 360);

        scanner.close();
    }
}
