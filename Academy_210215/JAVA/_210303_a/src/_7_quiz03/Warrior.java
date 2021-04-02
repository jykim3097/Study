package _7_quiz03;

public class Warrior extends Player {
	
	Warrior(String pId){
		id = pId;
	}
	
	//전사의 고유한 skill
	void bash() {
		System.out.println("전사 스킬 사용");
	}
}
