package _1_quiz12;

public abstract class Shape {

	private String name;
	public static final double PI = 3.14;
	
	public Shape(String name) {
		this.name = name;
	}
	
	//자식클래스에서 꼭 오버라이딩 해줘야함
	//도형의 넓이를 구하는 추상 메서드
	public abstract double getArea();
	
	//name을 가져갈 수 있는 일반 메서드
	public String getName() {
		return name;
	}
}
