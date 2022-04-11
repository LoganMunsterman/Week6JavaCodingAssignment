package cardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

  private List<Card> hand = new ArrayList<Card>();
  private int score;
  private String name;
  
 
  public Player(String newName) {
    name = newName;
    score = 0;
  }
  

  public void describe() { 
    System.out.println(name);
    System.out.println("Score: " + score);
    System.out.println("Hand: ");
    for (Card card : hand) {
      card.describe();
    }
  }
  
  public Card flip() {
    Card flippedCard = hand.get(0);
    hand.remove(0);
    return flippedCard;
  }
  
  public void draw(Deck deck) {
      hand.add(deck.draw());
  }
  public void incrementScore() {
    score++;
  }

  public int playerScore() {   
    return score;
  }
  }