package calculinteret;

import java.util.Scanner;
import java.lang.Math;


public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int account;
        int bankInterest;
        int years;

        System.out.println("Calcul d’intérêts");

        System.out.println("Quel est la somme placée sur le compte ?");
        account = scanner.nextInt();

        System.out.println("Quel est l'intérêt offert par la banque en pourcentage ?");
        bankInterest = scanner.nextInt();

        System.out.println("Pendant combien d'années cette somme a-t-elle été placée ?");
        years = scanner.nextInt();

        double interetsimple = account * (1 + years * bankInterest);
        double interetcompose = account * Math.pow((1 + bankInterest), years);

        System.out.println("Avec un intérêt simple vous aurez gagné : " + (interetsimple - account));

        System.out.println("Avec un intérêt composé vous aurez gagné : " + (interetcompose - account));
    }
}
