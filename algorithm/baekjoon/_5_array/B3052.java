package baekjoon.array;

import java.util.Scanner;

//출처 : https://www.acmicpc.net/problem/3052
public class B3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[10];
		
		for(int i=0; i<10; i++) {
			int n = sc.nextInt();
			n = n % 42;
			intArr[i] = n;
		}

		int cnt = 0;
		for(int i=0; i<10; i++) {
			for(int j=i+1; j<10; j++) {
				if(intArr[i] == intArr[j]) {
					intArr[j] = -1;
				}
			}
		}
		
		for(int i=0; i<10; i++) {
			if(intArr[i] >= 0)
				cnt++;
		}
		
		System.out.println(cnt);
	}
}
