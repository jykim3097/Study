package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//출처 : https://www.acmicpc.net/problem/8958
public class B8958_3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(bf.readLine());
		String[] testCase = new String[n];
		
		for(int i=0; i<n; i++) {
			int sum=0;
			int cnt=0;
			testCase[i] = bf.readLine();
			
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
