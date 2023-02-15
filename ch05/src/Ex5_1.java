import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[5];
//		
//		for(int i=0; i < arr.length; i++) {
//			
//			arr[i] = i*10+50;
//			
//			System.out.println(arr[i]);
//		}
		
		
		int[] arr = {50,60,70,80,90};
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
		
		//배열 내용 출력 import 자동 생성 control+shift+o
		System.out.println(Arrays.toString(arr));
	}

}
