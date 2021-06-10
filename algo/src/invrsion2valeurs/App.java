package invrsion2valeurs;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int a;
        int b;
        int c = 0;
        Scanner scanner;

        System.out.println("Inversion de deux valeurs !");
        scanner = new Scanner(System.in);

        System.out.println("Choisir une valeur entiere pour A : ");
        a = scanner.nextInt();

        System.out.println("Choisir une valeur entiere pour B : ");
        b = scanner.nextInt();

        System.out.println("La valeur de (a) est : " + a);
        System.out.println("La valeur de (B) est : " + b);

        System.out.println("Nous inversons les valeur de A et B !");


        a = c;
        b = a;
        c = b;

        System.out.println("La valeur de (a) devient: " + a);
        System.out.println("La valeur de (B) devient: " + b);



        scanner.close();
    }
}
