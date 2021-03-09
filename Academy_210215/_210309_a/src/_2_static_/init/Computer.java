package _2_static_.init;

public class Computer {

	//model과 company는 다 똑같아짐
	static String model;
	static String company;
	int price = 10000000;
	
	Computer() {
		//static 변수를 넣을 순 있으나 실행이 안되기 때문에 문제가 생길 수 있다.
		System.out.println("일반 생성자가 호출됨");
	}
	
	//특징 - 클래스가 호출될 때 *단 한 번* 실행될(static 변수의 초기화)
	static {
		System.out.println("static 초기화자가 실행됨");
		model = "gram";
		company = "LG";
	}
}
