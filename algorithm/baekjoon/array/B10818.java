package baekjoon.array;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10818
public class B10818 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] array = new int[n];		
		
		for(int i=0; i<n; i++) {
			array[i] = scan.nextInt();
		}
		
		int min = array[0];
		int max = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(array[i] < min)
				min = array[i];
			if(array[i] > max)
				max = array[i];
		}
		
		System.out.println(min+" "+max);
		
	}

}
