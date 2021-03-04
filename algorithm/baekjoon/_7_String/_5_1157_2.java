package _7_String;

import java.util.Scanner;

public class _5_1157_2 {
	public static void main(String[] args) {
		/*
		 * https://www.acmicpc.net/problem/1157
		 * 단어 공부
		 * 
		 * 1차 시도보다 배열을 덜 쓰고 코드를 작성했지만 시간초과..
		 */
		
		//시간초과
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
	
		str = str.toUpperCase(); //다 대문자로 바꿈
		int[] iArr = new int[str.length()];
		
		int max=0;
		char answer = ' ';
		for(int i=0; i<str.length(); i++) {
			iArr[i]++;
			for(int j=0; j<i; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					iArr[i]++;
				}
			}
			if(iArr[i] > max) {
				max = iArr[i];
				answer = str.charAt(i);
			}
		}
		
		int cnt=0;
		for(int i=0; i<iArr.length; i++) {
			if(max == iArr[i]) {
				cnt++;
			}
		}
		
		
		if(cnt > 1) {
			System.out.println("?");
		} else {
			System.out.println(answer);
		}

		scan.close();
	}
}
