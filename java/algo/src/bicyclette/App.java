package bicyclette;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String userEnter;

    public static void main(String[] args) {

        testUserEnter("Fait-il beau ? (o pour Oui et n pour Non)");

        if (userEnter.equalsIgnoreCase("o")) {
            System.out.println("Vous avez indiqué qu'il fait beau.");
            testUserEnter("La bicyclette est-elle en bon état ? (o pour Oui et n pour Non)");

            if (userEnter.equalsIgnoreCase("o")) {
                System.out.println("La bicyclette est en bon état, je pars en balade !");
            } else {
                System.out.println("Je vais au garage.");
                testUserEnter("Est-ce-que la réparation est rapide ? (o pour Oui et n pour Non)");

                if (userEnter.equalsIgnoreCase("o")) {
                    System.out.println("Réparations rapides ! Je vais me balader.");
                } else {
                    System.out.println("Je dois laisser ma bicyclette, je vais cueillir des joncs.");
                }
            }
        } else {
            System.out.println("Vous avez indiqué qu'il pleut.");
            testUserEnter(
                    "Je vais lire un livre, est-ce-que GoT tome 1 est dans ma bibliothèque ? (o pour Oui et n pour Non)");

            if (userEnter.equalsIgnoreCase("o")) {
                System.out.println("Le livre est dans la bibliothèque, je m'installe pour le lire");
            } else {
                System.out.println("Je ne trouve pas le livre, je vais à la bibliothèque municipale.");
                testUserEnter("Est-il disponible à la bibliothèque municipale ? (o pour Oui et n pour Non)");

                if (userEnter.equalsIgnoreCase("o")) {
                    System.out.println("Le livre est disponible ! Je l'emprunte.");
                } else {
                    System.out.println("Le livre n'est pas disponible, j'emprunte un roman policier à la place.");
                }

                System.out.println("Je rentre à la maison.");
            }
        }
    }

    public static void testUserEnter(String message) {
        do {
            System.out.println(message);
            userEnter = scanner.nextLine();
            try {
                if (userEnter.equalsIgnoreCase("o") || userEnter.equalsIgnoreCase("n")) {

                } else {
                    // génére une nouvelle exception
                    throw new Exception("Vous n'avez pas choisi o ou n, recommencez !");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Vous n'avez pas choisi o ou n, recommencez !");
            }

        } while (!(userEnter.equalsIgnoreCase("o") || userEnter.equalsIgnoreCase("n")));
    }
}
