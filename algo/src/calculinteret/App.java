package calculinteret;

import java.util.Scanner;
import java.lang.Math;


public class App {
    static Scanner scanner = new Scanner(System.in);
    static String userEnter = new String();

    public static void main(String[] args) {
        
        float account,
              bankInterest;
        int years;

        System.out.println("Calcul d’intérêts");

        account = getUserAcount("Quel est la somme placée sur le compte ?");

        bankInterest = getBankInterest("Quel est l'intérêt offert par la banque en pourcentage ?");

        years = getYears("Pendant combien d'années cette somme a-t-elle été placée ?");

        double interetsimple = account * (1 + years * bankInterest);
        double interetcompose = account * Math.pow((1 + bankInterest), years);

        System.out.println("Avec un intérêt simple vous aurez gagné : " + (interetsimple - account));

        System.out.println("Avec un intérêt composé vous aurez gagné : " + (interetcompose - account));
    }

    static float getUserAcount(String question) {
        do {
            System.out.println(question);
            userEnter = scanner.nextLine();

            try {
                return Float.parseFloat(userEnter);
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas entré un nombre ! Recommencez !");
            }
        } while (true);
    }

    static float getBankInterest(String question) {
        do {
            System.out.println(question);
            userEnter = scanner.nextLine();

            try {
                return Float.parseFloat(userEnter);
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas entré un nombre ! Recommencez !");
            }
        } while (true);
    }

    static int getYears(String question) {
        do {
            System.out.println(question);
            userEnter = scanner.nextLine();

            try {
                return Integer.parseInt(userEnter);
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas entré un nombre entier ! Recommencez !");
            }
        } while (true);
    }
}
