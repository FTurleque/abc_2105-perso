package moyenne;

import java.util.Scanner; // importer le composant Scanner

public class App {
    static Scanner scanner = new Scanner(System.in);

    // code du composant
    public static void main(String[] args) {
        double firstNumber = 0, secondNumber = 0;
        System.out.println("Calcul de la moyenne de deux nombre entier.");

        firstNumber = askNumber("Choisissez un premier nombre :");
        secondNumber = askNumber("Choisissez un second nombre :");

        // calculation of the mean
        System.out.println("Le résultat est: " + (firstNumber + secondNumber) / 2);
    }

    // I ask the user to enter a value
    static double askNumber(String question) {
        String userEnter;

        do {
            System.out.println(question);
            userEnter = scanner.nextLine();

            // Test of the user input
            try {
                return Double.parseDouble(userEnter);
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Vous n'avez pas ecrit un nombre entier recommencez !");
            }
        } while (true);
    }
}
