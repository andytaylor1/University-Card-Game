/**
* attribute class allows the name and the value for an attribute to be stored
*/
public class attribute {
  /** contains the attrbute name */
  private String attributeName;
  /** contains the value of the attrbute */
  private int attributeValue;

  public attribute(String Name, int value){
	  this.attributeName = Name;
	  this.attributeValue = value;
  }
  /**
  *Sets the name of the particular attribute
  */
  public void setAttributeName(String x){
    attributeName = x;
  }

  /**
  * Returns the name of the attribute name
  */
  public String getAttributeName(){
    return attributeName;
  }

  /**
  * Set the value of the particular attrbute
  */
  public void setAttributeValue(int x){
    attributeValue = x;
  }

  /**
  * Return the value of the attributeValue
  */
  public int getAttributeValue(){
    return attributeValue;
  }

  public void print(){
	  System.out.println("Attribute Name: "+attributeName+" Attribute Value: "+attributeValue);
  }

}
