package celsiusfahrenheit;

import java.util.Scanner;
import java.util.regex.*;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String temperature, unity, tempAndUnity, result;
    static Double number;

    public static void main(String[] args) {
        System.out.println("Conversion Degrés Fahrenheit <=> Degrés Celsius");
        askUserNumber("Saisir une température et son unitée de mesure séparé par un espace ou quittez avec (quit) :");
    }

    // Asks the user to enter a temperature
    static void askUserNumber(String message) {
        System.out.println(message);
        System.out.println("C pour Celsius ou F pour Fahrenheit :");
        do {
            tempAndUnity = scanner.nextLine();

            if (tempAndUnity.equalsIgnoreCase("quit")) {
                System.exit(0);
            } else {
                // I separate tempEtUnite with space
                Pattern nombre = Pattern.compile("[ \t]");
                // I separate tempEtUnite in a bord with 2 case with number and string
                String[] items = nombre.split(tempAndUnity);

                // Test to watch if i for (int i = 0; i < items.length; i++) {
                // System.out.println(items[i]); }

                temperature = items[0];

                // Test of the user input
                try {
                    number = Double.parseDouble(temperature);
                    unity = items[1];
                    checkUnityAndLimits();
                    System.out.println(result);
                } catch (Exception e) {
                    // TODO: handle exception
                    // e.printStackTrace();
                    System.err.println("Vous n'avez pas renseigné un nombre. Recommencez ou quittez (quit)");
                }
            }
        } while (!tempAndUnity.equalsIgnoreCase("quit"));
    }

    static void checkUnityAndLimits() {
        // Test of the user input and limits
        try {
            if (((unity.equalsIgnoreCase("f") && number >= -459.67)
                    || (unity.equalsIgnoreCase("c") && number >= -273.15)) && number <= 5000000) {

                // Display of the result
                if (unity.equalsIgnoreCase("c")) {
                    result = number + " °C = " + (number * 9 / 5) + 32 + " °F";
                } else {
                    result = number + " °F = " + (number - 32) * 5 / 9 + " °C";
                }
                System.out.println("Recommencez ou quitter (quit) :");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            // TODO: handle exception
            result = "Vous avez saisie une valeur hors limite ! Recommencez :";
        }
    }
}