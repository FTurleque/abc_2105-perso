package animal.animal_class;

/**
 * @author MDevoldere
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public abstract class Animal 
{

	private String specie;
	/**
	 * Giraffe = moose
	 * Bee = buzz
	 * Dog = barks
	 * Horse = neighs
	 */
	private String scream;

	public Animal()
	{

	}

	public void getSpecie(String _specie)
	{
		this.specie = _specie;
	}

	/**
	 * bee : foraging
	 */
	public void feed()
	{

	}

	public void move()
	{
		System.out.println("Il se déplace.");
	}

	public void scream()
	{
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