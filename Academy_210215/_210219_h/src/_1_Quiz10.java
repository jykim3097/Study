

import java.util.Scanner;

public class _1_Quiz10 {
	public static void main(String[] args) {
		//Day03
		Scanner scan = new Scanner(System.in);

		System.out.print("정수1> ");
		int n = scan.nextInt();
		
		System.out.print("연산을 선택하세요 [+, - , *, /]> ");
		String s = scan.next();
		
		System.out.print("정수2> ");
		int m = scan.nextInt();
		
		switch(s) {
		case "+":
			System.out.println("두 수의 덧셈은 : " + (n+m));
			break;
			
		case "-":
			System.out.println("두 수의 뺄셈은 : " + (n-m));
			break;
			
		case "*":
			System.out.println("두 수의 곱셈은 : " + (n*m));
			break;
			
		case "/":
			System.out.println("두 수의 나눗셈은 : " + ((double)n/m));
			break;
			
		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
		
		scan.close();
	}
}
