package _5_abs.good;

public abstract class ParentStore {
	
	/*
	 * 1. 메서드에 abstract 키워드를 붙이면 추상메서드가 된다.
	 *    (이 메서드는 상속을 통해서 반드시 오버라이딩이 되어야 한다.)
	 * 2. 추상메서드는 {}가 없는 메서드의 선언이다.
	 * 3. 추상메서드는 일반 클래스에서 선언할 수 없다.
	 *    (추상메서드를 사용하려면 클래스도 추상클래스가 되어야 한다.)
	 * 4. 추상클래스에는 일반메서드, 일반멤버변수, 생성자 모두 사용할 수 있다.
	 */
	
	//멤버 변수
	private String storeName = "호식이 세마리 치킨";
	
	//생성자
	public ParentStore(){
		System.out.println("추상클래스의 생성자 호출");
	}
	
	//일반메서드
	public String getStoreName() {
		return storeName;
	}
	
	//추상메서드
	public abstract void apple();
	public abstract void grape();
	public abstract void orange();
	
	//final 메소드는 오버라이딩이 안되니까 부모 거를 그대로 쓰면 된다.
	public final void mango() { //오버라이딩 금지
		System.out.println("망고는 전 지점 1000원입니다.");
	}
}
