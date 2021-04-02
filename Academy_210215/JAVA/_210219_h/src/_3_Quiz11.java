

import java.util.Scanner;

public class _3_Quiz11 {
	public static void main(String[] args) {
		//Day03
//		int a= 1;
//		
//		while(a<16) {
//			System.out.println(a+"번 학생의 출석을 체크");
//			a++;
//		}
		
		//구구단수를 입력받아서, 입력받은 단수의 구구단 출력하세요
		
		int a = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇 단을 출력하시겠습니까?> ");
		int n = scan.nextInt();
		System.out.println("구구단 : "+n+"단");
		
		while(a<10) {
			//System.out.println(n+" X "+a+" = "+ (n*a));
			System.out.printf("%d X %d = %d\n", n, a, (n*a));
			a++;
		}
		
		scan.close();
	}
}
