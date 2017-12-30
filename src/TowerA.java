
import javax.swing.Timer;

public class TowerA extends Tower{
	
	
	
	public TowerA(int x, int y) {
		super(x, y, 1);
	}
	
	protected String getImageName() {
		return "bin\\TowerA.png";
	}
	
	protected  void shootMissiles() {
		missiles.add(new MissileA(x , y + height / 8));
		missiles.add(new MissileA(x , y + height / 8));
		missiles.add(new MissileA(x , y + height / 8));
	}
	
	
}
