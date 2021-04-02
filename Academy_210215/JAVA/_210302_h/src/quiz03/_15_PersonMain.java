package quiz03;

public class _15_PersonMain {
	public static void main(String[] args) {
		
		_14_Person p1 = new _14_Person("홍길동", 20, 180);
		p1.info();
		
		System.out.println("--------");
		
		_14_Person p2 = new _14_Person();
		p2.name = "김길동";
		p2.age = 40;
		p2.tall = 170;
		p2.info();
	}
}
