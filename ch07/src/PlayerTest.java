
public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		int pos = ap.playing(100);
		pos = ap.playing(pos);
		ap.stop(pos);
	}

}

abstract class Player{
	abstract void play(int pos);
	abstract void stop(int pos);
}

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println("Playing start at "+pos);
	}
	int playing(int pos) {
		pos += 1;
		System.out.println("Your playing at "+pos);
		return pos;
	}
	void stop(int pos) {
		System.out.println("Stop at "+pos);
	}
}