package nombrepremier;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int n;
        int diviseur;
        Scanner scanner;

        System.out.println("Déterminer s’il est un nombre premier !");
        scanner = new Scanner(System.in);

        System.out.println("choisir un nombre entier naturel : ");
        n = scanner.nextInt();

        diviseur = 2;
        n = Math.abs(n); // Pour la valeur absolue d'un nombre.

        // Pour determiner si un est premier on cherche les diviseur de n, de 2 à racine carrée de n.
        while (n % diviseur != 0 && diviseur <= Math.sqrt(n)) {
            diviseur = diviseur + 1;
        }

        // Un nombre premier admet 2 diviseur 1 et lui même.
        if (diviseur > Math.sqrt(n)) {
            System.out.println("Vous avez choisi un nombre premier !");
        } else {
            System.out.println("Vous n'avez pas choisi un nombre premier !");
        }


        scanner.close();

    }

}
