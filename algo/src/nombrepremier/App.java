package nombrepremier;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String userEnter = new String();
    
    public static void main(String[] args) {
        int userNumber;
        int diviseur = 2;

        System.out.println("Déterminer s’il est un nombre premier !");

        userNumber = getUserEnter("choisir un nombre entier naturel : ");

        userNumber = Math.abs(userNumber); // Pour la valeur absolue d'un nombre.

        // Pour determiner si un est premier on cherche les diviseur de n, de 2 à racine carrée de n.
        while (userNumber % diviseur != 0 && diviseur <= Math.sqrt(userNumber)) {
            diviseur++;
        }

        // Un nombre premier admet 2 diviseur 1 et lui même.
        if (diviseur > Math.sqrt(userNumber)) {
            System.out.println("Vous avez choisi un nombre premier !");
        } else {
            System.out.println("Vous n'avez pas choisi un nombre premier !");
        }
    }

    static int getUserEnter(String message) {
        do {
            System.out.println(message);
            userEnter = scanner.nextLine();

            try {
                return Integer.parseInt(userEnter);
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Vous n'avez pas entré un nombre entier ! Recommencez !");
            }
        } while (true);
    }
/*
    // correction en classe

    public static void main(String[] args) {
        int num2test = 0, divise = 2;
        Boolean first = true;
        Scanner scanner;

        scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre pour verifier s'il est premier !");
        num2test =scanner.nextInt();

        num2test = Math.abs(num2test);

        while(divise < num2test) {
            first = !(num2test + divise++ == 0);
        }

        if (first) {
            System.out.println("Le nombre est premier !");
        } else {
            System.out.println("Le nombre n'est pas premier");
        }

        scanner.close();

    }
    */
}

