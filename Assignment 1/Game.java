import java.util.*;
/** Main class for the game */
public class Game{
	static boolean gameInPlay = true;
	static Menu m = new Menu();


	public static void main(String[] args) {
	
	
	m.playerMenu();
	mainGame();


	}
	  
	public static void mainGame(){
		
		while (gameInPlay==true){
			
			
			for(int x = 0; x < m.getPlayerList().size(); x++){	// round
				m.getPlayerList().get(x).printCurrentCard(); 
				int selectedAttribute = m.getPlayerList().get(x).getAttribute(); 
				System.out.println(m.getPlayerList().get(x).getName()+" picks attrbute "+selectedAttribute);
				int topScore = 0;
				int winningPlayer = 0;
					
				for(int z = 0; z < m.getPlayerList().size(); z++)
				{ // check scores
					if(m.getPlayerList().get(z).retrieveAttribute(selectedAttribute) > topScore){
						topScore = m.getPlayerList().get(z).retrieveAttribute(selectedAttribute);
						System.out.println("winning player is now "+m.getPlayerList().get(z).getName()+" highest score is  now "+topScore);
						winningPlayer = z;
					}
				}
				  
				for(int z = 0; z < m.getPlayerList().size(); z++){ // remove cards and give to winner
					m.getPlayerList().get(winningPlayer).getPlayerDeck().addCard(m.getPlayerList().get(z).retrieveCurrentCard());
					System.out.println("Card added to winner "+m.getPlayerList().get(winningPlayer).getName());
					m.getPlayerList().get(z).getPlayerDeck().removeCard();
					System.out.println("card removed from "+m.getPlayerList().get(z).getName());
				}
				for(int z = 0; z < m.getPlayerList().size(); z++){
					if(m.getPlayerList().get(z).getPlayerDeck().getOutOfCards() == true){ // remove players with no cards
					System.out.println(m.getPlayerList().get(z).getName()+" has been removed from the game\n--------------------------------------");
					m.getPlayerList().remove(z); 	
					}
				
				m.pressKey(); // Request key press to progress
				}
				if(m.getPlayerList().size() == 1){ // End Game
					gameInPlay=false; System.out.println("game over");
				}  
			}
		}
	}
}
