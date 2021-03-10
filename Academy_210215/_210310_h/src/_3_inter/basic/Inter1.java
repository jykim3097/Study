package _3_inter.basic;

public interface Inter1 {

	//상수와 추상메서드를 정의한다.
	double PI = 3.14;//인터페이스 변수를 선언하면 자동으로 상수로 선언된다.
	
	public void method1(); //인터페이스에 메서드를 선언하면 자동으로 추상 메서드가 된다.
	
	//interface의 static 메소드
	public static void test() {
		//static 메소드여서 생성이 가능한건가...
	}
}
