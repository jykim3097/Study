

import java.util.Scanner;

public class _5_Quiz12 {
	public static void main(String[] args) {
		//Day03
		Scanner scan = new Scanner(System.in);
	
		//1. 1~입력받은 수까지 3의 배수이거나, 4의 배수일 경우에 가로로 출력
		
		System.out.print("입력> ");
		int n1 = scan.nextInt();
		
		System.out.print("1. ");
		
		int i = 1;
		while( i <= n1 ) {
			
			if( i % 3 == 0 || i % 4 == 0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
		//2. 1~입력받은 수까지의 6의 배수의 합계
		
		System.out.print("\n입력> ");
		int n2 = scan.nextInt();
		System.out.print("2. ");
		
		int k = 1;
		int sum = 0;
		while( k <= n2 ) {
			if( k % 6 == 0) {
				sum += k;
			}
			k++;
		}
		System.out.println(sum);
		
		//3. 1~1000까지의 정수 중에서 4의 배수이면서 8의 배수가 아닌 수의 개수
		
		int j = 1;
		int cnt = 0;
		while( j <= 1000 ) {
			if( j % 4 == 0 && j % 8 != 0) {
				cnt++;
			}
			j++;
		}

		System.out.println("3. "+cnt);
		
		//4. 1000의 약수의 개수 - 내 방식
		System.out.print("4. ");
		int l = 1000;
		int cnt4 = 0;
		while (l>0) {
			l = l / 10;
			cnt4++;
		}
		System.out.println(cnt4*cnt4 + "개");
		
		//4-1. 1000의 약수의 개수 - 선생님
		int m = 10; //변수화해놓는 게 수정하기 좋다.
		
		int n4 = 1;		
		int cnt41 = 0;
		
		while(n4 <= m) {
			if(m % n4 == 0) {
				cnt41++;
			}
			n4++;
		}
		System.out.println("4-1. "+cnt41 + "개");
		 
		//4-2. 약수의 합을 구해라
		//m=4, 1+2+5+10=18
		int sum4 = 0;
		n4 = 1;
		
		while(n4 <= m) {
			if(m%n4 == 0) {
				sum4 +=n4;
			}
			n4++;
		}
		System.out.println("4-2. "+sum4);
		scan.close();
	}
}
