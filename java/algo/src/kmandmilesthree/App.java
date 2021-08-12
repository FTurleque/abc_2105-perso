package kmandmilesthree;

import java.util.Scanner;
// import java.util.Arrays;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String userNumber;
    static String[] boardValious;
    static String valious = "";
    static String unity = "";
    static Boolean go = false;
    static String[] boardUnit;
    static String[] boardDistance;

    public static void main(String[] args) {
        boardImplementation("Conversion Kilomètre en Miles et inversement !");
        distanceConversions();
    }

    static String boardImplementation(String message) {
        System.out.println(message);
        System.out.println("Choisir des distances Miles (mi) ou Kilomètres (km) séparées d'un espace !");
        do {
            userNumber = scanner.nextLine();

            if (userNumber.equalsIgnoreCase("quitter")) {
                System.exit(0);
            } else if (userNumber.equalsIgnoreCase("go")) {
                go = true;
            } else {
                boardValious = userNumber.split(" ");
                try {
                    Integer.parseInt(boardValious[0]);
                    valious += boardValious[0] + " ";
                    // valious += boardValious[0] + " ";
                    saveUnity();

                    System.out.println("Tapez go pour lancer les calculs si vous avez fini ou recommencez :");
                } catch (Exception e) {
                    // TODO: handle exception
                    System.err.println("Une distance est un chiffre et une unitée de mesure. Recommencez :");
                }
            }
        } while (!go);
        return message;
    }

    static void saveUnity() {
        if (boardValious.length < 2) {
            unity += "km ";
        } else {
            unity += boardValious[1] + " ";
        }
    }

    static void distanceConversions() {
        boardUnit = unity.split(" ");
        boardDistance = valious.split(" ");

        for (int index = 0; index < boardDistance.length; index++) {
            double numDistanceIndex = Double.parseDouble(boardDistance[index]);
            String numUnitIndex = boardUnit[index];

            if (numUnitIndex.equals("mi")) {
                System.out.println(
                        numDistanceIndex + " " + numUnitIndex + " = " + numDistanceIndex * 1.609 + " kilomètres");
            } else {
                System.out
                        .println(numDistanceIndex + " " + numUnitIndex + " = " + numDistanceIndex / 1.609 + " miles ");
            }
        }
        System.exit(0);
    }
}