package _7_String;

import java.util.Scanner;

public class _6_1152 {
	public static void main(String[] args) {
		/*
		 * https://www.acmicpc.net/problem/1152
		 * 단어의 개수
		 * 문자와 띄어쓰기로 구성되어있는 문자열에서 단어의 개수 구하기
		 */
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		str = str.replaceAll("[^a-zA-Z\s]", "");

		if(str.matches("[^a-zA-Z\s]")) {
		
		}
		
		String[] sArr = new String[str.length()];
		sArr = str.split(" ");

		if(str.length() == 0) {
			System.out.println(0);
		} else {	
			System.out.println(sArr.length);
		} 
		scan.close();
	}
}
