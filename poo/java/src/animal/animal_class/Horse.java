package animal.animal_class;


/**
 * neighs() supprim�
 * @author Stagiaire
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public class Horse extends Herbivorous {

	//private String name;

	public Horse(String _specie)
	{
		super(_specie);
	}

	public void feed()
	{
		System.out.println("Un cheval mange de l'herbe et du foin.");
	}

	/**
	 * 
	 * @param name
	 */
	// public String getName(){
	// 	return "";
	// }

}