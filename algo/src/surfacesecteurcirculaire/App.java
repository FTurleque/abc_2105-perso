package surfacesecteurcirculaire;

import java.util.Scanner;
import java.lang.Math;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String userEnter = new String();
    static int ray = 0;
    static int angle = 0;
    private static double aire;
    

    public static void main(String[] args) {
        
        System.out.println("Calcul de la surface d’un secteur circulaire");

        ray = userEnterRay("Choisir le rayon de la sphère :");
        angle = userEnterAngle("Choisir l'angle de la sphère :");

        //aire = Math.PI * Math.pow(rayon, 2);

        System.out.println("L'aire du secteur circulaire est de : " + sectorArea());
    }

    static int userEnterRay(String message) {

        do {
            System.out.println(message);
            userEnter = scanner.nextLine();

            try {
                return Integer.parseInt(userEnter);
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas rentrer un nombre ! Recommencez !");
            }
        } while (true);
    }

    static int userEnterAngle(String message) {

        do {
            System.out.println(message);
            userEnter = scanner.nextLine();

            try {
                return Integer.parseInt(userEnter);
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas rentrer un nombre ! Recommencez !");
            }
        } while (true);
    }

    static Double sectorArea()  {
        double result = 0;

        aire = Math.PI * Math.pow(ray, 2);

        result = aire * angle / 360;
        return result;
    }
}
