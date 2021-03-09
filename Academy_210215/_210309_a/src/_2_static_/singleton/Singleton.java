package _2_static_.singleton;

public class Singleton {

	// 싱글톤패턴 - 클래스가 여러번 호출되더라도 객체를 1개만 생서하도록 디자인하는 방법
	
	//1. 접근제한자를 private으로 선언하고 스스로 객체를 단 1개 생성.
	private static Singleton instance = new Singleton(); // 내 안에 내가 있는 멤버변수

	//2. 접근제한자를 이용해 외부에서 객체 생성을 못하게 생성자를 private 처리
	private Singleton() {
		
	}
	
	//3. 외부에서 객체를 요구할 경우 1번에서 만들어둔 단 한개의 객체를 반환
	public static Singleton getInstatnce() {
		return instance;
	}
	
	//멤버변수 or 메서드
	private String s = "홍길동";
	
	public String getS() {
		return s;
	}
	
	public void setS(String s ){
		this.s = s;
	}
}
 