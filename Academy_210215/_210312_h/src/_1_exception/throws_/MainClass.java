package _1_exception.throws_;

public class MainClass {

	public static void main(String[] args) {
		
		//메인도 throws로 예외를 넘길 수 있다.
		
		try {
			ThrowsEx02 ex = new ThrowsEx02();
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
		
	}
}
