package anneebissextile;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int annee;
        Scanner scanner;

        System.out.println("Année Bissextile");
        scanner = new Scanner(System.in);

        System.out.println("Choisir une année :");
        annee = scanner.nextInt();
        
        // I see if the year is divisible by 4 and not by 100 or not by 400
        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            System.out.println("L'année " + annee + " est Bissextile");
        } else {
            System.out.println("L'année " + annee + " n'est pas Bissextile");
        }

        scanner.close();

    }
}