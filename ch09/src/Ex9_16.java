import java.util.ArrayList;

public class Ex9_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl+shift+o
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100));
		//원래는 객체만 추가할 수 있으나 컴파일러가 오토박싱 해준다.
		list.add(100);
		
		Integer integer = list.get(0);
		//integer타입 참조형 변수를 int형으로 변환해야한다.
		int integer1 = list.get(0).intValue();
		//마찬가지로 자동으로 컴파일러가 언박싱 해준다.
		int integer2 = list.get(0);
	}

}
