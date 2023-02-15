
public class Ex4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i= 1; i <= 5; i++) {
//			for(int j=1; j<= 10; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=1; i <=5; i++) {
			System.out.print("*");
			int j = i;
			while (j>1) {
				System.out.print("*");
				j--;
			}
			System.out.println();
		}
	}

}
