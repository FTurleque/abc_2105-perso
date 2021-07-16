package cardgame;


/**
 * Paladin
 * Mage
 * Druide
 * Espion
 * @author Stagiaire
 * @version 1.0
 * @created 15-juil.-2021 11:50:43
 */
public class TypeOfCard {

	private int id;
	private String className;
	private String description;
	private TypeOfCardName typeOfCardName;
	/**
	 * Nature
	 * Givre
	 * Feu
	 * Lumi�re
	 */
	private VitalEnergies vitalEnergies;

	public void finalize() throws Throwable 
	{

	}

	/**
	 * 
	 * @param _vitalEnergies
	 * @param _description
	 * @param _id
	 */
	public TypeOfCard(TypeOfCardName _typeOfCardName, VitalEnergies _vitalEnergies, String _description, int _id)
	{
		this.typeOfCardName = _typeOfCardName;
		this.vitalEnergies = _vitalEnergies;
		this.id = _id;
		this.description = _description;

	}

	public int getId()
	{
		return this.id;
	}

	public String getClassName()
	{
		return this.className;
	}

	public String getDescription()
	{
		return this.description;
	}

	public VitalEnergies getvitalEnergies()
	{
		return this.vitalEnergies;
	}

}