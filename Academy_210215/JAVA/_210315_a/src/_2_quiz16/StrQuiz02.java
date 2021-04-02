package _2_quiz16;

import java.util.Scanner;

public class StrQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 주민번호 13자리를 입력 받는다.
		 * 주민번호는 '-'를 포함해서 받을 수도 있다
		 * 13자리가 아니라면 다시 입력받는다
		 * 남자인지 여자인지 구분해서 출력
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print(">");
			String ssn = scan.next();
			ssn = ssn.replace("-", "");

			if(ssn.length() == 13) {
				if(ssn.substring(6, 7).equals("2") || ssn.substring(6, 7).equals("4")) {
					System.out.println("여자입니다.");
				} else if (ssn.substring(6, 7).equals("1") || ssn.substring(6, 7).equals("3")){
					System.out.println("남자입니다.");
				}
				break;
			}
			
			System.out.print("다시 입력해주세요");
			
		}
	}
}
