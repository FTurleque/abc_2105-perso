package animal.animal_class;


/**
 * @author Stagiaire
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
abstract class Herbivorous extends Animal {

	public Herbivorous(String _specie)
	{
		super(_specie);
	}

	public void feed()
	{
		System.out.println("L'herbivore mange des végétaux");
	}

}