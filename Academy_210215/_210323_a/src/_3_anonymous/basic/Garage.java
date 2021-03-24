package _3_anonymous.basic;

interface Car {
	void run();
}

//이거 전체를 익명객체로 만든다
/*
class Tico implements Car {

	@Override
	public void run() {
		System.out.println("run");
	}
}
*/

public class Garage {

	// 멤버변수
	public Car car = new Car() {
		
		@Override
		public void run() {
			System.out.println("사용할 때마다 내용이 바뀌면 익명클래스로 생성 가능");
		}
	};
}
