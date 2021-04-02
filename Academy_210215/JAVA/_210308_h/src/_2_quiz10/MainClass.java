package _2_quiz10;

public class MainClass {
	public static void main(String[] args) {
		
		Warrior me = new Warrior("강한친구대한전사");
		
		Wizard play2 = new Wizard("구르미그린마법사");
		Warrior play3 = new Warrior("전사약해요");
		
		System.out.println("---나의 캐릭 배쉬스킬 사용---");
		
		me.bash(play2); //강한친구대한전사 bash 스킬 사용(play2 적중)
		me.bash(play3); //강한친구대한전사 bash 스킬 사용(play3 적중)

		me.bash(play2); //강한친구대한전사 bash 스킬 사용(play2 적중)
		me.bash(play3); //강한친구대한전사 bash 스킬 사용(play3 적중)
		
		play2.info();
		play3.info();
		System.out.println();
		
		Player[] pArr = {me, play3};
		play2.blizzard(pArr);

		System.out.println();
		me.info();
		play2.info();
		play3.info();
	}
}
