package _7_String;
import java.util.Scanner;

public class _1_11654 {
	public static void main(String[] args) {
		/*
		 * https://www.acmicpc.net/problem/11654
		 * 아스키코드 구하기
		 */
		
		Scanner scan = new Scanner(System.in);

		String m = scan.next();
		char c = m.charAt(0);
		
		System.out.println((int)c);
		
		scan.close();
	}
}
