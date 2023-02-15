
public class Ex4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, sum = 0;
		
		while (true) {
			if(sum>100)
				break;
			
			++i;
			sum += i;
		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
