
public class _2_Variable {
	public static void main(String[] args) {
		//Day01
		/*
		 * 변수의 선언 방법 : 데이터타입 이름;
		 * 
		 * int : 정수를 저장하는 대표적인 유형
		 * String : 문자열을 저장하는 유형
		 */
		
		System.out.println("-----변수(int)-----");
		
		//선언
		int num;
		
		//초기화
		num = 10;
		
		System.out.println("num = " + num);
	
		// 변수의 선언과 초기화를 한 번에
		int num2 =10;
		
		//변수의 변경
		num = 100;
		num2 = 200;
		
		//변수는 다른 변수의 값, 또는 연산의 결과를 저장
		int result = num + num2;
		
		//1. 변수명 result2, result에 10을 더해봐
		int result2 = result + 10;
		
		System.out.println("result2 = " + result2);
		
		result2 = 100;
		result2 = num;
		System.out.println("result2 = " + result2 + "\n");
		
		System.out.println("-----변수(String)-----");
		//String - 문자열 저장
		String a = "홍길동";
		
	}
}
