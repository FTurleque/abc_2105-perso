package celsiusfahrenheit;

import java.util.Scanner;
import java.util.regex.*;

public class App {

    public static void main(String[] args) {
        String temperature,
               unite,
               tempEtUnite,
               commandeUtilisateur;
        double number = 0;
        Scanner scanner;

        System.out.println("Conversion Degrés Fahrenheit <=> Degrés Celsius");
        scanner = new Scanner(System.in);
        tempEtUnite = new String();
        temperature = new String();
        unite = new String();

        do {
            System.out.println("Saisir une température suivie de l'unitée de mesure à convertir séparé par un espace !");
            System.out.println("C pour Celsius ou F pour Fahrenheit :");
            tempEtUnite = scanner.nextLine();

            // I separate tempEtUnite with space 
            // Pattern nombre = Pattern.compile("\\W");
            Pattern nombre = Pattern.compile("[ \t]");
            // I separate tempEtUnite in a bord with 2 case with number and string
            String[] items = nombre.split(tempEtUnite);

            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i]);
            }

            temperature = items[0];
            
            try {
                number = Integer.parseInt(temperature);
                unite = items[1];

            } catch (Exception e) {
                // TODO: handle exception
                //e.printStackTrace();
                if (!temperature.equals("q")) {
                    System.out.println("Commande inconnue");
                } 
            }

            // Vérification de l'unité de mesure MAJ ou Minuscule avec leur température limite accepté
            if (((unite.equalsIgnoreCase("f") && number >= -459.67) || (unite.equalsIgnoreCase("c") && number >= -273.15)) && number <= 5000000) {
                
                if (unite.equalsIgnoreCase("c")) {
                    System.out.println(number + " °C = " + (number * 9 / 5) + 32 + " °F");

                } else {
                    System.out.println(number + " °F = " + (number - 32) * 5 / 9 + " °C");
                    
                }
            } else {
                System.out.println("Vous avez saisie une valeur hors limite ou une lettre autre que q ! Recommancez.");
                
            }
            
        } while (!temperature.equals("q"));

        scanner.close();
        
    }
    
}