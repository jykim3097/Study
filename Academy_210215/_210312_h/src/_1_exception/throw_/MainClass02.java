package _1_exception.throw_;

import java.util.Scanner;

public class MainClass02 {

	public static void main(String[] args) {
		
		/*
		 * 처리할 작업
		 * 1. 입력한 값이 숫자가 아니라면 "반드시 숫자만 입력하세요"를 출력한 뒤에 다시 입력 받도록 처리 (count 증가x)
		 * 2. 입력한 값이 1에서 100까지의 값이 아니라면 예외처리구문으로 이동하고 다시 입력 받도록 처리 (count 증가)
		 */
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		int cnt = 0;
		
		while(true) {
			
			try {				
				System.out.print("1과 100 사이의 값을 입력하세요>");
				int a = Integer.parseInt(scan.nextLine());
				
				if(a<1 || a>100) {
					throw new Exception("1~100 사이의 값을 입력하세요");
				}
				
				if(num == a) {
					cnt++;
					System.out.println("정답입니다!");
					System.out.println("시도 횟수 : " + cnt);
					break;
				} else if (num < a) {
					System.out.println("더 작은 수를 입력하세요");
				} else {
					System.out.println("더 큰 수를 입력하세요");
				}
				cnt++;
				
			} catch(NumberFormatException e) {
				System.out.println("반드시 숫자만 입력하세요");
			} catch(Exception e) {
				cnt++;
				System.out.println(e.getMessage());
			}
			
			
			
		}
	}
}
