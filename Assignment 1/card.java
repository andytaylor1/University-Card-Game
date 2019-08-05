import java.util.*;
/** contains and sets the attributes for each card */
public class card {
	/** holds the name of the card*/
	private String cardName;
	private int cardNumber;
	/** contains the attrbutes for the particular card */
	//private ArrayList<attribute> att = new ArrayList<attribute>();
	private HashMap<Integer, attribute> att = new HashMap<>();

	public card(String name){
		this.cardName = name;
	}

	public void setCardNumber(int x){
		cardNumber = x;
	}

	public int getCardNumber(){
		return cardNumber;
	}

	/** Assigns attributes randomly */
		public void attributeBuild(){
		Random r = new Random();

		//for(int y=0; y < 6; y++)
			att.put(0, new attribute("Speed", r.nextInt(9)));
			att.put(1, new attribute("Strength", r.nextInt(9)));
			att.put(2, new attribute("Agility", r.nextInt(9)));
			att.put(3, new attribute("FirePower", r.nextInt(9)));
			att.put(4, new attribute("Mental", r.nextInt(9)));
			//attribute Attribute = new attribute(""+y,r.nextInt(19));
			//att.add(Attribute);
		//}
	}

	/** prints out the card name and attributes */
			public void printCard(){
			System.out.println("Card name is "+cardName);
			for (int y=0;y<att.size();y++){
				att.get(y).print();
			}
	}

	public attribute attributeRetrieve(int x){
		return att.get(x);
	}
	
	public HashMap<Integer, attribute> getAttributeMap(){
		return att;
	}
}
