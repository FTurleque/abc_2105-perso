package invrsion2valeurs;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int    a,
               b,
               c;
        //Scanner scanner;

        System.out.println("Inversion de deux valeurs !");
        //scanner = new Scanner(System.in);
        a = 0;
        b = 0;
        c = 0;

        System.out.println("Choisir une valeur entiere pour a : ");
        a = choice(a);
        System.out.println("Choisir une valeur entiere pour b : ");
        b = choice(b);

        c = a;
        a = b;
        b = c;

        System.out.println("La valeur de (a) devient: " + a);
        System.out.println("La valeur de (B) devient: " + b);

        //scanner.close();
    }

    static Integer choice(int a) {
        String a1;
        Scanner scanner;

        scanner = new Scanner(System.in);

        do {
            a1 = scanner.nextLine();

            try {
                a = Integer.parseInt(a1);
                return a;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Vous n'avez pas choisie un nombre, recommencez");
                scanner.reset();
                scanner.close();
            }

            scanner.close();

        } while (true);
    }
}
