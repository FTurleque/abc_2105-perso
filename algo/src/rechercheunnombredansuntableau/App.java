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
        myArray = new int[]{2,5,8,13,18};

        do {
            System.out.println("Choisir un nombre entre 1 et 20 :");
            mystery = scanner.nextInt();

            if (mystery == myArray[]) {
                System.out.println("Vous avez Gagnez ! Le nombre choisi se trouve bien dans le tableau !");
                find = true;
            } else {
                System.out.println("Perdu, rejouez !");
            }

        } while (find == true);

        scanner.close();
    }
}
