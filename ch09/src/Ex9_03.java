import java.util.Objects;

class Card{
	String kind;
	int number;
	
	Card(){
		this("Spade", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	//Object 클래스의 toString 오버라이딩
	public String toString() {
		return "Shape is "+kind+" and number is "+number;
	}
	//equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
	public int hashCode() {
		return Objects.hash(kind,number);
	}
	//Object 클래스의 equals 오버라이딩
	public boolean equals(Object obj) {
		if (!(obj instanceof Card)) {
			return false;
		}
		
		Card c = (Card)obj;
		
		return this.kind.equals(c.kind) && this.number == c.number;
	}
}
public class Ex9_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card("Heart", 3);
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//equals 해쉬코드 확인
		c1.kind = "Spade";
		c1.number = 1;
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
