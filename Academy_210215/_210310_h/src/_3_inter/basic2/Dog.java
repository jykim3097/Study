package _3_inter.basic2;

public class Dog extends Animal implements IPet{

	@Override
	public void eat() { //overriding method of abstract method of abstract class Animal
		System.out.println("강아지가 사료를 먹습니다.");
	}

	@Override
	public void play() {//overriding method of interface IPet method
		System.out.println("강아지가 밖에서 놉니다.");
	}
}
