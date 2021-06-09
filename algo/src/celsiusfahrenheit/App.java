package celsiusfahrenheit;

import java.util.Scanner;
import java.util.regex.*;

public class App {

    public static void main(String[] args) {
        double temperature;
        // String unite;
        String unite;
        Scanner scanner;
        String tempEtUnite;

        System.out.println("Conversion Degrés Fahrenheit <=> Degrés Celsius");
        scanner = new Scanner(System.in);
        tempEtUnite = new String();


        do {
            System.out.println("Saisir une température suivie de l'unitée de mesure à convertir séparé par un espace !");
            System.out.println("C pour Celsius ou F pour Fahrenheit :");
            tempEtUnite = scanner.nextLine();


            // conversion char en string avec string.valueOf()
            // séparation de l'unité de mesure et du nombre a convertir grace à son emplacement dans une chaine de charactère
            unite = String.valueOf(tempEtUnite.charAt(tempEtUnite.length()-1));
            // temperature = Double.parseDouble(tempEtUnite.charAt(tempEtUnite.length()-3));


            // Vérification de l'unité de mesure MAJ ou Minuscule avec leur température limite accepté
            if (((unite.equals("F") && temperature >= -459.67) || (unite.equals("C") && temperature >= -273.15)) && temperature <= 5000000) {
                
                if (unite.equals("C")) {
                    System.out.println(temperature + " °C = " + (temperature * 9 / 5) + 32 + " °F");
                    
                } else {
                    System.out.println(temperature + " °F = " + (temperature - 32) * 5 / 9 + " °C");
                    
                }

                
            } else {
                System.out.println("Vous avez saisie une valeur hors limite ! Recommancez.");
                
            }
            
            
        } while (!unite.equals("q"));

        scanner.close();
        
    }
    
}

/*
String unity_C = "C", 
               unityc = "c", 
               unity_F = "F", 
               unityf = "f",
               unite;
            if (((unity_C.equalsIgnoreCase(unityc) && temperature >= -459.67) || (unity_F.equalsIgnoreCase(unityf) && temperature >= -273.15)) && temperature <= 5000000) {
                
                if (unity_C.equalsIgnoreCase(unityc)) {
                    System.out.println(temperature + " °C = " + (temperature * 9 / 5) + 32 + " °F");
                    
                } else {
                    System.out.println(temperature + " °F = " + (temperature - 32) * 5 / 9 + " °C");
                    
                }
                */