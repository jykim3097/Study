package _210302_h;

public class _912_Phone {
	
	//멤버변수
	String model; //기종
	int price;
	String color;
	
	//생성자 : 생성자는 클래스 이름과 대소문자까지 동일하다.
	//반환유형이 없다.
	_912_Phone() {
		model = "아이폰xs";
		price = 1500000;
		color = "검정";
	}
	
	//생성자는 여러개 선언할 수 있다.
	//단, 매개변수의 종류, 개수가 달라야 된다.
	_912_Phone(String pColor) {
		model = "갤럭시";
		price = 1000000;
		color = pColor;
	}
	
	_912_Phone(int pPrice, String pColor){
		model = "애니콜";
		price = pPrice;
		color = pColor;
	}
	
	_912_Phone(String pModel, String pColor){
		model = pModel;
		price = 300000;
		color = pColor;
	}
	
	_912_Phone(String pModel, int pPrice, String pColor){
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	
	//메서드
	void info() {
		System.out.println("---폰의 정보---");
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
		System.out.println("색상 : " + color+"색\n");
	}
	
	
}
