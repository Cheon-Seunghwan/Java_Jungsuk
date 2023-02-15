
public class Ex7_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();
//		Product computerProduct = new Computer();
		//참조변수 없이 바로 객체를 넘겨주는 것, 참조변수가 없기 때문에 객체를 다룰 수는 없다.
		buyer.buy(new Computer());
		
		System.out.println("You have "+buyer.money+" dollar.");
		System.out.println("You have "+buyer.bonusPoint+" bonusPoint.");
	}

}
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("You can't buy this!");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		//문자열 출력 시 객체 적으면 return값이 나온다.
		System.out.println("You buy a "+p);
		System.out.println(p + "is charged.");
	}
}

class Product{
	int price;
	int bonusPoint;
	
	Product(){}
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10);
	}
}

class Tv3 extends Product{
	Tv3(){
		super(100);
	}
	//object 클래스 오버라이딩
	public String toString () {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(80);
	}
	//object 클래스 오버라이딩
	public String toString() {
		return "Computer";
	}
}