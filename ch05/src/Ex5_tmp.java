import java.util.Arrays;

public class Ex5_tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,5};
		
		int[][] arr2 = {
				{11,12},
				{21,22}
		};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2));
		
		String[][] str1 = {
				{"aaa","bbb","ccc"},
				{"ddd","eee","fff"}
		};
		String[][] str2 = {
				{"aaa","bbb","ccc"},
				{"ddd","eee","fff"}
		};
		
		System.out.println(Arrays.deepEquals(str1, str2));
		
		int[] arr3 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr3));
	}

}
