

import java.util.Scanner;

public class _6_Quiz06 {
	public static void main(String[] args) {
		/*
		 * 스캐너를 이용해서 정수 하나를 입력받고,
		 * 입력받은 정수가 음수인지 0인지 홀수인지 짝수인지 구분하는 조건문을 만드세요
		 * 음수/0/짝수/홀수
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력>");
		int n = scan.nextInt();
		
		//중첩이 안되는 게 더 낫긴 하지만, 큰 차이는 없다
		
		if(n<0) {
			System.out.println("음수입니다.");
		} else if(n==0) {
			System.out.println("0입니다.");
		} else if (n%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}	
		
		//선생님 방법 - 가독성이 더 좋은 느낌!
		//하나씩 제거한다고 생각해보세요
		if(n<0) {
			System.out.println("음수입니다.");
		} else {
			if(n==0) {
				System.out.println("0입니다.");
			} else if (n%2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
		
		scan.close();
	}
}
