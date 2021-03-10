package _3_inter.basic2;

public class Cat extends Animal implements IPet {
	
	@Override
	public void eat() { //overriding method of abstract method of abstract class Animal
		System.out.println("고양이가 생선을 먹습니다.");
	}

	@Override
	public void play() { //overriding method of interface IPet method
		System.out.println("고양이가 방에서 놉니다.");
	}
}
