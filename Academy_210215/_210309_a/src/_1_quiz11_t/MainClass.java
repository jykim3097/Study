package _1_quiz11_t;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart mc = new MyCart(2000);

		mc.buy(new Tv());
		mc.buy(new Computer());
		mc.buy(new Radio());
	}
}
