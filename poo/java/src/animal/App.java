package animal;

import animal.animal_class.*;

public class App
{
    
    public static void main(String[] args) 
    {
        
        Labrador rex = new Labrador("Rex");
        Pinscher medor = new Pinscher("Medor");
        Bee maya = new Bee();
        Horse horse = new Horse();
        Giraffe giraffe = new Giraffe();

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