package _2_static_.basic;

public class Calculator {

	/*
	 * 계산기마다 색깔이나 결과값은 다르기 때문에 일반 멤버변수로 선언한다.
	 * 반면에, 계산기마다 원주율은 동일하기 때문에 static으로 선언하는 게 좋다.
	 * 
	 */
	
	private int result;
	private String color;
	
	public static double pi = 3.14;
	
	/*
	 * 일반 멤버변수를 참조하고 있는 메서드는 static으로 선언하면 안된다.
	 */

	public int getResult() {
		return result;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	//result에 누적하는 add()
	public void add(int a) {
		result += a;
	}
	
	/*
	 * 메서드 내부에서 일반 멤버 변수를 쓰지 않고,
	 * 범용성 있게 사용하는 메서드는 static 키워드르쓰는 편이 좋다.
	 * 
	 */
	
	//static으로 만들면 객체랑 상관없이 효율적으로 빨리빨리 사용할 수 있다.
	public static double areaCircle(int r) {
		return pi * r * r;
	}
	
	public static double areaRect(int side) {
		return side*side;
	}
}
