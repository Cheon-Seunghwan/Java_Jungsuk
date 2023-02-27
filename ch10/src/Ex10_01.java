import java.util.Calendar;

public class Ex10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getInstance로 현재 시스템 상 시간을 가져온다.
		Calendar today = Calendar.getInstance();
		//calendar함수 year
		System.out.println(today.get(Calendar.YEAR));
		//calendar함수 month 0~11범위이기에 +1생각하기
		System.out.println(today.get(Calendar.MONTH)+1);
		//date와 day of month는 같다.
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		//해당 년도의 몇번째 주인지 계산
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));
		//해당 년도의 몇번째 달인지 계산
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));
		//해당 년도의 몇번째 일인지 계산
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
		//무슨 요일인지 계산
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		//이 달의 몇 번째 요일인지 계산
		System.out.println(today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//AM,PM 계산 0과 1로 표현
		System.out.println(today.get(Calendar.AM_PM));
		//몇 시인지 계산
		System.out.println(today.get(Calendar.HOUR));
		//오늘의 몇시간 째인지 계산
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		//이 달의 마지막 날
		System.out.println(today.getActualMaximum(Calendar.DATE));
		//천분의 일초 단위로 변환
		System.out.println(today.getTimeInMillis());
		//1초 단위
		System.out.println(today.getTimeInMillis()/1000);
		//1분 단위
		System.out.println(today.getTimeInMillis()/(1000*60));
		//1시간 단위
		System.out.println(today.getTimeInMillis()/(1000*60*60));
		//하루 단위
		System.out.println(today.getTimeInMillis()/(1000*60*60*24));
	}

}
