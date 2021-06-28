package fibonacci;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String nbToFind = new String();
    static double toFind = 0;
    
    public static void main(String[] args) {
        numberToFindFibo("Quel nombre de la suite de fibonacci souhaitez vous trouver");
        
        System.out.println(fibonacciSuite());
    }

    static double numberToFindFibo(String question) {

        do {
            System.out.println(question);
            nbToFind = scanner.nextLine();

            try {
                toFind = Double.parseDouble(nbToFind);
                return toFind;
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas renseignez un nombre !");
            }
        } while (true);
    }

    static double fibonacciSuite() {
        double nb1 = 0,
               nb2 = 1,
               nb3 = 0;

        for (double i = 0; i < toFind - 1; i++) {
            nb3 = nb1 + nb2;
            nb1 = nb2;
            nb2 = nb3;
        }
        return nb3;
    }
}
