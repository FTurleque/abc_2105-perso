package celsiusfahrenheit;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double temperature = 0;
        String unite;
        // String unite;
        Scanner scanner;
        String tempEtUnite;

        System.out.println("Conversion Degrés Fahrenheit <=> Degrés Celsius");
        scanner = new Scanner(System.in);
        // unite = new Character();
        tempEtUnite = new String();


        do {
            System.out.println("Saisir une température suivie de l'unitée de mesure à convertir séparé par un espace!");
            System.out.println("C pour Celsius ou F pour Fahrenheit :");
            tempEtUnite = scanner.nextLine();


            // conversion char en string avec string.valueOf()
            unite = String.valueOf(tempEtUnite.charAt(tempEtUnite.length()-1));
            temperature = tempEtUnite.charAt(tempEtUnite.length()-3);
            
            // temperature = scanner.nextDouble();

            // System.out.println("Saisir l'unitée de mesure a convertir C pour Celsius ou F pour Fahrenheit :");
            // unite = scanner.next();

            if (((unite.equals("F") && temperature >= -459.67) || (unite.equals("C") && temperature >= -273.15)) && temperature <= 5000000) {
                
                if (unite.equals("C") || unite.equals("c")) {
                    System.out.println(temperature + " °C = " + (temperature * 9 / 5) + 32);
                    
                } else {
                    System.out.println(temperature + " °F = " + (temperature - 32) * 5 / 9);
                    
                }

                
            } else {
                System.out.println("Vous avez saisie une valeur hors limite ! Recommancez.");
                
            }

            
            
        } while (!unite.equals("q"));

        scanner.close();
        
    }
    
}
