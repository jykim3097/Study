package baekjoon.array;

import java.util.Scanner;

//출처 : https://www.acmicpc.net/problem/8958
public class B8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] testCase = new String[n];
		
		for(int i=0; i<n; i++) {
			int sum = 0;
			int cnt = 0;
			testCase[i] = sc.next();
			
			for(int j=0; j<testCase[i].length(); j++) {
				if(testCase[i].charAt(j) == 'O')
					sum += ++cnt;
				else
					cnt = 0;
			}
			
			System.out.println(sum);
		}
		
	}

}
