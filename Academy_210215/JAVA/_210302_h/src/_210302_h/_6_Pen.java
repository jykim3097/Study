package _210302_h;

//설계용 클래스(라이브러리 클래스)는 메인이 없습니다.
public class _6_Pen {
	
	//클래스 안에 속성을 나타내는 것을 멤버변수(필드)라고 부른다.
	String ink;
	int price;
	String company;
	
	//클래스 안에 기능을 나타내는 것을 메서드라고 표현한다.
	void write() {
		System.out.println(ink + "색 펜으로 글씨를 씁니다.");
	}
	
	void info() {
		System.out.println("===펜의 정보===");
		System.out.println("색상: "+ ink+ "색");
		System.out.println("가격: " + price);
		System.out.println("제조사: " + company);
	}
}
