package _7_quiz03;

public class Wizard extends Player {

	Wizard(String pId){
		id = pId;
	}
	
	//전사의 고유한 skill
	void bash() {
		System.out.println("마법사 전용 스킬");
	}

}
