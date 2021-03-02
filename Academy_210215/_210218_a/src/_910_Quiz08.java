

import java.util.Scanner;

public class _910_Quiz08 {
	public static void main(String[] args) {
		
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 귤, 포도]");
		System.out.print("> ");
		Scanner scan = new Scanner(System.in);
		String menu = scan.next();
		
		switch(menu) {
		case "수박" :
			System.out.println(menu+"은 만원입니다.");
			break;
		
		case "사과" :
			System.out.println(menu+"은 천원입니다.");
			break;
			
		case "멜론" :
			System.out.println(menu+"은 만원입니다.");
			break;
			
		case "귤" :
			System.out.println(menu+"은 10개 5천원입니다.");
			break;
			
		case "포도" :
			System.out.println(menu+"는 만원입니다.");
			break;
			
		default :
			System.out.println(menu+"란 품목은 없습니다.");
			break;
		}
		
		scan.close();
	}
}
