package _1_modi.member.pac2;

import _1_modi.member.pac1.A;

public class C {

	//생성자
		public C() {
			A a = new A();
			a.var1 = 1;
			//a.var2 = 2; //패키지 벗어나서 default도 불가
			//a.var3 = 2; //private가 외부에 있어서 에러
			
			a.method01();
			//a.method02();
			//a.method03(); //private x
		}
}
