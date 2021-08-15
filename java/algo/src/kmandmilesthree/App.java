package kmandmilesthree;

import java.util.Scanner;
// import java.util.Arrays;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String userNumber;
    static String[] valiousTable;
    static String valious = "";
    static String unity = "";
    static Boolean go = false;
    static String[] tableOfUnit;
    static String[] distanceTable;

    public static void main(String[] args) {
        do {
            askEntryUser(
                    "Conversion Kilomètre en Miles et inversement. \nChoisir des distances en Miles (mi) ou Kilomètres (km) séparées d'un espace ou quitter :");
            distanceConversions();
        } while (!userNumber.equalsIgnoreCase("quitter"));

    }

    // Asks the user to enter a distance
    static String askEntryUser(String message) {
        System.out.println(message);
        do {
            userNumber = scanner.nextLine();

            if (userNumber.equalsIgnoreCase("quitter")) {
                System.exit(0);
            } else if (userNumber.equalsIgnoreCase("go")) {
                go = true;
            } else {
                valiousTable = userNumber.split(" ");

                // Test of the user input
                try {
                    Integer.parseInt(valiousTable[0]);
                    valious += valiousTable[0] + " ";
                    saveUnity();

                    System.out.println("Tapez go pour lancer les calculs si vous avez fini ou recommencez :");
                } catch (Exception e) {
                    // TODO: handle exception
                    System.err.println(
                            "Une distance est un chiffre et une unitée de mesure séparé d'un espace. Recommencez :");
                }
            }
        } while (!go);
        return userNumber;
    }

    // Asks the user to enter a unity
    static void saveUnity() {
        if (valiousTable.length < 2) {
            unity += "km ";
        } else {
            unity += valiousTable[1] + " ";
        }
    }

    static void distanceConversions() {
        tableOfUnit = unity.split(" ");
        distanceTable = valious.split(" ");

        for (int index = 0; index < distanceTable.length; index++) {
            double numDistanceIndex = Double.parseDouble(distanceTable[index]);
            String numUnitIndex = tableOfUnit[index];

            // Display of the calculation
            if (numUnitIndex.equals("mi")) {
                System.out.println(
                        numDistanceIndex + " " + numUnitIndex + " = " + numDistanceIndex * 1.609 + " kilomètres");
            } else {
                System.out
                        .println(numDistanceIndex + " " + numUnitIndex + " = " + numDistanceIndex / 1.609 + " miles ");
            }
        }
    }
}