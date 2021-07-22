package mileskilometres3cyril;

import java.util.Scanner;

public class App {


public static void main(String[] args){

    Scanner scan;
    String data;
    String distance = "";
    String unit = "";
    String[] recup;
    Boolean go = false;
    
    //Début algorithme

    do {

        System.out.println("veuillez saisir votre phrase");
        scan = new Scanner(System.in);
        data = scan.nextLine();

        if(data.equals("quitter")) {
            System.exit(0);
        }

        if (data.equals("go")) {
            go = true;
        }   
        else {
            recup = data.split(" ");
            distance += recup[0] + " ";
            
            if (recup.length < 2){
                unit += "km ";
            }
            else {
                unit +=  recup[1] + " ";
            }

        }

    }
    while(!go);

        scan.close();
        // Affichage et conversion des data entées
        String[] numUnit;
        numUnit = unit.split(" ");

        String[] numDistance;
        numDistance = distance.split(" ");
        int index;

        for (index = 0; index < numDistance.length; index++) {
        
            double numDistanceIndex = Double.parseDouble(numDistance[index]);
            String numUnitIndex = numUnit[index];
            
            if (numUnitIndex.equals("mi")){
        
                System.out.println(numDistanceIndex + " " + numUnitIndex + " " + " correspondent  à " + numDistanceIndex*1.609 + " kilomètres" );
            
            }
        
            else {

                System.out.println(numDistanceIndex + " " + numUnitIndex + " " + " correspondent  à " + numDistanceIndex/1.609 + " miles " );    
            
            }
        }    
  }
}
