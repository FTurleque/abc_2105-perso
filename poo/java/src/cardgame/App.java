package cardgame;

public class App {

    public static void main(String[] args) {

        Player player1 = new Player("toto@gmail.com", "Toto", "Touto", "Mr T");
        Player player2 = new Player("yoyo@hotmail.fr", "Yoga", "Cygnus", "Yo");
        Card card1 = new Card(new TypeOfCard(TypeOfCardName.PALADIN, VitalEnergies.FIRE, "_description", 7), "_capacity", "_armor", 50, "_nameOfCard");

        System.out.println(player1.getEmail() + " " + player1.getFirstName() + " " + player1.getLastName() + " " + player1.getPseudo());
        System.out.println(card1);
        
    }
    
}
