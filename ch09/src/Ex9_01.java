
public class Ex9_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Value v1 = new Value(10);
		 Value v2 = new Value(10);
		 
		 System.out.println(v1.equals(v2));
	}

}

class Value{
	int value;
	
	Value (int value){
		this.value = value;
	}
	
	//오버라이딩을 통해 주소가 아닌 값을 비교하게 만듦
	public boolean equals(Object object) {
		//value 클래스 타입이 아닌 경우
		if (!(object instanceof Value)) {
			return false;
		}
		//형변환을 해야 변수 비교 가능
		Value value = (Value)object;
		
		return this.value == value.value;
	}
}