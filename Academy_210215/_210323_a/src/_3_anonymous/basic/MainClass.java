package _3_anonymous.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Garage g = new Garage();
		g.car.run();
		
		Car car2 = new Car() {
			
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		
		car2.run();
	}
}
