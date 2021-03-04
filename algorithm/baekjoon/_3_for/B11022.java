package baekjoon.stepfor;

import java.util.Scanner;

public class B11022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] caselist = new int[N][2];
		
		//배열에 숫자 넣기
		for(int i=0; i<N; i++) {
			for(int j=0; j<2; j++) {
				caselist[i][j] = sc.nextInt();
			}
		}
		
		//더해서 출력
		for(int i=0; i<N; i++) {
			System.out.println("Case #"+(i+1)+": "+caselist[i][0]+" + "+caselist[i][1]+" = "+(caselist[i][0]+caselist[i][1]));
		}
	}

}
