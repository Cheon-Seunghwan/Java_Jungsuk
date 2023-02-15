class AAA{
	int i = 100;
	class BBB{
		void method() {
			System.out.println(i);
		}
	}
}
//class BBB{
//	void method() {
//		AAA aaa = new AAA();
//		System.out.println(aaa.i);
//	}
//}
public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA aaa = new AAA();
		AAA.BBB bbb = aaa.new BBB();
		bbb.method();
	}

}
