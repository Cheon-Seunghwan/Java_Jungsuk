
public class Ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		Card c1 = new Card();
		
		c1.kind = "heart";
		c1.num = 5;
		
		Card c2 = new Card();
		
		c2.kind = "spade";
		c2.num = 6;
		
	}

}

class Card {
	String kind;
	int num;
	static int width = 100;
	static int height = 250;
}