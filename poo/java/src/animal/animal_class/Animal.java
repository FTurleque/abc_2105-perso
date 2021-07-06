package animal.animal_class;

/**
 * @author MDevoldere
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public abstract class Animal 
{

	private String specie;
	private String scream;

	public Animal(String _specie)
	{
		this.specie = _specie;

	}

	public String getSpecie()
	{
		return this.specie;
	}

	/**
	 * bee : foraging
	 */
	// public void feed()
	// {

	// }

	public String move(String animalMove)
	{
		return animalMove;
	}

	public void scream(String _scream)
	{
		this.scream = _scream;
		System.out.println(scream);
	}

	/**
	 * 
	 * @param scream
	 */
	public String getScream(String _scream)
	{
		return this.scream = _scream;
	}

}