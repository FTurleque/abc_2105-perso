package invrsion2valeurs;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static int a = 0;
    static int b = 0;

    public static void main(String[] args) {
        System.out.println("Inversion de deux valeurs !");

        System.out.println("Choisir une valeur entiere pour a : ");
        a = askNumber();
        System.out.println("Choisir une valeur entiere pour b : ");
        b = askNumber();

        inversionAB();

        System.out.println("La valeur de (a) devient: " + a);
        System.out.println("La valeur de (b) devient: " + b);
    }

    static int askNumber() {
        String userEnter;
        int userNumber;

        do {
            userEnter = scanner.nextLine();

            try {
                userNumber = Integer.parseInt(userEnter);
                return userNumber;
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
