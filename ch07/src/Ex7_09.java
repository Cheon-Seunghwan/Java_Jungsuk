class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	
	Product2[] cart = new Product2[5];
	
	int i = 0;
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("You can't buy this!");
			
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println("You buy "+p);
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				break;
			}
			
			sum += cart[i].price;
			itemList += cart[i] + ", ";
			//객체 배열 사용해서 출력하면 메서드가 호출된다!
			System.out.println(cart[i]);
		}
		
		System.out.println("Amount of product is "+sum);
		System.out.println("Your purchase list are "+itemList);
		System.out.println("Here is charge "+money);
		System.out.println("Your Bonus Point it "+bonusPoint);
	}
}
public class Ex7_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer2 buyer2 = new Buyer2();
		
		buyer2.buy(new Audio2());
		buyer2.buy(new Computer2());
		buyer2.summary();
	}

}

class Product2{
	int price;
	int bonusPoint;
	
	String test() {
		return "Test";
	}
	Product2() {
		// TODO Auto-generated constructor stub
	}
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10);
	}
}

class Tv2 extends Product2{
	Tv2() {
		// TODO Auto-generated constructor stub
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2{
	Computer2() {
		// TODO Auto-generated constructor stub
		super(80);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2{
	Audio2() {
		// TODO Auto-generated constructor stub
		super(30);
	}
	public String toString() {
		return "Audio";
	}
}