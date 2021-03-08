package _2_quiz10;

public class Warrior extends Player {
	
	Warrior(String id){
		this.id = id;
		hp = 1000;
		mp = 500;
		attack = 10;
		armor = 10;
	}
	
	//전사의 고유한 skill
	void bash(Player p) {
		
		if(this.mp <= 100) {
			System.out.println("mp가 부족합니다.");
			return; //메서드 종료
		} else {
			this.mp -= 100;
			
			System.out.println(p.id +"님에 적중했습니다.\n");
		}
		
		if(p instanceof Warrior) {
			p.hp -= 100;
		} else if ( p instanceof Wizard) {
			p.hp -= 200;
		}
	}
}
