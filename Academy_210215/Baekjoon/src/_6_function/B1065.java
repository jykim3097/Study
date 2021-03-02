package _6_function;
import java.util.Scanner;

public class B1065 {
	public static void main(String[] args) {
		
		/*
		 * https://www.acmicpc.net/problem/1065
		 * 숫자의 각 자리수들이 등차수열을 이루는 한수 구하기
		 * 
		 * 10보다 작은 수는 한 자리수 -> 그냥 카운트
		 * 10보다 크고 100보다 작은 수는 두자리수 -> 그냥 카운트
		 * 로 경우가 같다. 그래서 100보다 작은 수와 큰 수로 나눠서 생각한다.
		 * 
		 * 100보다 작은 수들은 그냥 카운트를 해주고
		 * 100보다 큰 수는 각 자리수를 배열에 넣은 후 숫자의 차를 구해 새로운 배열에 넣는다.
		 * 새로운 배열의 값이 모두 같으면 등차수열을 이루는 한수이다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); // 1 <= N <= 1000
		
		int[] arr3 = new int[3];
		int[] arr2 = new int[2];
		
		int k = 1;
		int cnt = 0;
		while(k <= N) {
			if (k>99) {
				arr3[0] = k/100;
				arr3[1] = (k - arr3[0]*100)/10;
				arr3[2] = k - arr3[0]*100 - arr3[1]*10;
				
				for(int i=0; i<arr2.length; i++) {
					arr2[i] = arr3[i] - arr3[i+1];
				}
				if(arr2[0] == arr2[1]) cnt++;
			} else cnt++;
			k++;
		}
		
		System.out.println(cnt);
		scan.close();
	}
		
}
