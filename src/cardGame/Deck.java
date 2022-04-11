package cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
  
  List<Card> cards;
  
  Map<Integer, String> suits = new HashMap<Integer, String>();
    
 Map<Integer, String> cardNames = new HashMap<Integer, String>();
 
   private void loadMaps() {
     cardNames.put(2, "Two");
     cardNames.put(3, "Three");
     cardNames.put(4, "Four");
     cardNames.put(5, "Five");
     cardNames.put(6, "Six");
     cardNames.put(7, "Seven");
     cardNames.put(8, "Eight");
     cardNames.put(9, "Nine");
     cardNames.put(10, "Ten");
     cardNames.put(11, "Jack");
     cardNames.put(12, "Queen");
     cardNames.put(13, "King");
     cardNames.put(14, "Ace");
     suits.put(0, "Spades");
     suits.put(1, "Hearts");
     suits.put(2, "Clubs");
     suits.put(3, "Diamonds");    
   }

  public Deck() {
    loadMaps();
    cards = new ArrayList<Card>();
    for (int s = 0; s <= 3; s++) {
      for (int i = 2; i <= 14; i++) {
        Card c = new Card();
          c.setValue(i);
          c.setName(cardNames.get(i) + " of " + suits.get(s));
            cards.add(c);
      }
    } 
  }
    public void shuffle() {
      Collections.shuffle(cards);
    }
    public Card draw() {
      Card drawnCard = cards.get(0);
      cards.remove(0);
      return drawnCard;
    }
}