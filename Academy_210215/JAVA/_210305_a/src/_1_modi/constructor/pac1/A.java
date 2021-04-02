package _1_modi.constructor.pac1;

public class A {
	
	//멤버 변수
	A a1 = new A(1); //이렇게 만들면 무한루프 -> stack over flow
	A a2 = new A("jiyoung");
	A a3 = new A(true);

	//생성자
	public A(int i) {}
	A(String s) {}
	private A(boolean b) {} // private : 같은 클래스 안에서만 사용 가능
	//private 생성자는 외부에서 객체를 생성할 수 없다.
}
