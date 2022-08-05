package week6Assignment;

public class App {
	
	//Step 2.
	
	public static void main(String[] args) {
		

		
		String winner = null; //For steps 6/7.
		
		//Step 3.
		Player player1 = new Player();
		player1.name = "Alexandra";
		
		
		Player player2 = new Player();
		player2.name = "Sophia";
		
		
		Deck deck1 = new Deck();
		
		
		
		//Does this even work? Depends on what instructor says about shuffle in Deck class.
		Deck.shuffle(deck1);
		
		//Step 4. Drawing 42 times to each player. I also have no idea what I'm doing here. Need to fix draw in deck first.
		
		Deck.createPlayersHands(deck1, player1, player2);
		
		//Step 5. Gameplay. This works. Kind of. Check if flip is doing what flip does.

		
		for (int i = 0; i < 26; i++) {
			
			Object[]obArr1 = player1.hand.toArray();
			Integer[]intArr1 = new Integer[obArr1.length];
			Object[]obArr2 = player1.hand.toArray();
			Integer[]intArr2 = new Integer[obArr2.length];

			if (intArr1[0] != intArr2[0]) {
				if (intArr1[0] > intArr2[0]) {
					player1.incrementScore();
				}
				else {
					player2.incrementScore();
				}
				
			player1.flip(player1.hand);
			player2.flip(player2.hand);
			}
		}
		
		//step6/7. This works, don't touch!
		System.out.println("*****************");
		System.out.println("***Final Score***");
		System.out.println("*****************");
		System.out.println("Player 1: "+player1.score);
		System.out.println("Player 2: "+player2.score);
		
		if (player1.score != player2.score) {
			if (player1.score > player2.score) {
				winner += "Player 1";
			}
			else {
				winner += "Player 2";
			}
		}
		else {
			winner += "Draw";
		};
		System.out.println("The winner is:");
		System.out.println(winner);
	}

}
