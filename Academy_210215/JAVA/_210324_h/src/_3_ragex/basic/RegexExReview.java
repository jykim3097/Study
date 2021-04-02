package _3_ragex.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExReview {

	public static void main(String[] args) {
		
		String info = "홍길동|20세|서울시 강남구|012-3456-7890";
		
		//정규표현식을 만들어 ***-****-****로 변환
		String pattern = "\\d{3}-\\d{4}-\\d{4}";
		info = info.replaceAll(pattern, "***-****-****");
		System.out.println(info);
		
		System.out.println("----------------------------------");
		
		String info2 = "홍길동|20세|서울시 강남구|02-345-6789|012-3456-7890|kkk2@navar.cam";
		
		//전화번호만 출력
		String pattern2 = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		//패턴클래스를 이용해 정규표현 엔진을 생성하고
		Pattern p = Pattern.compile(pattern2);
		//정규 표현 엔진을 적용해 출력
		Matcher m = p.matcher(info2);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		System.out.println("----------------------------------");
		
		//이메일 출력
		String pattern3 = "[0-9a-zA-Z]+@\\w+.\\w+";
		Matcher m2 = Pattern.compile(pattern3).matcher(info2);
		if(m2.find()) {
			System.out.println(m2.group());
		}
	}
}
