package _2_quiz16;

import java.util.Scanner;

public class StrQuiz04_2 {

	public static void main(String[] args) {
		
		/*
		 * Palindrom 함수는 매개변수로 String을 받아서 회문 여부를 검사하는 메서드
		 * 회문 : 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장
		 * 
		 * ex) 다시합창합시다, 다시다, 다같은것은같다
		 * 
		 * 문장은 공백을 포함해서 매개값을 받아도 된다.
		 * 회문이라면 "회문" 아니라면 "회문이 아닙니다"를 리턴
		 * 
		 * 9번째로 푸는 사람
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		String s = scan.nextLine();
		System.out.println(Palindrom(s));
	}
	
	public static String Palindrom(String s) {
		
		//StringBuffer이용하기
		s = s.replace(" ", "");
		StringBuffer sb = new StringBuffer(s);

		//equals를 사용하려면 같은 String 타입이어야한다.
		return sb.reverse().toString().equals(s) ? "회문" : "회문이 아닙니다.";

	}
}
