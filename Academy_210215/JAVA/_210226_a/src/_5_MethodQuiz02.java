import java.util.Scanner;

public class _5_MethodQuiz02 {
	public static void main(String[] args) {
		
		//print()
		System.out.println("정수 두 개를 입력하세요");
		
		//input() 2번 호출
		Scanner scan = new Scanner(System.in);
		System.out.print("정수> ");
		int num1 = scan.nextInt();
		System.out.print("정수> ");
		int num2 = scan.nextInt();
		
		//add() 결과를 반환
		int result = num1 + num2;
		
		//result() - 결과값을 출력
		System.out.println("두 수의 합: " + result);	
		
		System.out.println("--------------------");
		
		print();
		
		int n1 = input();
		int n2 = input();
		
		int result1 = add(n1, n2);
		
		result(result1);
	}
	
	static void print() {
		System.out.println("정수 두 개를 입력하세요");
	}
	
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수> ");
		return sc.nextInt();
	}
	
	static int add(int num1, int num2) {
		return num1+num2;
	}
	
	static void result(int r) {
		System.out.print("두수의 합 : "+r);
	}
	
}
