package _2_quiz10;

public class Wizard extends Player {

	Wizard(String id){
		this.id = id;
		hp = 500;
		mp = 1000;
		attack = 20;
		armor = 5;
	}
	
	//마법사의 고유한 skill
	void iceArrow() {
		System.out.println("얼음화살 사용");
	}

	//2. 블리자드 스킬은 매개변수로 플레이어 배열을 받습니다.
	/*
	 * 광범위하게 공격할 수 있는 기능
	 * 
	 * 매개변수 players 배열을 향상된 for문으로 회전
	 * for문 안에서는 10~15 사이의 랜덤 수를 발생
	 * players 배열의 hp를 각각 랜덤수만큼 감소시킨다.
	 * player 배열의 이름과 함께 랜덤 피해를 각각 출력하면 된다.
	 */
	
	//4. player 배열의 이름과 함께 랜덤 피해를 각각 출력하세요
	void blizzard(Player[] pArr) {
		
		System.out.println(this.id + "님의 눈보라 스킬 사용!");
		
		for(Player p : pArr) {
			mp -= attack/5;
			int n = (int)(Math.random()*6)+10;
			
			if(p instanceof Warrior) {
				p.hp -= n*100/armor;
				System.out.println(p.id + "님 " + n*100/armor + " 감소!");				
			} else if (p instanceof Wizard) {
				p.hp -= n*100/armor;
				System.out.println(p.id + "님 " + n*100/armor + " 감소!");				
			}
		}
	}
	
}
