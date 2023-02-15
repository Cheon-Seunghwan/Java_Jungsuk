
public class Ex6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data3 d = new Data3();
		
		d.x = 10;
		
		Data3 d2 = copyData(d);
		
		System.out.println(d2.x);
		
		d2.x = 20;
		
		System.out.println(d.x);
		System.out.println(d2.x);
				
	}
	
	
	static Data3 copyData(Data3 d) {
		
		Data3 tmpData = new Data3();
		
		tmpData.x = d.x;
		
		return tmpData;
		
		
	}

}

class Data3 {
	int x;
}