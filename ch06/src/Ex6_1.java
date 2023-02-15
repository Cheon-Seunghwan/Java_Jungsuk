import java.util.Scanner;

public class Ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What is your favorite food?");

		Scanner scr = new Scanner(System.in);
		
		String anw = scr.nextLine();
		System.out.printf("Your favorite food is %s.", anw);
	}

}
