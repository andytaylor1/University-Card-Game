import java.util.*;
public class Menu{
	
	private ArrayList<Player> playerList = new ArrayList<Player>();
	private boolean menuOpen = true;
	
	public ArrayList<Player> getPlayerList(){
		return playerList;
	}
	
	public int inputRequest(String x, int y){
		int n;
		System.out.println(x);
		String s = System.console().readLine();
		n = Integer.parseInt( s );
		return n;
	}
	
	public String inputRequest(String x, String y){
		System.out.println(x);
		String s = System.console().readLine();
		return s;
	}
	
	public void playerMenu(){
		while (menuOpen == true){
			int x = inputRequest("Would you like to enter a new player?\n 1.Yes\n or\n 2.No",0);
			if (x == 1){
				int y = inputRequest("Would you like to enter\n 1. Human Player\n 2. Random Computer\n 3. Clever Computer",0);
				if(y == 1) {
					String newPlayerName = inputRequest("Enter Player Name:", "x");
					playerList.add(new HumanPlayer(newPlayerName));
				}
				if(y == 2) {
					String newPlayerName = inputRequest("Enter Player Name:", "x");
					playerList.add(new RandomComputer(newPlayerName));
				}
				if(y == 3) {
					String newPlayerName = inputRequest("Enter Player Name:", "x");
					playerList.add(new CleverComputer(newPlayerName));
				}
			}
			if (x == 2){
				menuOpen = false;
			}
		}
		
		Dealer D = new Dealer(playerList);
		D.cardCreate();
		D.shuffle();
		playerList = D.getPlayerList();
	}
	
	public void pressKey(){ 
        System.out.println("Press Enter key to continue...");
        try{
            System.in.read();
        }  
        catch(Exception e)
        {}  
	}
}
	