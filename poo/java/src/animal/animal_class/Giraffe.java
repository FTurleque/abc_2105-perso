package animal.animal_class;


/**
 * moose() supprim�
 * @author Stagiaire
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public class Giraffe extends Herbivorous {

	public Giraffe()
	{
		super("Giraffe");
	}

	public String move(String giraffeMove)
	{
		return "La " + this.getSpecie() + giraffeMove;
	}

}