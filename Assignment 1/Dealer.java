import java.util.*;
public class Dealer {
	private ArrayList<card> Crd = new ArrayList<>();
	private ArrayList<Player> playerList = new ArrayList<>();
	
	public Dealer(ArrayList x){
		this.playerList = x;
	}
	
	/** Creates 40 cards and assigns a random name to each card */
	public void cardCreate(){
		for( int x = 0; x < 20; x++){
			Names name = new Names();
			Crd.add(new card(name.nameGenerator()));
			Crd.get(x).attributeBuild();
		}
	}
	
	public void shuffle(){

		while(Crd.isEmpty() == false){
			for(int y = 0; y < playerList.size(); y++){
				if(Crd.isEmpty() == false){
					Crd.get(0);
					card takeOut = Crd.get(0);
					playerList.get(y).getPlayerDeck().addCard(takeOut);;
					Crd.remove(0);
				}
			}
		}
        for(int z = 0; z < playerList.size(); z++){
			Player playerIn = playerList.get(z);
			for(int a = 0; a < playerIn.getPlayerDeck().getDeckSize(); a++){
				playerIn.getPlayerDeck().retrieveCard(a).setCardNumber(a);
			}
        }
    }
	
	public ArrayList<Player> getPlayerList(){
		return playerList;
	}
}