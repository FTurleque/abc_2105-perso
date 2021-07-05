package animal.animal_class;


/**
 * barks() supprim�
 * @author CRM
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public class Dog extends Animal 
{

	private String name;

	/**
	 * 
	 * @param _name
	 */
	public Dog(String _name)
	{
		super("Chien");
		this.name = _name;
	}

	public String feed(String dogFeed)
	{
		return this.getName() + dogFeed;
	}

	public String move(String dogMove)
	{
		return this.getName() + dogMove;
	}

	/**
	 * 
	 * @param name
	 */
	public String getName()
	{
		return this.name;
	}

}