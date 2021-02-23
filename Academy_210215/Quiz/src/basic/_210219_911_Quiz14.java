package basic;

import java.util.Arrays;
import java.util.Scanner;

public class _210219_911_Quiz14 {
	public static void main(String[] args) {
		
		/*
		 * 입력받은 수까지의 크기를 갖는 배열을 생성한 후
		 * 1~입력받은 수까지 순서대로 배열에 저장
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력> ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		int i = 0;
		while(i != n) {
			arr[i] = i+1;
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
		scan.close();
	}
}
