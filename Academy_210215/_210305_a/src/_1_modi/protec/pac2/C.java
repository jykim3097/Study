package _1_modi.protec.pac2;

import _1_modi.protec.pac1.A;

public class C extends A {
//A의 생성자가 default이면 상속이 안되지만 protected이기 때문에 된다.
	
	public C() {
//		A a = new A();
//		a.bool = true;
//		a.method();
		
		//protected는 super 참조가 가능하다
		super();
		super.bool = true;
		super.method();
	}
}
