package basic;

import java.util.Scanner;

public class _4_RandomSeat_assignment {
	public static void main(String[] args) {
		
		/*
		 * 1. 사람수를 입력받는다.
		 * 2. 입력 받은 사람 수 만큼 랜덤값을 생성해서 배열에 절대 중복되지 않게 저장한다. - 중복검사 *
		 * 3. 해당 배열의 크기만큼 ○로 출력한다.
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있다.
		 * 5. 제대로 선택된 좌석이라면 자리 번호를 공개하고, 
		 * 	     제대로 선택되지 않은 자리라면 출력문을 띄우고 다시 선택하도록한다.
		 * 
		 * 6. 그리고 선택된 자리는 ●로 다시 표시
		 */
		
		//System.out.printf("%3s", "○");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("배정할 좌석의 크기를 지정하세요> ");
		int n = scan.nextInt(); // 사람 수
		
		
		int[] r = new int[n];
		for(int i=0; i<r.length; i++) {
			r[i] = (int)(Math.random()*n)+1;
			
			//중복된 index 값 제거
			for(int j=0; j<i; j++) {
				if(r[i] == r[j]) {
					i--;
				}
			}
		}
		
		String[] s = new String[n];
		for(int i=0; i<s.length; i++) {
			s[i] = "○";
		}
		
		int a=0;
		while(true) {
			System.out.println("----------좌석 선택 프로그램----------");
			for(int i=1; i<=n; i++) {
				System.out.printf("%-3s", i);
			}
			System.out.println();
			for(int i=0; i<n; i++) {
				System.out.printf("%-3s", s[i]);
			}
			
			System.out.println();
			
			if(a==n) {
				System.out.println("배정이 완료되었습니다.");
				break;
			}
			
			System.out.print("좌석 선택> ");
			int m = scan.nextInt();
			
			if(s[m-1] == "○") {
				s[m-1] = "●";
				System.out.println("자리 번호는 : "+r[m-1]);
			} else {
				System.out.println("다른 번호를 선택해주세요.");
				a--;
			}
			System.out.println();
			a++;
		}

		scan.close();
	}
}
