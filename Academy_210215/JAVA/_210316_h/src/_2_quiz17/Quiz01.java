package _2_quiz17;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		/*
		 * Math.ceil을 이용해서
		 * 1-10까지 값이 전달되면 1을 반환
		 * 11-20까지 값이 전달되면 2를 반환
		 * 21-30까지 값이 전달되면 3을 반환
		 * ..
		 */
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println((int)Math.ceil(n*0.1));
		scan.close();
	}
}
