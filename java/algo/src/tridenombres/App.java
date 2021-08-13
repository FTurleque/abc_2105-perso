package tridenombres;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String   userEntry,
                    result;
    static Double userNumber;
    static  Double  a, 
                    b, 
                    c;

    public static void main(String[] args) {
        System.out.println("Tri de nombres !");

        // Save user input in a variable
        a = askUserEntry("Choisir un nombre pour a :");
        b = askUserEntry("Choisir un nombre pour b :");
        c = askUserEntry("Choisir un nombre pour b :");

        // Display of the result
        classification("Les nombres dans l'ordre croissant sont : ");
    }

    // Asks the user to enter a number
    static Double askUserEntry(String message) {
        Boolean test;
        System.out.println(message);
        do {
            userEntry = scanner.nextLine();

            // Test of the user input
            try {
                userNumber = Double.parseDouble(userEntry);
                test = true;
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Vous n'avez pas choisi un nombre. Recommencez :");
                test = false;
            }
        } while (test = false);
        return userNumber;
    }

    static void classification(String message) {
        if (a <= b) {
            if (c > a && c < b) {
                result = a + " " + c + " " + b;
            }
            if (c <= a) {
                result = c + " " + a + " " + b;
            }
            if (c > b) {
                result = a + " " + b + " " + c;
            }
        } else {
            if (c <= b) {
                result = c + " " + b + " " + a;
            }
            if (c > a) {
                result = b + " " + a + " " + c;
            }
            if (c > b && c < a) {
                result = b + " " + c + " " + a;
            }
        }
        System.out.println(message + result);
    }
}
