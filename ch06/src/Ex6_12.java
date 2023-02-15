class Car{
	String colorString;
	String gearTypString;
	int door;
}

class Car2{
	String colorString;    
	String gearTypString;  
	int door;
	
//	Car2(){}
	Car2(String c, String g, int d){
		
		colorString = c;
		gearTypString = g;
		door  = d;
	}
}
public class Ex6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		
		
		
		Car2 c2 = new Car2("white", "auto", 4);
		
		
		System.out.println(c1.colorString);
		System.out.println(c2.colorString);
	}

}
