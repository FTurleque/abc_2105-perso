package invrsion2valeurs;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        Scanner scanner;

        System.out.println("Inversion de deux valeurs !");
        scanner = new Scanner(System.in);

        System.out.println("Choisir une valeur entiere pour A : ");
        a = scanner.nextInt();

        System.out.println("Choisir une valeur entiere pour B : ");
        b = scanner.nextInt();

        System.out.println("La valeur de A est : " + a);
        System.out.println("La valeur de B est : " + b);

        System.out.println("Nous inversons les valeur de A et B !");


        c = a;
        a = b;
        b = c;

        System.out.println("La valeur de A devient: " + a);
        System.out.println("La valeur de B devient: " + b);



        scanner.close();
    }
}
