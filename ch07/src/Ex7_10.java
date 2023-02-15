
public class Ex7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//각 요소 별 메서드는 호출 불가능
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		
		for (int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}

}

abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("Stop!");
	}
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine moves "+x+", "+y);
	}
	void stimPack() {
		System.out.println("Let's Burn out!");
	}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank moves "+x+", "+y);
	}
	void SeizeMode() {
		System.out.println("Ready to Rollout!");
	}
}

class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship moves "+x+", "+y);
	}
	void load() {
		
	}
}