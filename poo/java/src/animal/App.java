package animal;

import animal.animal_class.*;

public class App
{
    
    public static void main(String[] args) 
    {
        
        //Labrador labrador = new Labrador();
        //Pinscher pinscher = new Pinscher();
        Labrador rex = new Labrador("Rex");
        Pinscher medor = new Pinscher("Medor");


        rex.feed();
        //rex.getScream("Il aboie");
        rex.move();


        medor.feed();
        //medor.getScream(" aboie toutes les 10 secondes");
        medor.move();
        rex.move();

        //rex.move();

    }
}