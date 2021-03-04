package _5_quiz06;

public class MainClass {
	public static void main(String[] args) {
		
		Car car = new Car("아반떼");
		car.info();
		car.run();
		
		System.out.println();
		
		Car car2 = new Car("레이");
		car2.accel(100);
		car2.info();
	}
}
