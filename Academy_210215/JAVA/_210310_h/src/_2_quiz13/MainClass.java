package _2_quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Unit m = new Marine();
		Unit t = new Tank();
		Dropship d = new Dropship();
		
		System.out.println("마린과 탱크 이동");
		m.move(3, 3);
		t.move(4, 4);
		System.out.println();
		
		System.out.println("드롭쉽에 마린과 탱크 적재");
		d.ride(m);
		d.ride(t);
		System.out.println();
		
		System.out.println("현재 위치 출력");
		m.hold();
		t.hold();
		d.hold();
		System.out.println();
		
		System.out.println("드롭쉽 이동");
		d.move(5, 5);
		d.hold();
		System.out.println();
		
		System.out.println("현재 위치 출력");
		m.hold();
		t.hold();
		d.hold();
		System.out.println();
		
		System.out.println("마린과 탱크 이동");
		m.move(3, 3);
		t.move(4, 4);
		System.out.println();
		
		System.out.println("현재 위치 출력");
		m.hold();
		t.hold();
		d.hold();
		System.out.println();
	}
}
