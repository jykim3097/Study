package _1_overloading.basic;

public class MainClass {
	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.input(1);
		b.input(1, 3.14);
		b.input('a',1,3.14);
		b.input(2.14, 19);

	}
}
