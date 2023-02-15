class Car5{
	String colorString;
	String gearString;
	int door;

	Car5(){
		this("white", "auto", 4); // 코드 중복을 제거하기 위해 
	}
	
	Car5(String c, String g, int d){
		colorString = c;
		gearString = g;
		door = d;
	}
}
public class Ex6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car5 car = new Car5();
		
		System.out.println("gear is " + car.gearString);
	}

}
