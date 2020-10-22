package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/4344
public class B4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			int m = Integer.parseInt(st.nextToken());
			
			int[] score = new int[m];
			
			int j = 0;
			int sum = 0;
			double avg = 0;
			int cnt = 0;
			
			while(st.hasMoreTokens()) {
				int l = Integer.parseInt(st.nextToken());
				score[j] = l;
				sum += l;
				j++;
			}
			
			avg = 1.0* sum / m;
			
			for(int k =0; k<m; k++) {
				if(score[k] > avg)
					cnt++;
			}
			
			System.out.print(String.format("%.3f", 100.0*cnt/m));
			System.out.println("%");
		}
	}

}
