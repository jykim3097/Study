package _5_abs.good;

public class Store1 extends ParentStore {

	/*
	 * 추상클래스를 상속받을 때 자식은
	 * 1. 자식클래스도 abstract
	 * 2. 오버라이딩 - 보통 많이 쓴다
	 */
	
	//생성자를 통해 추상 클래스의 객체 생성
	Store1(){
		super();
	}

	//추상메서드는 무조건 오버라이딩해서 쓰게 되어있음
	@Override
	public void apple() {
		System.out.println("서울 지점의 사과는 500원");
	}

	@Override
	public void grape() {
		System.out.println("서울 지점의 포도는 600원");
	}

	@Override
	public void orange() {
		System.out.println("서울 지점의 오렌지는 700원");
	}
}