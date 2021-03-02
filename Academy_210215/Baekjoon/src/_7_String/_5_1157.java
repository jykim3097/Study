package _7_String;

import java.util.Arrays;
import java.util.Scanner;

public class _5_1157 {
	public static void main(String[] args) {
		/*
		 * https://www.acmicpc.net/problem/1157
		 * 단어 공부
		 */
		
		//시간초과
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//	
//		str = str.toUpperCase(); //다 대문자로 바꿈
//		String[] sArr = str.split("");
//		
//		int[] iArr = new int[str.length()];
//		
//		for(int i=0; i<sArr.length; i++) {
//			iArr[i]++;
//			for(int j=0; j<i; j++) {
//				if(sArr[i].equals(sArr[j])) {
//					iArr[i] ++;
//				}
//			}
//		}
//		
//		int max = 0;
//		String answer = "";
//		for(int i=0; i<iArr.length; i++) {
//			if(iArr[i] > max) {
//				max = iArr[i];
//				answer = sArr[i];
//			}
//		}
//		
//		int cnt = 0;
//		for(int i=0; i<iArr.length; i++) {
//			if(max == iArr[i]) {
//				cnt++;
//
//			}
//			
//		}
//		if(cnt > 1) {
//			System.out.println("?");
//		} else {
//			System.out.println(answer);
//		}
		
		//시간초과
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//	
//		str = str.toUpperCase(); //다 대문자로 바꿈
//		int[] iArr = new int[str.length()];
//		
//		int max=0;
//		char answer = ' ';
//		for(int i=0; i<str.length(); i++) {
//			iArr[i]++;
//			for(int j=0; j<i; j++) {
//				if(str.charAt(i) == str.charAt(j)) {
//					iArr[i]++;
//				}
//			}
//			if(iArr[i] > max) {
//				max = iArr[i];
//				answer = str.charAt(i);
//			}
//		}
//		
//		int cnt=0;
//		for(int i=0; i<iArr.length; i++) {
//			if(max == iArr[i]) {
//				cnt++;
//			}
//		}
//		
//		
//		if(cnt > 1) {
//			System.out.println("?");
//		} else {
//			System.out.println(answer);
//		}
		
		Scanner scan = new Scanner(System.in);
	}
}
