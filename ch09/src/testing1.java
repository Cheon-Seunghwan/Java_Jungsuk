class Test{
	int t1;
	String t2;
	
	Test(int t1, String t2){
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public String toString() {
		return "t1 : "+t1+", t2 : "+t2;
	}
}
public class testing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test(3, "Test");
		
		System.out.println(test);
	}

}
