package _3_inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.method1();
		b.method2();
		b.method3();
		System.out.println(b.PI);
		System.out.println(b.ABC);
		
		System.out.println("----------------------");
		/*
		 * 인터페이스도 하나의 타입이 될 수 있다.
		 * 인터페이스에 객체를 저장했을 때, 다형성이 적용된다.
		 */
		
		//b가 인터페이스1처럼 사용이 된다.
		Inter1 i1 = b; //Inter1 i1 = new Basic();
		i1.method1();
		
		Inter2 i2 = b;
		i2.method2(); 
	
		System.out.println("---------------------");
		
		// 인터페이스도 클래스 캐스팅을 사용할 수 있다.
		// 나로 저장이 됐던 것만 캐스팅이 될 수 있다.
		Basic bb = (Basic) i1;
		bb.method1();
		bb.method2();
		bb.method3();
	}
}
