package animal.animal_class;


/**
 * @author CRM
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public class Labrador extends Dog 
{
	private Boolean labradorMove = true;

	public Labrador(String _name)
	{
		super(_name);
	}

	// public void finalize() throws Throwable 
	// {
	// 	super.finalize();
	// }

	public void move()
	{
		if (this.labradorMove == true) 
		{
			System.out.println(this.getName() + " se déplace.");
			this.labradorMove = false;
		} 
		else 
		{
			System.out.println(this.getName() + " reste sur place.");
			this.labradorMove = true;
		}
	}

}