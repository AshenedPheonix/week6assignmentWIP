package week6Assignment;

import java.util.ArrayList;

//Step 1.c
public class Player {
	
	//1.c.I.1 Creating a list of cards for player hand.
	//Also not sure if this is correct. Ask mentor.
	
	ArrayList<Card> hand = new ArrayList<>();
	
	//1.c.I.2&3 
	int score = 0;
	String name;
	
	//1.c.II.1
	
	
	
	
	public void describe() {

		System.out.println("============================================================");
		System.out.println(name+" Player Details as Follows");
		System.out.println("Player Score:"+score);
		System.out.println("Player Hand is as follows");
		System.out.println("------------------------------------------------------------");
		
		for (Card card : hand) {
			card.description();
		}
	
		System.out.println("============================================================");
	}
	
	//1.c.II.2
	
	public Card flip(ArrayList<Card> hand) {
		return hand.remove(0);
	}
	
	//1.c.II.3
	//Unable to figure out how to call description of card in player hand. Ask mentor.
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//1.d.II.4 Super easy score-implement
	public void incrementScore() {
		score++;
	}

	public Object handValue() {
		Object[]obArr = hand.toArray();
		Integer[]intArr = new Integer[obArr.length];
		return intArr[0];
	}
	
}
