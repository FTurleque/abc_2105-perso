package anneebissextile;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        String annee;
        int year = 0;
        Boolean find = false;
        Scanner scanner;

        System.out.println("Année Bissextile");
        scanner = new Scanner(System.in);

        do {
            System.out.println("Choisir une année :");
            annee = scanner.nextLine();

            try {
                year = Integer.parseInt(annee);
                find = true;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Vous n'avez pas ecrit un nombre entier recommencez !");
            }
        } while (find.equals(false));
        
        // I see if the year is divisible by 4 and not by 100 or not by 400
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("L'année " + annee + " est Bissextile");
        } else {
            System.out.println("L'année " + annee + " n'est pas Bissextile");
        }

        scanner.close();

    }
}