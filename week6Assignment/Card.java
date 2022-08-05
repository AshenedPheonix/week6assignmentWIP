package week6Assignment;

//Step 1.a Setting up everything for the card class.
// Getters, setters, and description.

class Card {
	
	private static int value;
	private static String name;

	
	// recipe here???
	
	public Card(int i, String string) {
		value = i;
		name = string;
	}

	//step 1.a.II
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		Card.name= name;
	}
	
	public static int getValue()
	{
		return value;
	}
	
	public void setValue(int value)
	{
		Card.value= value;
	}
	
	//step 1.a.III
	public void description() 
	{
		System.out.println("Card is "+name);
		System.out.println("The value of the card is "+value);
	}
	
	
}
