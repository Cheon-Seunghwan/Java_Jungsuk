import java.util.Iterator;

public class Ex4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
//		주사위 숫자 랜덤
		for (int i = 1; i <= 6; i++) {
			num = (int) (Math.random()*6+1);
			System.out.println(num);
		}
		
		
		
	}

}
