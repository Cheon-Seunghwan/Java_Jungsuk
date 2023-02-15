import java.util.*;
public class Ex4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What month is it now?");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch (month) {
		case 3: case 4: case 5:{
			System.out.println("The Season is Spring.");
			break;
		}
		case 6: case 7: case 8:{
			System.out.println("The Season is Summer.");
			break;
		}
		case 9: case 10: case 11:{
			System.out.println("The Season is Autumn.");
			break;
		}
		default:
			System.out.println("The Season is Winter.");
		}
	}

}
