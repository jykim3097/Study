package _2_quiz13;

public class Dropship extends Unit { //드랍십은 탱크랑 마린을 태울 수 있다
	
	//Marine과 Tank를 태울 수 있다.
	//1. Unit을 저장할 수 있는 8칸 배열 생성, index 변수도 선언
	private Unit[] unit = new Unit[8];
	private int index = 0;

	public Dropship() {
		super(0, 0, 200);
	}

	/*
	 * 2. hold의 기능은 동일
	 * 2-1. move()의 기능
	 *    수송선이 움직이면 수송선에 타고 있는 유닛의 위치를 전부 수송선의 위치로 변경
	 */
	@Override
	public void hold() {
		stop();
		System.out.println( "Dropship의 현재 위치 : (" + x + ", " + y + ")");
	}

	@Override
	public void move(int x, int y) {

		int d2 = ((x - super.x)*(x - super.x)) + ((y - super.y)*(y - super.y));
		System.out.println("Dropship의 이동거리 : " + (int)Math.sqrt(d2));
		super.x = x;
		super.y = y;
		
		if(index > 0) { //마린이나 탱크가 하나라도 적재되어 있다면
			for(int i=0; i<index; i++) {
				unit[i].x = x;
				unit[i].y = y;
			}
		}
	}
	
	/*
	 * 3. 드랍쉽만의 기능 ride()
	 * 
	 * - 배열의 크기는 8 고정, 수송선 안에는 탱크와 마린이 탈 수 있습니다.
	 * - 탱크는 4칸, 마린은 1칸을 차지한다.
	 * 
	 * - 배열에 유닛이 탈 수 있으면 매개변수로 받은 유닛을 배열에 저장
	 * - 배열이 전부 차거나, 탈 수 있는 공간이 없으면 "수송선에 공간이 부족합니다.' 출력하고 종료
	 * 
	 * - 수송선에 탄 유닛을 전부 가로로 출력 
	 */
	
	public void ride(Unit u) {
		
		if(index == unit.length - 1) {
			System.out.println("수송선에 공간이 부족합니다.");
		} else if (u instanceof Marine) {
			unit[index] = u;
			index++;
		} else if(u instanceof Tank) {
			if(index>4) {
				System.out.println("수송선에 공간이 부족합니다.");
			} else {
				for(int i=index; i<index+4; i++) {
					unit[i] = u;
				}
				index += 4;
			}
		}
		
		for(int i=0; i<index; i++) {
			
			if( i == index-1) {
				System.out.println(unit[i]);
				break;
			}
			System.out.print(unit[i]+", ");
		}
	}
}
