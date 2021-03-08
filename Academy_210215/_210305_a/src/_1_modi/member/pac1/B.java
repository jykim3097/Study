package _1_modi.member.pac1;

public class B {

	//생성자
	public B() {
		A a = new A();
		a.var1 = 1;
		a.var2 = 2;
		//a.var3 = 2; //private가 외부에 있어서 에러, 같은 클래스
		
		a.method01();
		a.method02();
		//a.method03(); //private x
	}
}
