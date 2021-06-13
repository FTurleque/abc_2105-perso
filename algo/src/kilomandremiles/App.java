package kilomandremiles;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        double valeur;
        String choix;
        String sortie;
        Scanner scanner;

        System.out.println("Conversion kilomètre en Miles et inversement !");
        scanner = new Scanner(System.in);
        sortie = new String();

        
        do {
            System.out.println("Choisir une valeur comprise entre 0.01 et 1 000 000 :");
            valeur = scanner.nextDouble();
            
            if (valeur > 0.01 && valeur <= 100000) {
                System.out.println("Choisir l'unitée à convertir, tapez km pour Kilomètre et mi pour Miles :");
                choix = scanner.next();

                if (choix.equalsIgnoreCase("km")) 
                {  
                    System.out.println(valeur + " Kilomètre = " + valeur/1.609 + " Miles !");

                } else {
                    System.out.println(valeur + " Miles = " + valeur*1.609 + " Kilomètre !");

                }

                System.out.println("Appuyez sur q pour sortir du programme ou une autre touche pour recommencer !");
                sortie = scanner.next(); 
                
            }  else {
                System.out.println("Vous n'avez pas indiqué une valeur entre 0.001 et 1 000 000 !");

                // sortie = "a";
            }


        } while (!sortie.equalsIgnoreCase("q"));

        scanner.close();
    }
}
