package week6Assignment;
import java.util.Collections;
import java.util.List;

//Step 1.b
public class Deck {

	//step1.b.I&II Creating a list of cards
	//There's probably an easier way to do this, I'll have to come back later.
	
	static List<Card> deck;
	Card card1= new Card(2,"2 of Diamonds");
	Card card2= new Card(3,"3 of Diamonds");
	Card card3= new Card(4,"4 of Diamonds");
	Card card4= new Card(5,"5 of Diamonds");
	Card card5= new Card(6,"6 of Diamonds");
	Card card6= new Card(7,"7 of Diamonds");
	Card card7= new Card(8,"8 of Diamonds");
	Card card8= new Card(9,"9 of Diamonds");
	Card card9= new Card(10,"10 of Diamonds");
	Card card10= new Card(11,"Jack of Diamonds");
	Card card11= new Card(12,"Queen of Diamonds");
	Card card12= new Card(13,"King of Diamonds");
	Card card13= new Card(14,"Ace of Diamonds");
	Card card14= new Card(2,"2 of Spades");
	Card card15= new Card(3,"3 of Spades");
	Card card16= new Card(4,"4 of Spades");
	Card card17= new Card(5,"5 of Spades");
	Card card18= new Card(6,"6 of Spades");
	Card card19= new Card(7,"7 of Spades");
	Card card20= new Card(8,"8 of Spades");
	Card card21= new Card(9,"9 of Spades");
	Card card22= new Card(10,"10 of Spades");
	Card card23= new Card(11,"Jack of Spades");
	Card card24= new Card(12,"Queen of Spades");
	Card card25= new Card(13,"King of Spades");
	Card card26= new Card(14,"Ace of Spades");
	Card card27= new Card(2,"2 of Clubs");
	Card card28= new Card(3,"3 of Clubs");
	Card card29= new Card(4,"4 of Clubs");
	Card card30= new Card(5,"5 of Clubs");
	Card card31= new Card(6,"6 of Clubs");
	Card card32= new Card(7,"7 of Clubs");
	Card card33= new Card(8,"8 of Clubs");
	Card card34= new Card(9,"9 of Clubs");
	Card card35= new Card(10,"10 of Clubs");
	Card card36= new Card(11,"Jack of Clubs");
	Card card37= new Card(12,"Queen of Clubs");
	Card card38= new Card(13,"King of Clubs");
	Card card39= new Card(14,"Ace of Clubs");
	Card card40= new Card(2,"2 of Hearts");
	Card card41= new Card(3,"3 of Hearts");
	Card card42= new Card(4,"4 of Hearts");
	Card card43= new Card(5,"5 of Hearts");
	Card card44= new Card(6,"6 of Hearts");
	Card card45= new Card(7,"7 of Hearts");
	Card card46= new Card(8,"8 of Hearts");
	Card card47= new Card(9,"9 of Hearts");
	Card card48= new Card(10,"10 of Hearts");
	Card card49= new Card(11,"Jack of Hearts");
	Card card50= new Card(12,"Queen of Hearts");
	Card card51= new Card(13,"King of Hearts");
	Card card52= new Card(14,"Ace of Hearts");
	
	//step1.b.II  Adding shuffle method. Not too sure about this part, ask mentor. 
	
	public static void shuffle(Deck deck1) {
	Collections.shuffle(deck);
	}
	
	
	//step1.c.III

	public Card draw() {
		Card drawnCard = deck.get(0);
		deck.remove(drawnCard);
		return drawnCard;
	}
	
	public static void createPlayersHands(Deck deck, Player player1, Player player2) {
		for (int i =0; i <52; i++) {
			if (i % 2 ==0)
				player1.draw(deck);
		}  {
			player2.draw(deck);
		}
		
	}
		

}