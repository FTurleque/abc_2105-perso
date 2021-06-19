package tridenombres;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        int a,
            b,
            c;
        Scanner scanner;
        
        System.out.println("Tri de nombres !");
        scanner = new Scanner(System.in);

        System.out.println("Choisir un nombre pour a :");
        a = scanner.nextInt();

        System.out.println("Choisir un nombre pour b :");
        b = scanner.nextInt();

        System.out.println("Choisir un nombre pour c :");
        c = scanner.nextInt();

        if (a <= b) {
            if (c > a && c < b) {
                System.out.println("Les nombres dans l'ordre croissant sont : " + a + " " + c + " " + b);
            }
            if (c <= a) {
                System.out.println("Les nombres dans l'ordre croissant sont : " + c + " " + a + " " + b);
            }
            if (c > b) {
                System.out.println("Les nombres dans l'ordre croissant sont : " + a + " " + b + " " + c);
            }
        } else {
            if (c <= b) {
                System.out.println("Les nombres dans l'ordre croissant sont : " + c + " " + b + " " + a);
            }
            if (c > a) {
                System.out.println("Les nombres dans l'ordre croissant sont : " + b + " " + a + " " + c);
            }
            if ( c > b && c < a) {
                System.out.println("Les nombres dans l'ordre croissant sont : " + b + " " + c + " " + a);
            }
        }

        scanner.close();

    }
}
