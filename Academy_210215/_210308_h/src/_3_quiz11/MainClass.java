package _3_quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		Product tv = new Tv("tv", 400);
		Product radio = new Radio("radio", 500);
		Product com = new Computer("com", 600);
		
		MyCart mc = new MyCart(2000);
		mc.buy(tv);
		mc.buy(radio);
		mc.buy(com);
		mc.buy(tv);
		mc.buy(radio);
	}
}
