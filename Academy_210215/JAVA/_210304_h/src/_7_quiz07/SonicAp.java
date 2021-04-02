package _7_quiz07;

public class SonicAp extends Airplane {

	/*
	 * 조건 - 부모클래스는 수정하지 않습니다.
	 * 
	 * 1. flyMode 라는 int형 멤버변수를 선언하세요
	 * 2. 생성자는 name을 저장할 수 있도록 처리하세요.
	 * 3. fly() 메서드를 오버라이딩 합니다.
	 * 	    기능 - flyMode가 1이라면 "고속모드로 비행합니다"
	 * 		    flyMode가 0이라면 super를 통해 부모님의 메서드를 호출시키세요
	 * 
	 */

	int flyMode;
	
	SonicAp(String name) {
		super(name);
	}
	
	void fly() {
		if(flyMode == 1) {
			System.out.println("고속모드로 비행합니다.");
		} else if (flyMode == 0) {
			super.fly();
		}
	}
}
