package _9_overriding.basic;

public class Child extends Parent {

	//메서드 오버라이딩 - 부모한테 물려받은 메서드에서 내용을 바꿔 사용하는 것
	//방법 - 동일한 형태로 만들어 준다.
	int method2() {
		
		System.out.println("자식에 재정의 된 2번 메서드 실행");
		return 1;
	}
	
	void method3() {
		System.out.println("자식의 3번 메서드 실행");
	}
}
