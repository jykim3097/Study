

import java.util.Scanner;

public class _7_Quiz07 {
	public static void main(String[] args) {
		
		/*
		 * 정수 3개를 입력받고, 큰 값에서 작은 값 순으로 정렬해서 출력해라
		 * 단, 같은 수인 경우는 고려하지 않는다.
		 * abc
		 * acb
		 * bac
		 * bca
		 * cab
		 * cba
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		// 내 방법
		if(a>b) {
			if(a>c) {
				if(b>c) { // a>b>c
					System.out.println(a+", "+b+", "+c);
				} else { //a>c>b
					System.out.println(a+", "+c+", "+b);
				}
			} else { //c>a>b
				System.out.println(c+", "+a+", "+b);
			}
		} else { //b>a
			if(b>c) {
				if(a>c) { //b>a>c
					System.out.println(b+", "+a+", "+c);
				} else { //b>c>a
					System.out.println(b+", "+c+", "+a);
				}
			} else { //b<c c>b>a
				System.out.println(c+", "+b+", "+a);
			}
		}
		
		//선생님 힌트로 만든 방법
		if(a>b && a>c) { //a가 가장 큰 경우
			if(b>c) {
				System.out.println(a+", "+b+", "+c);
			} else {
				System.out.println(a+", "+c+", "+b);
			}
		} else if ( b>a && b>c) { //b가 가장 큰 경우
			if(a>c) {
				System.out.println(b+", "+a+", "+c);
			} else {
				System.out.println(b+", "+c+", "+a);
			}
		} else { //c가 가장 큰경우
			if(a>b) {
				System.out.println(c+", "+a+", "+b);
			} else {
				System.out.println(c+", "+b+", "+a);
			}
		}
		
		//선생님 방법 - 변수 선언으로 완전 깔끔해짐!
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		if( a>b && a>c) {
			
			max = a;
			
			if(b >c) {
				mid = b;
				min = c;
			} else {
				mid = c;
				min = b;
			}
			
		} else if (b>a && b>c) {
			
			max =b;
			
			if(a>c) {
				mid=a;
				min=c;
			} else {
				mid = c;
				min = a;
			}
			
		} else if (c>a && c>b) {
			
			max = c;
			
			if(a>b) {
				mid = a;
				min = b;
			} else {
				mid = b;
				min = a;
			}
		}
		
		System.out.println(max+", "+mid+", "+min);
		scan.close();
	}
}
