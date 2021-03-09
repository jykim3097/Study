package _5_abs.good;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1. 추상메서드를 사용하면 오버라이딩이 강제화되기 때문에  프로그래머의 (오버라이딩) 실수를 줄일 수 있다.
		 * 2. 부모클래스를 사용하고 싶다면 자식클래스로 구체화시켜야합니다. 라고 책에 나온다.
		 * 
		 */
		
		Store1 s1 = new Store1();
		System.out.println(s1.getStoreName());
		s1.apple();
		s1.grape();
		s1.orange();
		s1.mango();
		
		System.out.println();
		
		Store2 s2 = new Store2();
		System.out.println(s2.getStoreName());
		s2.apple();
		s2.grape();
		s2.orange();
		s2.mango();
		
		System.out.println();
		
		//추상메서드를 사용하면 무조건 다 오버라이딩을 쓰게 되니까 똑같은 결과가 나타난다.
		ParentStore p = new Store1();
		System.out.println(p.getStoreName());
		p.apple();
		p.grape();
		p.orange();
		p.mango();
	}
}
