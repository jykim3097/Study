package baekjoon.array;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2577
public class B2577 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		int[] numArr = new int[9];
//		
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i] = scan.nextInt();
//		}
//		
//		int max = numArr[0];
//		int idx = 0;
//		
//		for(int i=1; i<numArr.length; i++) {
//			if(numArr[i] > max) {
//				max = numArr[i];
//				idx = i;
//			}
//		}
//		
//		System.out.println(max+" "+(idx+1));
		
		int max = 0;
		int idx = 0;
		
		for(int i=0; i<9; i++) {
			int num = scan.nextInt();
			
			if(num > max) {
				max = num;
				idx = i;
			}
		}
		
		System.out.println(max+ " "+ (idx+1));
		
	}

}
