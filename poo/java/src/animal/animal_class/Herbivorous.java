package animal.animal_class;


/**
 * @author Stagiaire
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public class Herbivorous extends Animal {

	public Herbivorous(String _specie)
	{
		super();
		this.getSpecie(_specie);
	}

	public void feed(String _specie)
	{
		System.out.println(this.getSpecie(_specie) + "Mange des végétaux");
	}

}