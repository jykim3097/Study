package _3_ragex.basic;

public class RegexEx01 {

	public static void main(String[] args) {
		
		//regex를 매개변수로 받는 메서드는 정규표현식을 적용할 수 있다.
		
		String info = "홍길동|20세|서울시 강남구|012-3456-7890";
		
		//정규 표현식을 이용해 전화번호 형식을 찾아서 ***-****-**** 이렇게 변경하기
		
		//\\d{3} : 정수 정확히 3개
		//\\{3,4} : 정수 3개 이상 4개 이하
		String pattern = "\\d{3}-\\d{3,4}-\\d{4}"; //전화번호 정규표현 형식
		
		info = info.replaceAll(pattern, "***-****-****");
		System.out.println(info);
	}
}
