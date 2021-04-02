package _5_abs.bad;

public class MainClass {
	
	//재정의를 실수로 만들지 않으면
	//잘못된 메서드의 실행결과로 이어질 수도 있다.
	
	public static void main(String[] args) {
		
		Store1 s = new Store1();
		s.apple();
		s.grape();
		s.orange();
		
		
	}
}
