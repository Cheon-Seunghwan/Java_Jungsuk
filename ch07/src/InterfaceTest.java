//class A{
//	public void method(B b) {
//		b.method();
//	}
//}
//
//class B{
//	public void method() {
//		System.out.println("Class B");
//	}
//}

//interfaceTest
class A{
	public void method(I i) {
		i.method();
	}
}

interface I{
	public abstract void method();
}

class B implements I{
	public void method() {
		System.out.println("Class B");
	}
}

class C implements I{
	public void method() {
		System.out.println("class C");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		a.method(new B());
		
		a.method(new C());
	}

}
