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

	public void feed()
	{
		System.out.println("Une abeille mange du nectar.");
	}

	public void move()
	{
		System.out.println("Une abeille se déplace en volant");
	}

}