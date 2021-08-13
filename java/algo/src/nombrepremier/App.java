package nombrepremier;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String userEnter = new String();
    
    public static void main(String[] args) {
        int userNumber;
        int diviseur = 2;

        System.out.println("Déterminer s’il est un nombre premier !");

        // Save user input in a variable
        userNumber = getUserEntry("choisir un nombre entier naturel : ");

        userNumber = Math.abs(userNumber); // For absolute value of a number

        // To determine if a is prime we look for the divisors of n, from 2 to square root of n
        while (userNumber % diviseur != 0 && diviseur <= Math.sqrt(userNumber)) {
            diviseur++;
        }

        // A prime number has 2 divisors 1 and itself
        // Display of the calculation
        if (diviseur > Math.sqrt(userNumber)) {
            System.out.println("Vous avez choisi un nombre premier !");
        } else {
            System.out.println("Vous n'avez pas choisi un nombre premier !");
        }
    }

    // Asks the user to enter a number
    static int getUserEntry(String message) {
        do {
            System.out.println(message);
            userEnter = scanner.nextLine();

            // Test of the user input
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

