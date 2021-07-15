package cardgame;


/**
 * @author Stagiaire
 * @version 1.0
 * @created 15-juil.-2021 11:50:43
 */
public class Card {

	private String nameOfCard;
	private int power;
	private String armor;
	private String capacity;
	private TypeOfCard typeOfCards;

	public Card(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param _capacity
	 * @param _armor
	 * @param _power
	 * @param _nameOfCard
	 */
	public Card Card(String _capacity, String _armor, int _power, String _nameOfCard){
		return null;
	}

	public String getNameOfCard(){
		return this.nameOfCard;
	}

	public String getArmor(){
		return this.armor;
	}

	public int getPower(){
		return this.power;
	}

	public String getCapacity(){
		return this.capacity;
	}

}