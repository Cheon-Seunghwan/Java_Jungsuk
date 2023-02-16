
public class Ex9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ival = 100;
		String strVal = String.valueOf(ival);
		
		double dVal = 200.0;
		String strVal2 = String.valueOf(dVal);
		
		//parseint에 +가 들어가도 정상적으로 작동한다.
		double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.parseDouble(strVal2);
		
		System.out.println(""+sum+" "+sum2);
		//구분자, 요소 - 속도 향상
		System.out.println(String.join("!", strVal," ", strVal2));
	}

}
