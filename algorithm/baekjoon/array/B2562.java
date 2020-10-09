package baekjoon.array;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2562
public class B2562 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int num = a*b*c;
		String strNum = Integer.toString(num);
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0; i<(int)Math.log10(num)+1; i++){
			count[strNum.charAt(i)-'0']++;
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}
}
