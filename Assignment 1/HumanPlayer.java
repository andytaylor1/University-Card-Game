import java.util.*;
class HumanPlayer extends Player {
	private Random r = new Random();

  public HumanPlayer(String name){
    super(name);
  }

    public int getAttribute(){
		int n;
			System.out.println( "Please enter an attribute to select" );
			String s = System.console().readLine();
			n = Integer.parseInt( s );
		return n;
	}
}
