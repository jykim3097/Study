package _1_poly.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent(); // 일반적인 객체 생성
		p.method01();
		p.method02();
		
		Child c = new Child();
		c.method01(); //상속
		c.method02(); //오버라이딩
		c.method03(); //자식의 메소드
		
		System.out.println("-----------다형성-----------");
		
		Parent p1 = c; //자식 타입을 부모 타입으로 저장함으로써 사용범위를 제한한다.
		p1.method01();
		p1.method02();
		//p1.method03(); 사용불가
		
		System.out.println(c);
		System.out.println(p1);
		System.out.println("c == p1 ? " + (c == p1));
		
		System.out.println("----------클래스-----------");
		
		/*
		 * 다형성 적용 시 자식이 가지고 있던 본래 멤버들에는 접근할 수 없는 문제가 발생한다.
		 * 단, 재정의된 클래스는 가능
		 * 이 문제를 클래스 캐스팅으로 해결할 수 있다.
		 */
		
		Parent pp = new Child();
		Child cc = (Child)pp;
		
		cc.method01();
		cc.method02();
		cc.method03();
		
		/*
		 * 다형성이 일어나지 않은 객체를 대상으로 캐스팅을 실행하면 에러가 발생한다.
		 * = 다형성이 발생했던 애들만 캐스팅이 가능하다.
		 */
		
		//parent를 child로 캐스팅할 수 없다.
//		Parent p3 = new Parent();
//		Child c3 = (Child)p3; 
	}
}