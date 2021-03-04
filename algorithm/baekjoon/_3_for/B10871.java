package baekjoon.stepfor;

import java.util.Scanner;

public class B10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		

		int[] numArr = new int[n];
		int[] smallArr = new int[n];
		
		for (int i=0; i<n; i++) {
			numArr[i] = sc.nextInt();
		}

		for (int i=0; i<n; i++) {
			if(numArr[i] < x) {
				smallArr[i] = numArr[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(smallArr[i] !=0)
				System.out.print(smallArr[i]+ " ");
		}
	}

}
