package _3_ragex.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		
		/*
		 * -주요 사용 정규표현 형식 정리-
		 *  \\w : 영문자와 숫자
		 *  \\w+ : 영문자, 숫자 여러개
		 *  
		 *  \\d : 숫자만
		 *  \\d+ :  숫자 여러개
		 *  
		 *  \\d{3} : 숫자 3개
		 *  \\d{3,5} : 숫자 3 이상 5 이하
		 *  
		 *   [0-9] 0-9 사이의 문자를 1개 찾음
		 *   [a-z] a-z 사이의 문자를 1개 찾음
		 *   [A-Z] A-Z 사이의 문자를 1개 찾음
		 *   [가-힣] 한글 1개 찾음
		 *   [가-힣]+ 한글 여러개
		 */
		
		String info = "30세/서울시 강남구/02-123-3452/010-1234-5678/kkk@naver.com";
		
		//전화번호 형식
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		//1. 패턴 클래스 이용, 정규표현엔진생성
		Pattern p = Pattern.compile(pattern);
		//2. 정규표현엔진 적용
		Matcher m = p.matcher(info);
		
		//System.out.println(m.find()); //있으면 true, 없으면 false
		while(m.find()) {
			System.out.println("인덱스 위치: " + m.start() + "이상 " + m.end() + "미만");
			System.out.println("추출: " + m.group()+"\n");
		}
		
		//이메일 (정규표현식 메타문자에 포함되지 않는 글자 또는 특수문자는 그대로 사용)
		String pattern2 = "\\w+@\\w+.\\w+";
		Matcher m2 = Pattern.compile(pattern2).matcher(info);
		if(m2.find()) {
			System.out.println("인덱스 위치: " + m2.start() + "이상 " + m2.end() + "미만");
			System.out.println("추출: " + m2.group()+"\n");
		}
	}
}
