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
	/**
	 * Nature
	 * Givre
	 * Feu
	 * Lumi�re
	 */
	private String vitalEnergies;

	public TypeOfCard(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param _vitalEnergies
	 * @param _description
	 * @param _id
	 */
	public TypeOfCard TypeOfCard(VitalEnergies _vitalEnergies, String _description, int _id){
		return null;
	}

	public int getId(){
		return this.id;
	}

	public String getClassName(){
		return this.className;
	}

	public String getDescription(){
		return this.description;
	}

	public String getvitalEnergies(){
		return this.vitalEnergies;
	}

}