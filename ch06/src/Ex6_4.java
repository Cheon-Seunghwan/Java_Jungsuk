
public class Ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Mymath objectMymath = new Mymath();
		
		Long result1 = Mymath.add(50L, 100L);
		Mymath.printMath(result1);
		
		double result2 = Mymath.divide(50, 2);
		Mymath.printMath(result2);
		
		Mymath.printGuGudan(41);
	}

}

class Mymath{
	//클래스 내의 지역변수를 이용하지 않을 때
	static void printMath(double result){
		System.out.println("Result is "+ (int)result);
	}
	
	static void printGuGudan(int dan) {
		for(int i=0;i<9; i++) {
			System.out.printf("%d * %d = %d%n",dan, i+1, dan*(i+1));
		}
	}
	
	static long add(long a, long b) {
		long result = a+b;
		return result;
	}
	
	static long substract(long a, long b) {
		long result = a-b;
		return result;
	}
	
	static long multiply(long a, long b) {
		long result = a*b;
		return result;
	}
	
	static double divide(double a, double b) {
		double result = a/b;
		return result;
	}
}