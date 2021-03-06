package anneebissextile;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String userEnter;
        int year = 0;

        System.out.println("Année Bissextile");
        userEnter = new String();

        // Save user input in a variable
        year = userEntryYear(userEnter);
        
        // I see if the year is divisible by 4 and not by 100 or not by 400
        // Display of the result
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(userEnter + " est Bissextile");
        } else {
            System.out.println(userEnter + " n'est pas Bissextile");
        }
    }

    // Asks the user to enter a year
    static int userEntryYear(String userEnter) {
        int userNumber;

        do {
            System.out.println("Choisir une année :");
            userEnter = scanner.nextLine();

            // Test of the user input
            try {
                userNumber = Integer.parseInt(userEnter);
                return userNumber;
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas ecrit un nombre entier recommencez !");
            }
        } while (true);
    }
}