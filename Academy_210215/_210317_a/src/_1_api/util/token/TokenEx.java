package _1_api.util.token;

import java.util.StringTokenizer;

public class TokenEx {
	
	public static void main(String[] args) {
		
		//split() 비슷하게 문자열을 특정 토큰 형태로 자르는 것
		String str1 = "오늘 날씨는 맑고, 매우 추워요";
		String str2 = "2021/03/17";
		
		
		StringTokenizer st = new StringTokenizer(str1);
		System.out.println("잘린 토큰의 개수: " + st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		System.out.println(st.hasMoreElements()); //다음이 없으니까 false
		
		//다음 요소가 있는지 확인을 하고 써야한다
		while(st.hasMoreTokens()) {
			//다음이 있으면 true, 없으면 false
			System.out.println(st.nextToken());
		}
		
		System.out.println("---------------");
		
		StringTokenizer token2 = new StringTokenizer(str2, "/");
		
		System.out.println("잘린 토큰의 개수: " + token2.countTokens());
		
		while(token2.hasMoreTokens()) {
			System.out.print(token2.nextToken()+ " ");
		}
	}
}
