package baekjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/15596
public class B15596 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] numArr = new int[n];
		
		for(int i=0; i<n; i++) {
			numArr[i] = Integer.parseInt(bf.readLine());
		}
		
		sum(numArr);
	}

	
	public static long sum(int[] a) {
		int int_sum = 0;
		for(int i=0; i<a.length; i++) {
			int_sum += a[i];
		}
		
		return int_sum;
	}
}
