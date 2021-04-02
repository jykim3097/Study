package _210225_h;

import java.util.Arrays;
import java.util.Scanner;

public class _1_ArrayUpdate {
	public static void main(String[] args) {
		
		//배열의 수정
		String[] arr = {"강타", "토니안", "문희준", "장우혁", "이재원"};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 이름> ");
		String name = scan.next();
		
		boolean chk = false;
		for(int i=0; i<arr.length; i++) {
			if(name.equals(arr[i])) {
				System.out.println(arr[i] + "학생 이름을 수정합니다.");
				System.out.print("수정할 이름> ");
				arr[i] = scan.next();
				chk = true;
			}
		}
		
		//수정 결과
		//if(chk == true) {
		if(chk) { //이것 자체 의미가 'chk가 true이면'이 된다.
			System.out.println("수정되었습니다.");
		}else {
			System.out.println("수정되지 않았습니다.");
		}
		System.out.println(Arrays.toString(arr));
		
		scan.close();
	}
}
