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

	public void finalize() throws Throwable 
	{

	}

	/**
	 * 
	 * @param _email
	 * @param _lastName
	 * @param _firstName
	 * @param _psedo
	 */
	public Player(String _email, String _lastName, String _firstName, String _pseudo)
	{
		this.setEmail(_email);
		this.setPseudo(_pseudo);
		this.setFirstName(_firstName);
		this.setLastName(_lastName);
	}

	public String getPseudo()
	{
		return this.pseudo;
	}

	/**
	 * 
	 * @param _pseudo
	 */
	public String setPseudo(String _pseudo)
	{
		try {
			if (_pseudo.isEmpty())
			{
				throw new Exception("Veuillez renseigner votre pseudo : ");
			}
		} catch (Exception e) {
			//TODO: handle exception
			return e.getMessage();
		}

		this.pseudo = _pseudo;
		return this.pseudo;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public String setFirstName(String _firstName)
	{
		try {
			if (_firstName.isEmpty())
			{
				throw new Exception("Veuillez renseigner votre prénom : ");
			}
		} catch (Exception e) {
			//TODO: handle exception
			return e.getMessage();
		}

		this.firstName = _firstName;
		return this.firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public String setLastName(String _lastName)
	{
		try {
			if (_lastName.isEmpty())
			{
				throw new Exception("Veuillez renseigner votre prénom : ");
			}
		} catch (Exception e) {
			//TODO: handle exception
			return e.getMessage();
		}

		this.lastName = _lastName;
		return this.lastName;
	}

	public String getEmail(){
		return this.email;
	}

	/**
	 * 
	 * @param _email
	 */
	public String setEmail(String _email)
	{
		try {
			if (_email.isEmpty())
			{
				throw new Exception("Veuillez renseigner votre adresse mail.");
			}
		} catch (Exception e) {
			//TODO: handle exception
			return e.getMessage();
		}

		this.email = _email;
		return this.email;
	}

	/**
	 * 
	 * @param _hand
	 * @param _card
	 */
	public Card[] takeCardsHand(int _hand, Card _card)
	{
		return null;
	}

	public Card[] getCardHand(){
		return null;
	}

	public Card cardPlay(){
		return null;
	}

}