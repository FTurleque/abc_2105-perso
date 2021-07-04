package animal;

import animal.animal_class.*;

public class App
{
    
    public static void main(String[] args) 
    {
        
        Labrador rex = new Labrador("Le Labrador" ,"Rex");
        Pinscher medor = new Pinscher("Le Pinscher" ,"Medor");

        rex.feed();
        rex.move();

        medor.feed();
        medor.move();
        rex.move();
        medor.scream(" aboie.");


    }
}