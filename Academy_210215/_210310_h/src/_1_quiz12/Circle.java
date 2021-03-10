package _1_quiz12;

public class Circle extends Shape {

	/*
	 * 1. 생성될 때 이름과 변의 길이(반지름)을 받도록 처리
	 * 2. getArea()는 원의 넓이를 구하도록 오버라이딩
	 * 3. main에서 생성해서 도형이름을 확인
	 * 4. PI는 상수형태로 선언
	 */
	
	private int radius;
	
	public Circle(String name, int radius){
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return PI * radius * radius;
	}
	
}
