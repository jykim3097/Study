package _1_modi.constructor.pac2;

import _1_modi.constructor.pac1.A;

public class C {

	//멤버 변수
	A a1 = new A(1); //이렇게 만들면 무한루프 -> stackOverFlow
	//A a2 = new A("jiyoung"); //default 다른 패키지라 안됨
	//A a3 = new A(true); //private 다른 패키지라 안됨
}
