package lesDivisereurs;

import java.util.Scanner;

public class App {
    static Scanner  scanner = new Scanner(System.in);
    static String   askNumber,
                    divisorNumber;
    static int      userNumber,
                    divisor,
                    divisorAsk;
                // divisorNumber = 1;
    static int[]    divisorTable;

    public static void main(String[] args) {
        userNumber = getUserEntry("Coisir un nombre entier :");
        // userNumber = Math.abs(userNumber);
        findTheDivisor("Le(s) diviseur(s) de ");
    }
    // Asks the user to enter a number
    static int getUserEntry(String message) {
        do {
            System.out.println(message);
            askNumber = scanner.nextLine();

            // Test of the user input
            try {
                return Integer.parseInt(askNumber);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Vous n'avez pas entré un nombre entier. \nRecommencez :");
            }
        } while (true);
    }

    static void findTheDivisor(String message) {
        int index = 0;

        System.out.println(message + userNumber + " est (sont) :");
        for (divisor = 2; divisor < userNumber; divisor++) {
            if (userNumber % divisor == 0) {
                // System.out.println(divisorNumber + " => " + divisor);
                // divisorNumber++;
                divisorTable[index] += divisor;
                index++;
            }
        }

        // Array.toString(divisorTable);
        
    }
}
