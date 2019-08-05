import java.util.*;
public class RandomComputer extends Player{
	private Random r = new Random();


  public RandomComputer(String name){
    super(name);
  }
  
  public int getAttribute(){
	  return r.nextInt(4);
  }
	
}
