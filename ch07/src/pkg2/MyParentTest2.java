package pkg2;

import pkg1.MyParent;

//protected 범위 - 다른 패키지 상속
class MyChild extends MyParent{
	public void printMembers() {
//		System.out.println(prv); //에러
//		System.out.println(dft); //에러
		System.out.println(prt);
		System.out.println(pub);
	}
}

public class MyParentTest2 {
	//public 범위
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p = new MyParent();
		
//		System.out.println(p.prv); //에러
//		System.out.println(p.dft); //에러
//		System.out.println(p.prt); //에러 - 아예 상속이 없는 클래스 이기 때문이다.
		System.out.println(p.pub);
	}

}
