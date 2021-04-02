

import java.util.Scanner;

public class _6_Quiz18 {
	public static void main(String[] args) {
		//Day04
		/*
		 * 두 정수를 입력받는다, 두 수의 크기는 정해지지 않았다.
		 * 두 수 사이의 합을 구하는 프로그램을 작성하세요
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int a = scan.nextInt();
		System.out.print(">");
		int b = scan.nextInt();
		
		int max = 0, min = 0;
		
		if(a == b) {
			max = min = 0;
		} else if(a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		int sum = 0;
		for(int i= min; i<=max; i++) {
			sum +=i;
		}
		
		System.out.println(sum);
		
		//쌤 방법
		//a==b 같으면 0, a>b면 b, b>a면 a
		sum = 0;
		for(int i = (a == b ? 0 : (a>b ? b : a )); i <= (a==b? 0 : (a>b? a : b)); i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		scan.close();
	}
}
