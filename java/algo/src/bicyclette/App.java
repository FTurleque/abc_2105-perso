package bicyclette;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String weather,
               bicycle,
               quickRepair,
               gOTPossession,
               gOTAvailability;

        do {
            System.out.println("Fait-il beau ? (o pour Oui et n pour Non)");
            weather = scanner.nextLine();

            try {
                if (weather.equalsIgnoreCase("o") || weather.equalsIgnoreCase("n")) {
                    
                } else {
                    // génére une nouvelle exception
                    throw new Exception("Vous n'avez pas choisi o ou n, recommencez !");
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Vous n'avez pas choisi o ou n, recommencez !");
            }
            
        } while (true);
        
    }
}
