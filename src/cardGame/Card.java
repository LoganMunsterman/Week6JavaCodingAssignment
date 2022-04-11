package cardGame;

public class Card {

    int value;
    String name;

    public void setValue(int newValue) {
     
      this.value = newValue;
    }
    public int getValue() {
      return value;
      
    }
    public void setName(String newName) {
      this.name = newName;
    }
    public String getName() {
      return name;
    }
    public void describe() {
      System.out.println(value + " " + name);
      
    }
      

  }
    

 