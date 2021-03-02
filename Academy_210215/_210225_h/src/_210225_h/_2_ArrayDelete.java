package _210225_h;

import java.util.Arrays;
import java.util.Scanner;

public class _2_ArrayDelete {
	public static void main(String[] args) {
		
		//배열의 삭제 - 5번째 인덱스를 지운다.
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=5; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		System.out.println(Arrays.toString(arr));
		
		//문자열 배열
		Scanner scan = new Scanner(System.in);
		String[] arr2 = {"강타", "토니안", "문희준", "장우혁", "이재원"};
		
		System.out.print("삭제할 이름> ");
		String name = scan.next();
		
		int count = arr2.length; //배열의 길이로 사용
		boolean chk = true;
		
		for(int i=0; i< count; i++) {
			if(name.equals(arr2[i])) {
				for(int j = i; j < count-1; j++) {
					arr2[j] = arr2[j+1];				
				}
				count--;
				chk = true;
			}
		}
		
		if(chk) {
			for(int i=0; i<count; i++) {
				System.out.print(arr2[i]);
				if(i == count-1) break;
				else {
					System.out.print(", ");
				}
			}
		} else {
			System.out.println("찾는 이름이 없습니다.");
		}
		
		scan.close();
	}
}
