package moyenne;

import java.util.Scanner; // importer le composant Scanner

public class App {

    // code du composant
    
    public static void main(String[] args) {
        
        int a;
        int b;
        Scanner scanner;


        System.out.println("Calcul de la moyenne de deux nombre entier.");

        // Algo

        scanner = new Scanner(System.in);

        System.out.println("Choisissez un premier nombre entier :");
        a = scanner.nextInt();

        System.out.println("Choisissez un second nombre entier :");
        b = scanner.nextInt();

        System.out.println("Le résultat est: " + ((float)a + (float)b) / 2f);

        scanner.close(); // obligatoire (pour libérer les ressource)

    }
}
