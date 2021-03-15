package _2_quiz16;

import java.util.Scanner;

public class StrQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 스캐너를 통해서 id를 입력받는다.
		 * 아이디는 공백을 포함해서 받을 수 있다.
		 * 단, 공백을 제거한 아이디가 4글자 미만이면 다시 입력 받아라
		 * 4글자 이상이면 "id가 등록되었습니다" 출력하고 종료
		 */
		
		Scanner scan = new Scanner(System.in);

		while(true) {
			
			System.out.print("> ");
			String id = scan.nextLine();
			
			id = id.replace(" ", "");
			
			if(id.length() > 3) {
				System.out.println("id가 등록되었습니다. " + id);
				break;
			}
			
			System.out.print("다시 입력해주세요");
			
		}
	}
}
