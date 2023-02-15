import java.util.Scanner;

public class Ex5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] question = {
				{"what", "you"},
				{"want", "for"},
				{"me", "?"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<question.length; i++) {
			
			System.out.printf("%s?",question[i][0]);
			
			String tmp = scanner.nextLine();
			
			if (tmp.equals(question[i][1])) {
				System.out.println("correct");
			}else {
				System.out.println("wrong");
			}
				
			}
		}
	}


