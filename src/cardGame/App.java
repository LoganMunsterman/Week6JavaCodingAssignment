package cardGame;

public class App {

  public static void main(String[] args) {
    
    Deck deck = new Deck();
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");
    deck.shuffle();
    
    for (int i = 1; i <= 52; i++) {
      if (i % 2 == 0) {
        player1.draw(deck);
      } else {
        player2.draw(deck);
      }
    }
    
    for (int i = 1; i < 26; i++) {
      Card player1Card = player1.flip();
      Card player2Card = player2.flip();
        if (player1Card.getValue() > player2Card.getValue()) {
          player1.incrementScore();
        } else if (player1Card.getValue() < player2Card.getValue()) {
          player2.incrementScore();
        }
    }
    System.out.println("Player 1 final score = " + player1.playerScore());
    System.out.println("Player 2 final score = " + player2.playerScore());
      if (player1.playerScore() > player2.playerScore()) {
          System.out.println("Player 1");
      } else if (player1.playerScore() < player2.playerScore()) {
          System.out.println("Player 2");
      } else {
          System.out.println("Draw");
      }
  }
}
