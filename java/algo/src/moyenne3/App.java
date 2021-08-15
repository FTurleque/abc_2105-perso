package moyenne3;

import java.util.Scanner; // importer le composant Scanner

public class App {
    static Scanner  scanner = new Scanner(System.in);
    static String   userEntry;
    static int      index;
    static Boolean  test;
    static String[] numberTable;
    static Double   somme = 0.0, 
                    mean;

    public static void main(String[] args) {
        System.out.println("Programme de calcul de la moyenne de 2 nombres.");

        do {
            askNumber("Veuillez saisir des nombres séparés par un espace :");
            calculationOfTheMean();
            continuOrNot("Souhaitez-vous faire un autre calcul ? (O/N)");
        } while (userEntry.equalsIgnoreCase("o"));

    }

    // I ask the user to enter a value
    static void askNumber(String question) {
        test = false;
        do {
            System.out.println(question);
            userEntry = scanner.nextLine();

            numberTable = userEntry.split(" ");

            // Test of the user input
            try {
                for (int i = 0; i < numberTable.length; i++) {
                    Double.parseDouble(numberTable[i]);
                    // System.out.println(boardNumber[index]);
                }
                test = true;
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println(index + " n'est pas un nombre, recommencez :");
            }
        } while (test.equals(false));
    }

    static void calculationOfTheMean() {
        for (index = 0; index < numberTable.length; index++) {
            somme += Double.parseDouble(numberTable[index]);
        }
        mean = somme / (double)index;
        System.out.println("La moyenne est de : " + mean);
    }

    static String continuOrNot(String question) {
        test = false;
        do {
            System.out.println(question);
            userEntry = scanner.nextLine();

            try {
                if (userEntry.equalsIgnoreCase("o") || userEntry.equalsIgnoreCase("n")) {
                    test = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                //TODO: handle exception
                question = "Vous n'avez pas entré (O/N).\nRecommencez :";
            }
        } while (test.equals(false));
        return userEntry;
    }
}
