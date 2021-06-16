package moyenne;

import java.util.Scanner; // importer le composant Scanner

public class App {
    static Scanner scanner = new Scanner(System.in);

    // code du composant
    public static void main(String[] args) {
        int firstNumber = 0,
            secondNumber = 0;
        System.out.println("Calcul de la moyenne de deux nombre entier.");

        firstNumber = askNumber("Choisissez un premier nombre entier :");
        secondNumber = askNumber("Choisissez un second nombre entier :");
        
        System.out.println("Le résultat est: " + ((float)firstNumber + (float)secondNumber) / 2f);
    }

    static int askNumber(String question) {
        String userEnter;

        do {
            System.out.println(question);
            userEnter = scanner.nextLine();

            try {
                return Integer.parseInt(userEnter);
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas ecrit un nombre entier recommencez !");
            }
        } while (true);
    }
}
