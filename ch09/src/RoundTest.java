
public class RoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  d   d1    d2");
		for (double d = 0.0; d <= 2.0; d+=0.1) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			
			System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);
		}
	}

}
