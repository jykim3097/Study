package _7_String;
import java.util.Scanner;

public class _2_11720 {
	public static void main(String[] args) {
		
		/*
		 * https://www.acmicpc.net/problem/11720
		 * 숫자의 합
		 * 공백 없이 입력된 n개의 숫자들을 모두 합하시오
		 */
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();

		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(s.substring(i,i+1));
		}

		System.out.println(sum);
		
		scan.close();
	}
}
