package _1_api.util.token;

import java.util.StringTokenizer;

public class TokenEx02 {

	public static void main(String[] args) {
		
		String str = "2021.03.17, 수요일, /bno=30, id=홍길자";
		
		StringTokenizer st = new StringTokenizer(str,", ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(str, ".,/ "); //구분자를 한 번에 다 쓸 수도 있다.
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("--------------");
		
		//구분자를 포함해서 자름
		StringTokenizer st3 = new StringTokenizer(str, ",", true); // 구분자를 기준으로 자르고, 구분자도 출력한다.
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}
}
