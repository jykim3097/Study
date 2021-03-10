package _2_quiz13;

public class Tank extends Unit {
	
	public Tank() {
		super(0,0,200);
	}
	
	//hold, move의 기능은 동일

	@Override
	public void hold() {
		stop();
		System.out.println("Tank의 현재 위치 : (" + x + ", " + y + ")");
	}

	@Override
	public void move(int x, int y) {
		int d2 = ((x - super.x)*(x - super.x)) + ((y - super.y)*(y - super.y));
		System.out.println("Tank의 이동거리 : " + (int)Math.sqrt(d2));
		super.x = x;
		super.y = y;
	}
}
