package _2_quiz13;

public abstract class Unit {

	public int x, y; //좌표값
	public int hp; //체력
	
	public Unit(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
	
	//움직이는 기능
	//자식에서 '무조건' 오버라이딩 해야함
	public abstract void hold(); //위치정보를 확인
	public abstract void move(int x, int y); //이동 기능
	
	public void stop() {
		System.out.print("stop! ");
	}
}
