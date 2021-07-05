package animal;

import animal.animal_class.*;

public class App
{
    
    public static void main(String[] args) 
    {
        
        Labrador rex = new Labrador("Le Labrador" ,"Rex");
        Pinscher medor = new Pinscher("Le Pinscher" ,"Medor");
        Bee maya = new Bee("Abeille");
        Horse horse = new Horse("Cheval");
        Giraffe giraffe = new Giraffe("Giraffe");

        rex.feed();
        rex.move();
        rex.scream("Aboie");

        medor.feed();
        medor.move();
        medor.scream(" aboie.");
        rex.move();

        maya.feed();
        maya.move();
        maya.scream("L'abeille bourdonne.");
        rex.move();

        horse.feed();
        horse.scream("Un cheval hennit.");
        rex.move();

        giraffe.feed();
        giraffe.move();
        giraffe.scream("La giraffe meugle.");
        rex.move();

    }
}