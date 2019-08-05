import java.util.*;
public class Deck{
  private ArrayList<card> playerDeck = new ArrayList<>();
  private boolean outOfCards;

  public void addCard(card x){
    playerDeck.add(x);
  }

  public void removeCard(){
	playerDeck.remove(0);
	if(playerDeck.isEmpty() == true){
		outOfCards = true;
	}
  }

  public card retrieveCard(int x){
	  if(playerDeck.isEmpty() == false){
		return playerDeck.get(x);
	  }
	  else return null;
  }

  public int getDeckSize(){
    return playerDeck.size();
  }

  public boolean getDeckEmpty(){
    return playerDeck.isEmpty();
  }

  public boolean getOutOfCards(){
    return outOfCards;
  }

  public void printDeckCard(){
    for(int x = 0; x < playerDeck.size(); x++){
    playerDeck.get(x).printCard();
    }
  }

}
