package baekjoon.array;

import java.util.Scanner;

//출처 : https://www.acmicpc.net/problem/1546
public class B1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		int max = 0;
		double avg = 0;
		
		for(int i=0; i<n; i++) {
			int score = sc.nextInt();
			sum += score;
			
			if(score > max)
				max = score;
		}
		
		sc.close();
		
		avg = 100.0 * sum / max / n;
		System.out.printf("%.2f",avg);
	}
}
