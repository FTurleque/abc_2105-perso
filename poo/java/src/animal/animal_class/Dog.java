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
		this.name = _name;
	}

	// public void finalize() throws Throwable 
	// {
	// 	super.finalize();
	// }

	public void feed()
	{
		System.out.println(this.getName() +" mange de la pâtés.");
	}

	public void move()
	{
		System.out.println(this.getName() +" se déplace.");
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