import java.util.*;
public abstract class Player {
private String playerName;
private Deck playerDeck = new Deck();



  public Player(String name){
	this.playerName = name;
  }

  public abstract int getAttribute();
  
  public String getName(){
    return playerName;
  }

  public Deck getPlayerDeck(){
    return playerDeck;
  }
  
  public void printCurrentCard(){
	playerDeck.retrieveCard(0).printCard();
  }
  
  public int retrieveAttribute(int x){
	return playerDeck.retrieveCard(0).attributeRetrieve(x).getAttributeValue();
  }
  
  public card retrieveCurrentCard(){
	return playerDeck.retrieveCard(0);
  }
  
}
