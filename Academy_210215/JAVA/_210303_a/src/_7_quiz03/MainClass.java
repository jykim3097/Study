package _7_quiz03;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * player클래스 부모클래스로 생성 (공통 기능을 갖도록 처리)
		 * 마법사, 전사는 player를 상속받고
		 * 각각의 생성자도 만들어라
		 * 마법사와 전사의 객체 생성
		 */
		
		Warrior w = new Warrior("지영123");
		w.hp = 100;
		w.mp = 170;
		w.attack = 50;
		w.armor = 50;
		w.info();
		w.bash();
		
		System.out.println();
		
		Wizard wi = new Wizard("길동길동");
		wi.hp = 100;
		wi.mp = 150;
		wi.attack = 40;
		wi.armor = 100;
		wi.info();
		wi.bash();
	}
}
