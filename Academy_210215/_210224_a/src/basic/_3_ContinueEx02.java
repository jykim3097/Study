package basic;

import java.util.Scanner;

public class _3_ContinueEx02 {
	public static void main(String[] args) {
		
		//Quiz22번 코드
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력> ");
		int n = scan.nextInt();
		
		int sum =0;

		//디버깅하는 방법
		// 1. 원하는 위치에 더블 클릭
		
		es:for(int i=1; i<=n; i++) {
		
			int cnt =0; // cnt를 안에서 선언하는 것과 밖에서 선언하고 안에서 0으로 계속 초기화하는 것 중에 어떤 방법이 더 나은 것인가?
			for(int j=1; j<=i; j++) {
				if(i%j ==0) {
					cnt++;
				}
				
				//2보다 크면 셀 필요가 없으니까 그냥 나가버림 -> 속도 향상
				if(cnt > 2) continue es;
			}
			
			if(cnt == 2) {
				sum+=i;
			}
			
			//cnt = 0; 그냥 cnt 변수 선언을 안에서 하면 된다
		}
		
		System.out.println("소수들의 합 = "+sum);
	
		scan.close();
	}
}
