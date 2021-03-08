package _7_String;

import java.util.Arrays;
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

//		int cnt = 0;
//		if(str.length() == 1 && str.charAt(0) == ' ') { // 띄어쓰기만 입력될 때
//			System.out.println(0);
//		} else if ( str.length() == 0) { // 엔터만 입력될 때
//			System.out.println(0);
//		}
//		else{
//			if(str.charAt(0) == ' ' || str.charAt(str.length()-1) == ' ') cnt--;
//			
//			for(int i=0; i<str.length(); i++) {
//				//System.out.println(str.charAt(i));
//				
//				
//				if(str.charAt(i) == ' ') {
//					cnt++;
//				}
//			}
//			System.out.println(cnt+1);
//		}
		
		String[] sArr = new String[str.length()];
		String s = "";
		
		int j=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ' || i == str.length()-1) { // 띄어쓰기가 아니라면
				s += str.charAt(i);
			} else {
				sArr[j] = s;
				s= "";
				j++;
			}
		}
		sArr[j] = s;
		System.out.println(Arrays.toString(sArr));
		
		int cnt = 0;
		for(int i=0; i<sArr.length; i++) {
			//여기만 잘 설정하면 된다...
		}
		
		System.out.println(cnt);
	}
}
