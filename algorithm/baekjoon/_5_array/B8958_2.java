package baekjoon.array;

import java.util.Scanner;

//출처 : https://www.acmicpc.net/problem/8958
public class B8958_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] testCase = new String[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			testCase[i] = sc.next();
			
			String[] array_word = testCase[i].split("X");
			
			for(int j=0; j<array_word.length; j++) {
				int len = array_word[j].length();
				sum = sum + len*(len+1)/2;
			}
			
			System.out.println(sum);
			sum=0;
		}
		
	}

}
