package rechercheunnombredansuntableau;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int mystery;
        int[] myArray;
        Scanner scanner;
        Boolean find = false;

        System.out.println("Rechercher un nombre dans un tableau !");
        scanner = new Scanner(System.in);

        // array initialization
        myArray = new int[]{2,5,8,13,18};

        do {
            System.out.println("Choisir un nombre entre 1 et 20 :");
            mystery = scanner.nextInt();

            // check for each cell of the table if the number is there
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] == mystery) {
                    find = true;
                }
            }

            if (find.equals(true)) {
                System.out.println("Vous avez Gagnez ! Le nombre choisi se trouve bien dans le tableau !");
            } else {
                System.out.println("Perdu, rejouez !");
            }


        } while (find == false);

        scanner.close();
    }
}
