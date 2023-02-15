import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ex7_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button button = new Button();
		//익명 클래스 - 클래스 선언과 객체 생성을 동시에 실행
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ActionEvent occured!");
			}
		});
	}

}
