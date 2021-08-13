package invrsion2valeurs;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static int a = 0;
    static int b = 0;

    public static void main(String[] args) {
        System.out.println("Inversion de deux valeurs !");

        // Save user input in a variable
        a = askNumber("Choisir une valeur entiere pour a :");
        b = askNumber("Choisir une valeur entiere pour b :");

        inversionAB();

        // Display of the calculation
        System.out.println("La valeur de (a) devient: " + a);
        System.out.println("La valeur de (b) devient: " + b);
    }

    // Asks the user to enter a number
    static int askNumber(String message) {
        String userEnter;

        do {
            System.out.println(message);
            userEnter = scanner.nextLine();

            // Test of the user input
            try {
                return Integer.parseInt(userEnter);
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas choisie un nombre entier, recommencez");
            }
        } while (true);
    }

    static void inversionAB() {
        int c;

        c = a;
        a = b;
        b = c;
    }
}
