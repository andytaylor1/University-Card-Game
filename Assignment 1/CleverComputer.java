import java.util.*;
public class CleverComputer extends Player{
	
	public CleverComputer(String name){
		super(name);
	}
	
	public int getAttribute(){
		int y = 0;
		for(int x = 0; x < retrieveCurrentCard().getAttributeMap().size(); x++){
			if (retrieveAttribute(x) < y){
				y = retrieveAttribute(x);
			}
		}
		return y;
	}
}