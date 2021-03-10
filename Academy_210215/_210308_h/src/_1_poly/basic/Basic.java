package _1_poly.basic;

class A {}
class B extends A{}
class C extends A{}
class D extends B {}
class E extends C {}

public class Basic {
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	//기본 타입에서
	int x = 10;
	double y = x; // int -> double 자동형변환
	
	//참조타입에서
	A a1 = b;
	A a2 = c;
	A a3 = new D();
	A a4 = new E();
	
	//상속 관계가 없다면 다형성 적용 불가능
	//C c1 = new D();
	
	//모든 클래스는 object의 자식클래스이기 때문에 object형에는 모든 타입을 저장할 수 있다.
	Object o = a;
	Object o2 = "문자열";
	Object o3 = 1;
	Object o4 = new B();
}
