package _2_quiz13;

public class Marine extends Unit {//해병
	
	//공격력을 가짐
	//마린의 공격력이 업데이트 되면 객체마다 동일한 값을 갖습니다.
	public static int attack = 6;
	
	public Marine() {
		super(0, 0, 40);
	}
	
	/*
	 * hold() 기능
	 * 마린의 현재 위치 출력, stop 메서드 호출
	 */
	
	@Override
	public void hold() {
		stop();
		System.out.println( "Marine의 현재 위치 : (" + x + ", " + y + ")");
	}

	/*
	 * move()의 기능
	 * 1. 현재 좌표값에서 매개변수의 좌표만큼 이동한거리를 구한다.
	 *    공식 루트 Math.sqrt(값)(피타고라스 정리)
	 * 2. 이동한 거리를 정수형으로 출력
	 */
	
	@Override
	public void move(int x, int y) {
		int d2 = ((x - super.x)*(x - super.x)) + ((y - super.y)*(y - super.y));
		System.out.println("Marine의 이동거리 : " + (int)Math.sqrt(d2));
		super.x = x;
		super.y = y;
	}
	
}
