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

        System.out.println(rex.feed(" mange de la pâtés."));
        System.out.println(rex.move());
        rex.scream("Aboie");

        System.out.println(medor.feed(" mange de la pâtés."));
        System.out.println(medor.move(" se déplace."));
        medor.scream(" aboie.");
        System.out.println(rex.move());

        System.out.println(maya.feed(" mange du nectar."));
        System.out.println(maya.move(" se déplace en volant"));
        maya.scream("L'abeille bourdonne.");
        System.out.println(rex.move());

        System.out.println(horse.feed(" mange de l'herbe et du foin."));
        horse.scream("Un cheval hennit.");
        System.out.println(rex.move());

        System.out.println(giraffe.feed("La Giraffe mange des végétaux"));
        System.out.println(giraffe.move(" se déplace doucement."));
        giraffe.scream("La giraffe meugle.");
        System.out.println(rex.move());

    }
}