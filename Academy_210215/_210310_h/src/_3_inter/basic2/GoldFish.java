package _3_inter.basic2;

public class GoldFish extends Fish implements IPet {
	
	@Override
	public void swim() { //overriding method of abstract method of abstract class Fish
		System.out.println("금붕어가 연못에서 헤엄칩니다.");	
	}

	@Override
	public void play() {//overriding method of interface IPet method
		System.out.println("금붕어가 어항에서 놉니다.");
	}
}
