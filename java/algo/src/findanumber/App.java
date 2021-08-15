package findanumber;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static int[] myArray;
    static int mystery;
    static Boolean find = false;

    public static void main(String[] args) {
        System.out.println("Rechercher un nombre dans un tableau !");

        // array initialization
        myArray = new int[]{2,5,8,13,18};

        do {
            mystery = askUserNumber();
            numberFind();
        } while (find == false);
    }

    // Asks the user to enter a number
    static int askUserNumber() {
        String userEntry = new String();
        int userNumber;

        System.out.println("Choisir un nombre entier entre 1 et 20 :");
        do {
            userEntry = scanner.nextLine();

            //Test of the user input
            try {
                userNumber = Integer.parseInt(userEntry);
                if (userNumber < 1 || userNumber > 20) {
                    throw new Exception("Le nombre n'est pas compris entre 1 et 20.");
                } else {
                    return userNumber;
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas choisi un nombre entier ou il n'est pas compris entre 1 et 20, recommencez :");
            }
        } while (true);
    }

    static void numberFind() {
        // check for each cell of the table if the number is there
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == mystery) {
                find = true;
            }
        }

        // Display of the result
        if (find) {
            System.out.println("Vous avez Gagnez !");
        } else {
            System.out.println("Perdu, rejouez !");
        }
    }
}
