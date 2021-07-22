package inversionDeValeurKevin;

import java.util.Scanner; // importer les composants Scanner

public class App 
{

    // code du composant
    public static void main(String[] args) {

        int a, b;
        Scanner sc;

        // votre algorithme

        System.out.println("Entrer deux nombre : ");
         sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Avant l'inversion : a = "+a+" et b = " +b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Après l' inversion : a = "+a+" et b = " +b);



        sc.close(); // obligatoire (libère les ressources)


        
    }
    
}
