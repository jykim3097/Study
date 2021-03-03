package _9_overriding.basic;

public class MainClass {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method1();
		p.method2();
		
		Child c = new Child();
		c.method1(); //상속받은 메서드
		c.method2(); //오버라이딩된 메서드
		c.method3(); //자신의 메서드
		
	}
}
