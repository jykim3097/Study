package baekjoon.stepfor;

import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
