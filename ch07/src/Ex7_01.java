class Tv{
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class smartTv extends Tv {
	boolean caption;
	void displayCaption(String textString) {
		if (caption) {
			System.out.println(textString);
		}
	}
}
public class Ex7_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartTv stv = new smartTv(); 
		
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);

		stv.displayCaption("Hello, Tv!");
		stv.caption = true;
		stv.displayCaption("Hello, Tv2!");
	}

}
