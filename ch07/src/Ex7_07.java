
public class Ex7_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		//형변환 생략가능
		Car c = fe;
		c.drive();
		//형변환 생략불가
		FireEngine fe2 = (FireEngine) c;
		fe2.water();
		//다형성
		Car c2 = new FireEngine();
		c2.stop();
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("Drive!");
	}
	
	void stop() {
		System.out.println("Stop!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("Water!");
	}
}