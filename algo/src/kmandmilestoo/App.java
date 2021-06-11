package kmandmilestoo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String   userEnter,
                 quit,
                 go;
        String[] boardValious;
        Scanner  scanner;

        System.out.println("Conversion Kilomètre en Miles et inversement !");
        scanner = new Scanner(System.in);
        quit = new String();

        System.out.println("Choisir une valeur comprise entre 0.01 et 1 000 000 :");
        userEnter = scanner.nextLine();

        do {

            
        } while (!quit.equalsIgnoreCase("quit"));

        scanner.close();
        
    }
    
}
