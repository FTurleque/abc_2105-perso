package animal;

import animal.animal_class_diagram.*;

public class App
{
    
    public static void main(String[] args) 
    {
        
        //Labrador labrador = new Labrador();
        //Pinscher pinscher = new Pinscher();
        Labrador labrador = new Labrador();
        Dog pinscher = new Dog();


        System.out.println("Le Labrador s'appel : ");
        System.out.println(labrador.getName("Rex"));

        System.out.println("Le Pinscher s'appel : ");
        System.out.println(pinscher.getName("Medor"));

    }
}