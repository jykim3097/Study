package _1_modi.constructor.pac1;

public class B {

	//멤버 변수
	A a1 = new A(1); //이렇게 만들면 무한루프 -> stack over flow
	A a2 = new A("jiyoung");
	//A a3 = new A(true); // 같은 클래스 내부에서만 사용가능하므로 에러
	
}
