package _2_quiz10;

public class Player {

	String id;
	int hp; //체력
	int mp; //마나
	int attack; //공격력
	int armor; //방어력
	
	void info() {
		System.out.println("캐릭터명: "+id);
		System.out.println("체력: " + hp);
		System.out.println("마나 : " + mp);
//		System.out.println("공격력 : " + attack + ", 방어력 : "+ armor );
	}
}
