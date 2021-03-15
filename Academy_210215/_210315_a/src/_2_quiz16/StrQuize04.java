package _2_quiz16;

import java.util.Arrays;
import java.util.Scanner;

public class StrQuize04 {

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
		s = s.replace(" ", "");
		System.out.println(Palindrom(s));
	}
	
	public static String Palindrom(String s) {
		
		int m = s.length()/2;
		
		String left = "";
		String right = "";
		
		left = s.substring(0, m);
		
		if(s.length()%2 == 0) {
			right = s.substring(m);
		} else {
			right = s.substring(m+1);
		}
		
		//오른쪽 변수를 거꾸로 만든다
		String newR = "";
		for(int i=0; i<m; i++) {
			newR += Character.toString(right.charAt(m-i-1));
		}
		
		if(left.equals(newR)) {
			return "회문";
		} else return "회문이 아닙니다";
	}
}
