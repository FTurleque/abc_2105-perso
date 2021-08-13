package rechercheunelettredansunechainedecharactere;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String userEntry;
    static int userNumber;

    public static void main(String[] args) {
        int occurenceNumber = 0;

        System.out.println("Rechercher une lettre dans un chaine de caractères !");

        askUserSentence("Ecrire une phrase se terminant par un point !");

    }

    static void askUserSentence(String message) {
        do {
            System.out.println(message);
            userEntry = scanner.nextLine();

            if (userEntry.isEmpty()) {
                message = "Vous n'avez rien taper, recommencez et taper une phrase :";
            } else {
                try {
                    if (userEntry.matches("[a-zA-Z]+")) {
                        System.out.println("Win");
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                    message = "Vous avez taper un nombre, recommencez et taper une phrase :";
                }
            }
        } while (true);
    }

}
