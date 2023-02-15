import java.util.*;
public class Ex4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0, answer = 0;
		
		answer = (int) (Math.random()*100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Between 1~100 integer : ");
			input = scanner.nextInt();
			
			if (input > answer) {
				System.out.println("Input Lower integer");
			}else if (input < answer) {
				System.out.println("Input Upper integer");
			}
		} while (input != answer);
	
		System.out.println("Answer is correct!");
	}

}
