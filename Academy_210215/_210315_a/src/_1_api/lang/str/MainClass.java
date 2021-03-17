package _1_api.lang.str;

import java.util.Arrays;

import _2_quiz16.StrQuiz04_1;

public class MainClass {

	public static void main(String[] args) {

		char[] arr = {'안', '녕', '하', '세', '요'};
		String str1 = new String(arr);
		String str2 = new String("안녕하세요");
		
		System.out.println(str1);
		System.out.println(str2);
		
		//일반적으로
		String str = "안녕하세요";
		
		//charAt -  인덱스 번호를 받아서 문자열을 한글자 자름
		char c = str.charAt(0);
		System.out.println(c);
		
		//length - 문자열 길이
		System.out.println(str.length());
		
		//indexOf - 문자열을 찾아서 인덱스 위치 반환
		System.out.println(str.indexOf("녕"));
		System.out.println(str.lastIndexOf("녕"));
		
		//replace - 특정 문자 변경 (중요)
		String str3 = "자바는 재밌습니까? 자바는 카페 이름인데 말이죠";
		System.out.println(str3);
		//str3.replace(target, replacement);
		String result = str3.replace("자바", "java");
		System.out.println(result);
		
		//replace를 이용한 공백 제거
		str3 = str3.replace(" ", "");
		System.out.println(str3);
		
		//substring - 문자열 자르기 (중요)
		String str4 = "123123-4567890";
		String result3 = str4.substring(7); //매개값을 1개 주면 앞 문자열 절삭
		System.out.println(result3);

		String result4 = str4.substring(7,str4.length()); // 매개값을 2개 주면 첫번째 매개값 이상부터 두번째 매개값 미만을 추출
		System.out.println(result4);
		
		//toUppperCase, toLowerCase - 대소문자로 변경
		String str5 = "Hello world";
		String result5 = str5.toUpperCase();
		System.out.println(result5);
		
		//trim - 문자열 앞, 뒤의 공백만 제거
		String str6 = "    홍길 동 ";
		System.out.println(str6.trim());
		
		//valueOf - 숫자를 문자로 변경
		int a = 1;
		int b = 2;
		System.out.println(a+b);
		System.out.println(String.valueOf(a)+String.valueOf(b));
		
		//split - 문자열 자르기(특정 문자를 기준)
		String str7 = "010-1234-5678";
		String[] arr2 = str7.split("-");
		System.out.println(Arrays.toString(arr2));
		
		String[] arr3 = str7.split("-", 2);
		System.out.println(Arrays.toString(arr3));
		
		//contains - 특정 문자가 포함되어있다면 true
		String str8 = "우리집 강아지 이름은? 없습니다.";
		if(str8.contains("강아지")) {
			System.out.println("강아지가 포함되어있습니다.");
		}
		
		System.out.println(StrQuiz04_1.Palindrom("다시 합창합시다"));
	}
}
