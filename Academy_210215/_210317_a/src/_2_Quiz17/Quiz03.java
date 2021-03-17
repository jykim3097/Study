package _2_Quiz17;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz03 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 이용해서 nextLine()으로 문장을 받는다.
		 * 2. 입력받은 문장을 토크나이저를 이용해서 공백 기준으로 분리
		 * 3. 분리한 토큰 개수 출력
		 * 4. for문으로 아래 형식으로 출력
		 * ex) 1. 안녕
		 *      2. 하세요.
		 *      3. 오늘은 ...
		 * 5. 분리된 토큰은 배열에 새롭게 저장
		 */
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(s," ");
		System.out.println("토큰 개수: " + st.countTokens());
		
		int len = st.countTokens();
		String[] sArr = new String[len];
		
		for(int i=0; i<len; i++) { // for( ; st.hasMoreTokens() ; )
			sArr[i] = st.nextToken();
			System.out.println((i+1)+". "+ sArr[i]);
		}

		System.out.println(Arrays.toString(sArr));
	}
}
