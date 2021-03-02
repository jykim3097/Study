package _210302_h;

public class _8_Variable {

	//멤버변수 : 초기화하지 않으면 기본값으로 자동 초기화
	int a;
	
	void printNumber(int c) {
		int b=1;
		
		System.out.println("멤버변수: " + a);
		System.out.println("지역변수: " + b); //지역변수는 초기화하지 않으면 사용할 수 없다.
		System.out.println("매개변수: " + c);
	}
}
