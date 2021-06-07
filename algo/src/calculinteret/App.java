package calculinteret;

import java.util.Scanner;
import java.lang.Math;


public class App {
    

    public static void main(String[] args) {
        
        int solde;
        int interet;
        int annees;
        Scanner scanner;

        System.out.println("Calcul d’intérêts");

        scanner = new Scanner(System.in);

        System.out.println("Quel est la somme placée sur le compte ?");
        solde = scanner.nextInt();

        System.out.println("Quel est l'intérêt offert par la banque en pourcentage ?");
        interet = scanner.nextInt();

        System.out.println("Pendant combien d'années cette somme a-t-elle été placée ?");
        annees = scanner.nextInt();

        double interetsimple = solde * (1 + annees * interet);
        double interetcompose = solde * Math.pow((1 + interet), annees);

        System.out.println("Avec un intérêt simple vous aurez gagné : " + (interetsimple - solde));

        System.out.println("Avec un intérêt composé vous aurez gagné : " + (interetcompose - solde));

        scanner.close();
    }
}
