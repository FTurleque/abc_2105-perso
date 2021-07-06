package animal.animal_class;


/**
 * @author CRM
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public class Labrador extends Dog 
{
	private String labradorMove = "true";

	public Labrador(String _name)
	{
		super(_name);
	}

	public String move()
	{
		if (this.labradorMove == "true") 
		{
			this.labradorMove = "false";
			return this.getName() + " se déplace.";
		} 
		else 
		{
			this.labradorMove = "true";
			return this.getName() + " reste sur place.";
		}
	}

}