class Outer{
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
		static int scv = outerCv;
		//스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
		//int siv = outerIv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0; //final 생략가능 - 값이 바뀌지 않으면 상수로 취급
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = LV;
			//상수를 제외한 지역변수는 접근 불가 - jdk 1.8 이후로는 가능
			int liv4 = lv;
		}
	}
}
