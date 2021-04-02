import java.util.Scanner;

public class _3_Quiz22_assignment {
	public static void main(String[] args) {
		//Day04
		//과제
		//소수의 판 별 - 나누어 떨어지는 수가 1과 자기자신 2개인 수
		//정수를 입력 받는다, 
		//그리고 그 수까지의 소수들의 합계
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력> ");
		int n = scan.nextInt();
		
		System.out.print(n+"까지 소수인 수 : ");
		
		int sum =0;

		//디버깅하는 방법
		// 1. 원하는 위치에 더블 클릭
		
		for(int i=1; i<=n; i++) {
		
			int cnt =0; // cnt를 안에서 선언하는 것과 밖에서 선언하고 안에서 0으로 계속 초기화하는 것 중에 어떤 방법이 더 나은 것인가?
			for(int j=1; j<=i; j++) {
				if(i%j ==0) {
					cnt++;
				}
			}
			
			if(cnt == 2) {
				System.out.print(i+" ");
				sum+=i;
			}
			
			//cnt = 0; 그냥 cnt 변수 선언을 안에서 하면 된다
		}
		
		System.out.println("\n소수들의 합 = "+sum);
	
		scan.close();
	}
}
