package _1_exception.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메서드, 생성자에서 발생되는 예외를 직접 떠넘기는 키워드가 throws입니다.
		 * throws 구문이 붙어 있는 메서드, 생성자를 호출할 때 예외 처리를 대신 진행한다.
		 * 
		 * 즉, 예외 처리를 강요할 때 사용한다.
		 */
		
		try {
			greeting(0);
			//greeting(5);
			greeting(2); //실행 안 됨

			calc(0);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch (Exception e) {
			System.out.println("배열의 참조 범위를 벗어났습니다");
		}
		
		//대표적인 throws 처리된 메서드
		try {			
			Class.forName("$f$#");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 정확히 입력하세요");
		}
		
		//대표적인 throws 처리된 생성자
		try {
			new FileInputStream("@$#");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 위치를 정확히 입력하세요");
		}
		
	} //end main
	
	//static은 static끼리 사용 가능
	private static String[] arr = {"hello", "안녕", "니하오","오하요"};
	
	public static void greeting(int index) throws Exception {
		
		System.out.println(arr[index]);
	}
	
	public static void calc(int num) throws ArithmeticException {
		System.out.println(10/ num);
	}
	
}
