package cardgame;


/**
 * @author Stagiaire
 * @version 1.0
 * @created 15-juil.-2021 11:50:43
 */
public class Player {

	private String pseudo;
	private String firstName;
	private String lastName;
	private String email;
	private int hand;
	private Card[] cardHand;
	private Card cards;
	public Player m_Player;

	public Player(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param _email
	 * @param _lastName
	 * @param _firstName
	 * @param _psedo
	 */
	public Player Player(String _email, String _lastName, String _firstName, String _pseudo){
		return null;
	}

	public String getPseudo(){
		return this.pseudo;
	}

	/**
	 * 
	 * @param _pseudo
	 */
	public String setPseudo(String _pseudo){
		return this.pseudo;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public String getEmail(){
		return this.email;
	}

	/**
	 * 
	 * @param _email
	 */
	public String setEmail(String _email){
		return this.email;
	}

	/**
	 * 
	 * @param _hand
	 * @param _card
	 */
	public Card[] takeCardsHand(int _hand, Card _card){
		return null;
	}

	public Card[] getCardHand(){
		return null;
	}

	public Card cardPlay(){
		return null;
	}

}