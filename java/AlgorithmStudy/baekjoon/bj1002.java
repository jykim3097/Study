package bj1002;

import java.util.Scanner;
import java.util.Arrays;

public class bj1002 {

	public static void main(String[] args) {
		
		int t;
		int x1, y1, r1, x2, y2, r2;
		int a, b;
		int c;
		int m;
		
		Scanner scan = new Scanner(System.in);
		t = scan.nextInt();
		
		int[][] xyr = new int[t][6];
		
		for(int i=0; i<t; i++) {
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			r1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			r2 = scan.nextInt();

			xyr[i][0] = x1; 
			xyr[i][1] = y1; 
			xyr[i][2] = r1; 
			xyr[i][3] = x2; 
			xyr[i][4] = y2; 
			xyr[i][5] = r2; 
		}
		
		//int 배열 값을 출력하는 함수
		//System.out.println(Arrays.deepToString(xyr));
		
		
	}

}
