package _7_String;

import java.util.Arrays;
import java.util.Scanner;

public class _5_1157_3 {
	public static void main(String[] args) {
		/*
		 * https://www.acmicpc.net/problem/1157
		 * 단어 공부
		 * 
		 * for문을 한 번만 돌려서 시간복잡도 down
		 * 입력된 문자열을 먼저 정렬해서 값을 비교
		 * 
		 * 대문자 처리에 대한 에러가 있었다.
		 * - 처음에는 출력시에 대문자로 바꿔줬는데 그러면 대소문자를 다른 문자로 인식한다.
		 * - 그래서 처음에 입력받자마자 대문자로 바꿔주는 작업을 했다.
		 */
		
		//210303
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		str = str.toUpperCase();
		
		String[] sArr = new String[str.length()];
		sArr = str.split("");
		Arrays.sort(sArr);
		
		int cnt=1;
		int[] iArr = new int[str.length()];
		
		for(int i=0; i<sArr.length-1; i++) {
			if(sArr[i].equals(sArr[i+1])) {
				cnt++;
				sArr[i] = "";
			} else {
				iArr[i] = cnt;
				cnt = 1;
			}
		}
		iArr[iArr.length-1] = cnt;
		
		int max=0;
		int index=0;
		for(int i=0; i<iArr.length; i++) {
			if(iArr[i] > max) {
				max = iArr[i];
				index = i;
			}
		}
		
		int maxCnt = 0;
		for(int i=0; i<iArr.length; i++) {
			if(iArr[i] == max) maxCnt++;
		}
		
		if(maxCnt > 1) {
			System.out.println("?");
		} else {
			System.out.println(sArr[index]);
		}
		
		scan.close();
	}
}
