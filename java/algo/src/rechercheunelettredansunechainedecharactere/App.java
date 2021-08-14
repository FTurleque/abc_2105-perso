package rechercheunelettredansunechainedecharactere;

import java.util.Scanner;
// import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String userEntry;
    static String letterToFind;
    static int occurenceNumber;

    public static void main(String[] args) {
        askUserSentence("Rechercher d'une lettre dans un chaine de caractères \nEcrire une phrase se terminant par un point !");
        letterToFind(userEntry, 'a');

        // Display of the result
        System.out.println("Nombre de (a) dans la phrase : " + occurenceNumber);
    }

    // Asks the user to enter a sentence
    static void askUserSentence(String message) {
        Boolean doEnd = false;
        do {
            System.out.println(message);
            userEntry = scanner.nextLine();

            if (userEntry.isEmpty()) {
                message = "Vous n'avez rien taper, recommencez et taper une phrase :";
            } else {
                // Test of the user input
                try {
                    // [\D] Un non-chiffre : [^0-9]
                    // Check if the sentence is not a number and if it ends with a point
                    if ((Pattern.matches("[^0-9]+", userEntry) == true) && (userEntry.endsWith("."))) {
                        doEnd = true;
                    } else if (!userEntry.endsWith(".")) {
                        message = "Votre phrase ne termine pas par un point \nRecommencez :";
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                    message = "Vous avez taper un nombre, recommencez et taper une phrase :";
                }
            }
        } while (doEnd == false);
    }

    // search for the number of occurrences of the letter a
    static int letterToFind(String message, char research) {
        for (int index = 0; index < userEntry.length(); index++) {
            if (userEntry.charAt(index) == research) {
                occurenceNumber++;
            }
        }
        return occurenceNumber;
    }
}
