package rechercheunnombredansuntableau;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int mystery;
        int[] myArray;
        boolean find = false;

        System.out.println("Rechercher un nombre dans un tableau !");
        

        // array initialization
        myArray = new int[]{2,5,8,13,18};

        do {
            mystery = getNumber();

            // check for each cell of the table if the number is there
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] == mystery) {
                    find = true;
                }
            }

            if (find) {
                System.out.println("Vous avez Gagnez !");
            } else {
                System.out.println("Perdu, rejouez !");
            }
        } while (find == false);
    }

    static int getNumber() {
        String userEnter = new String();

        do {
            System.out.println("Choisir un nombre entre 1 et 20 :");
            userEnter = scanner.nextLine();

            try {
                return Integer.parseInt(userEnter);
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas choisi un nombre entier ! Recommencez !");
            }
        } while (true);
    }
}
