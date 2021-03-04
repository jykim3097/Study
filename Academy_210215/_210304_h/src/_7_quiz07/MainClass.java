package _7_quiz07;

public class MainClass {

	public static void main(String[] args) {
		
		SonicAp sa = new SonicAp("아시아나");
		sa.flyMode = 1;
		sa.takeOff();
		sa.fly();
		sa.flyMode = 0;
		sa.fly();
		sa.land();
	}
}
