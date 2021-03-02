package basic;

import java.util.Arrays;
import java.util.Scanner;

public class _4_RandomSeat_t {
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
		
		Scanner scan = new Scanner(System.in);
		System.out.print("배정할 좌석의 크기를 지정하세요> ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		int index = 0;
		
		start:while(true) {
			int seat = (int)(Math.random()*size)+1;
			
			for(int i=0; i<index; i++) {
				if(arr[i] == seat) continue start;
			}
			
			arr[index] = seat;
			index++;
			
			if(index == size) break;
		}
		System.out.println(Arrays.toString(arr));
		
		int cnt = 0;
		while(true) {
			System.out.println("--------------------좌석 선택 프로그램--------------------");
			
			for(int i=0; i< arr.length; i++) {
				System.out.printf("%-3d", i+1);
			}
			System.out.println();
			for(int i=0; i< arr.length; i++) {
				
				if(arr[i] == -1) {
					System.out.printf("%-3s","●");
				} else {
					System.out.printf("%-3s", "○");					
				}
			}
			System.out.println();
			
			if(cnt == arr.length) {
				System.out.println("\n배정이 완료되었습니다.");
				break;
			}
			
			System.out.print("좌석선택> ");
			int select = scan.nextInt();
			
			if(arr[select-1] == -1) {
				System.out.println("다른 번호를 입력해주세요");
				cnt--;
			} else {				
				System.out.println("자리번호> "+arr[select-1]);
			}
			
			
			arr[select-1] = -1;
			
			cnt++;
		}
	}
}
