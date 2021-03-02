
package basic;

import java.util.Scanner;

public class _5_ArrayInsert {
	public static void main(String[] args) {
		//Day05
		
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100];
		
		System.out.println("# 먹고 싶은 음식을 입력하세요.");
		System.out.println("# 중지하려면 [그만] 이라고 입력하세요.");
		
		int index = 0; //입력받은 개수 (or 배열의 위치)
		while(true) {
			System.out.print(">");
			String menu = scan.next();
			
			if (menu.equals("그만")) {
				System.out.println("입력 종료!");
				break;
			}
			
			arr[index] = menu;
			index++;
		}
		
		//배열의 요소 출력
		System.out.print("내가 먹고 싶은 음식들 : [");
		for(int i=0; i<index; i++) {
			System.out.print(arr[i]);
			
			if(i == index-1) break;
			System.out.print(", ");
		}
		System.out.print("]");
		
		scan.close();
	}
}
