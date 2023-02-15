
public class Ex6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data_1 data_1 = new Data_1();
		Data_2 data_2 = new Data_2(10);

	}

}
class Data_1{
	int value;
}

class Data_2{
	int value;
	
	Data_2(){}  //생성자 추가 
	
	Data_2(int x){
		value = x;
	}
}