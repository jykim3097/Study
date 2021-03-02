package _7_String;
import java.util.Scanner;

public class _3_10809 {
	public static void main(String[] args) {
		
		/*
		 * https://www.acmicpc.net/problem/10809
		 * 알파벳 찾기
		 */
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		String[] sArr = new String[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			sArr[i] = s.substring(i, i+1);
		}
		
		for(int i=0; i<sArr.length; i++) {
			char c = sArr[i].charAt(0);
			if(arr[(int)c-97] < 0)
				arr[(int)c-97] = i;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		scan.close();

	}
}
