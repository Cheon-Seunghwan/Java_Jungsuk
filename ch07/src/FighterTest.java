abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("Stop!");
	}
}

interface fightable{
	//public abstract 생략 가능
	public abstract void move(int x, int y);
	public abstract void attack(fightable f);
}

class Fighter extends Unit implements fightable{
	//오버라이딩 규칙 : 조상보다 접근제어자가 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("x : "+x+", y : "+y);
	}
	public void attack(fightable f) {
		System.out.println("attack "+f);
	}
	fightable getFightable() {
		return new Fighter();
	}
}
public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		f.move(3, 5);
		f.attack(f);
		
		fightable f2 = f.getFightable();
		
		f2.attack(f2);
		
	}

}
