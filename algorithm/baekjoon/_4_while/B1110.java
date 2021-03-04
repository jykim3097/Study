package baekjoon.stepwhile;

import java.util.Scanner;

public class B1110 {

	public static void main(String[] args) {

//		1. 주어진 수가 10보다 작으면 앞에 0을 붙여 두 자리수 만들고, 각 자리의 숫자를 더한다.
//		2. 주어진 수의 가장 오른쪽 자리의 수와 1번 결과의 가장 오른쪽 자리의 수를 이어 붙여 새로운 수를 만든다.
//		ex) 주어진 수 26 -> 2+6=8 -> 68 (새로운 수)
//			6+8=14 -> 84
//			8+4+12 -> 42
//			4+2=6 -> 26 (원래 수로 돌아옴)
//			사이클이 4다.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //주어진 수
		
		int m = n; //새로운 수
		int cycle = 0;
		
		while(true) {
			int tens = m/10; //십의 자리 수
			int units = m%10; //일의 자리 수
			
			m = tens + units;
			m = units*10 + m%10;	
			cycle++;
			
			if(n == m) break;
		}
		System.out.println(cycle);
	}

}
