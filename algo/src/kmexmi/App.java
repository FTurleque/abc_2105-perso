package kmexmi;


public class App {
    public static void main(String[] args) {
    String saisie; // saisie utilisateur
    String[] tableau; // tableau pour la saisie utilisateur

    int valeur; // valeur à convertir

    saisie = "14 km";

    // toLowerCase(A) used to convert a letter "a"
    // toUpperCase(a) used to convert a letter "A"
    if (saisie.toLowerCase().equals("quitter")) {
        System.exit(0); // quitter le programme
    }

    tableau = saisie.split(" "); // découpage de la chaine. l'espace " " sera notre séparateur

    System.out.println(tableau[0]); // "14"
    System.out.println(tableau[1]); // "km"

    valeur = Integer.parseInt(tableau[0]); // conversion de la chaine "14" en nombre entier 14

    valeur = valeur + 2;
    /*
    do {
        String a;
        int b = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisissez une valeur superieur à 0");
            a = scanner.nextLine();

            if (a.equals("q")) {
                System.exit(0);
            }

            b = Integer.parseInt(a);

        } while (b < 1);
    */
    }
    
}
