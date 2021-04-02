package _4_quiz15;

import java.util.Scanner;

public class MainClass02 {

	public static void main(String[] args) {
		
		//updown!
		
		Scanner scan = new Scanner(System.in);
		
		int num = (int)(Math.random()*100)+1;
		int cnt = 0;
		
		while(true) {
			
			cnt++;
			try {				
				System.out.print("1과 100 사이의 값을 입력하세요>");
				int a = Integer.parseInt(scan.nextLine());
				
				if(num == a) {
					System.out.println("정답입니다!");
					System.out.println("시도 횟수 : " + cnt);
					break;
				} else if (num < a) {
					System.out.println("더 작은 수를 입력하세요");
				} else {
					System.out.println("더 큰 수를 입력하세요");
				}
				
			} catch(Exception e) {
				System.out.println("잘못 입력했습니다.");
			}
			
			
			
		}
	}
}
