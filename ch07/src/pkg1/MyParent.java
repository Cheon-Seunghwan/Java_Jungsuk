package pkg1;

public class MyParent{ //접근제어자가 default임
	private 	int prv;
				int dft;
	protected 	int prt;
	public 		int pub;
	//private 범위
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest {
	//default 범위
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p = new MyParent();
		
//		System.out.println(p.prv); //에러 private이라 같은 클래스에서만 가능
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
