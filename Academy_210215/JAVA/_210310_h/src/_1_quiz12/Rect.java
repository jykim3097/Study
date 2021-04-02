package _1_quiz12;

public class Rect extends Shape {

	private int side;

	public Rect(String name, int side) {
		super("정사각형");
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}
	
	public String getName() {
		return "(일반 메서드 오버라이딩) " + super.getName();
	}
}
