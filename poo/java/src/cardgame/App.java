package cardgame;

public class App {

    public static void main(String[] args) {

        Player player1 = new Player("_email", "_lastName", "_firstName", "_pseudo");
        Card card1 = new Card(new TypeOfCard( , "_description", "_id"), "_capacity", "_armor", 50, "_nameOfCard");

        System.out.println(player1.getEmail() + " " + player1.getFirstName() + " " + player1.getLastName() + " " + player1.getPseudo());
        System.out.println(card1);
        
    }
    
}
