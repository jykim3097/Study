package _2_quiz16;

import java.util.Scanner;

public class StrQuiz04_t {

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
		
		s = s.replace(" ", "");
		int m = s.length()/2;

		//쌤코드
		for(int i=0; i<m; i++) {
			if(s.charAt(i) != s.charAt(s.length() -1 -i)) {
				return "회문이 아닙니다.";
			}
		}
		return "회문";		
	}
}
