package animal.animal_class_diagram;


/**
 * barks() supprim�
 * @author CRM
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public class Dog extends Animal 
{

	private String name;

	public Dog(){

	}

	public void finalize() throws Throwable 
	{
		super.finalize();
	}

	/**
	 * 
	 * @param name
	 */
	public Dog Dog(String name)
	{
		return null;
	}

	public void feed()
	{

	}

	/**
	 * 
	 * @param name
	 */
	public String getName(String _name)
	{
		return this.name = _name;
	}

}