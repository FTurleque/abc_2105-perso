package animal.animal_class;


/**
 * buzz() supprim�
 * @author Stagiaire
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public class Bee extends Animal {

	public Bee()
	{
		super("Abeille");
	}

	public String feed(String beeFeed)
	{
		return "Une " + getSpecie() + beeFeed;
	}

	public String move(String beeMove)
	{
		return "Une " + getSpecie() + beeMove;
	}

}