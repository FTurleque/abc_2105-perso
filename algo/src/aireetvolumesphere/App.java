package aireetvolumesphere;

import java.lang.Math;
import java.util.Scanner;

public class App {

    private static double volume;
    private static double aire;

    public static void main(String[] args) {
        
        int rayon;
        Scanner scanner;

        System.out.println("Calcul de l’aire et du volume d’une sphère !");

        scanner = new Scanner(System.in);


        System.out.println("Choisir le rayon de la sphère : ");

        rayon = scanner.nextInt();
        
        aire = Math.PI*Math.pow(rayon, 2);
        volume = Math.PI*Math.pow(rayon, 3);

        
        System.out.println("L'aire de la sphère est de : " + 4 * aire);

        System.out.println("Le volume de la sphère est de : " + volume * 4 / 3);
        System.out.println("Le volume de la sphère est de : " + Math.PI*Math.pow(rayon, 3) * 4 / 3);
        System.out.println("Le volume de la sphère est de : " + ((4d / 3d) * volume));  // Formule exact le 4/3 est considéré comme un double, un nombre a virgule donc on rajoute un d

        scanner.close();

    }
}
