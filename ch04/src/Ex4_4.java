import java.util.*;
public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		char grade = 'D';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your score?");
		score = scanner.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		}
		
		System.out.println("Your grade is "+grade+".");
	}

}
