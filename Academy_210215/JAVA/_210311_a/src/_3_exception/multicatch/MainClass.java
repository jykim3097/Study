package _3_exception.multicatch;

public class MainClass {

	public static void main(String[] args) {
		
		//main에 인자값을 전달하는 방법
		//run > rusn configurations > arguments > ${string_prompt}
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			
			String str = null;
			str.charAt(0); 
			
		} catch (NumberFormatException c) {
			System.out.println("숫자를 입력하세요");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값을 2개 이상 전달하세요");
		} catch (Exception e) { // 예외의 상위 부모이기 때문에 모든 예외를 받아서 처리한다.
			System.out.println("기타 예외입니다.");
		}
		
	}
}
