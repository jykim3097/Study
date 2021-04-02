

import java.util.Scanner;

public class _8_Quiz13 {
	public static void main(String[] args) {
		//Day03
		/*
		 * 사용자가 0을 입력할 때까지 값을 입력 받는다.
		 * 0을 입력하면 그 전까지 입력한 값들의 합을 출력하고, 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.print("정수 입력> ");
			int num = scan.nextInt();
			if(num == 0) {
				break;
			}
			sum += num;
		}
		
		System.out.println(sum);
		
		//선생님 풀이
		sum =0;
		int i=1;
		while(i != 0) { //0일 때 false
			System.out.print("정수 입력> ");
			i = scan.nextInt();
			
			sum += i;
		}
		System.out.println(sum);
		scan.close();
	}
}
