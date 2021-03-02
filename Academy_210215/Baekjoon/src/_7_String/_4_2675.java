package _7_String;
import java.util.Scanner;

public class _4_2675 {
	public static void main(String[] args) {
		
		/*
		 * https://www.acmicpc.net/problem/2675
		 * 문자열 반복
		 */
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] iArr = new int[n];
		String[] sArr = new String[n];
		
		for(int i=0; i<2*n; i++) {		
			if(i % 2 ==0) {
				iArr[i/2] = scan.nextInt();				
			} else {
				sArr[i/2] = scan.next();				
			}
		}

		for(int i=0; i<sArr.length; i++) {
			String s = "";
			String[] str = sArr[i].split("");
			
			for(int k=0; k<str.length; k++) {
				for(int j=0; j<iArr[i]; j++) {
					s += str[k];
				}
			}
			System.out.println(s);
		}
	}
}
