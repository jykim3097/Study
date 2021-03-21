package _4_Quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapQuiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는 key는 메뉴, value는 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("----- 음식 메뉴 관리 -----");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인한 후에 메뉴로 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴 삭제"); //삭제할 메뉴를 받아서 있다면 삭제
			System.out.println("5. 종료"); //종료

			System.out.print("번호 입력> ");
			switch (scan.nextInt()) {
			
			case 1:
				System.out.println("----- 신규 메뉴 등록 -----");
				System.out.print("메뉴 입력> ");
				String menu = scan.next();

				if(map.containsKey(menu)) {
					System.out.println("이미 등록된 메뉴입니다.");
				} else {
					System.out.print("가격 입력> ");
					int price = scan.nextInt();
					map.put(menu, price);
				}
				break;
				
			case 2:
				System.out.println("----- MENU -----");
				
				Set<Entry<String, Integer>> entSet = map.entrySet();
				
				for(Entry<String, Integer> e : entSet) {
					System.out.println(e.getKey() + ": " + e.getValue());
				}
				
				System.out.println();	
				break;
				
			case 3:
				System.out.println("----- 메뉴 수정 -----");
				System.out.print("메뉴 입력> ");
				menu = scan.next();

				if(map.containsKey(menu)) {
					System.out.print("가격 입력> ");
					int price = scan.nextInt();
					map.put(menu, price);
					System.out.println("수정되었습니다.");
					System.out.println(map.get(menu) + "원 -> " + price + "원");
				} else {
					System.out.println("존재하지 않는 메뉴입니다.");
				}
				
				System.out.println();
				break;
				
			case 4:
				System.out.println("----- 메뉴 삭제 -----");
				System.out.print("메뉴 입력> ");
				menu = scan.next();

				if(map.containsKey(menu)) {
					map.remove(menu);
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("존재하지 않는 메뉴입니다.");
				}
				
				System.out.println();
				break;
				
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				
			default:
				
				System.out.println("잘못 입력했습니다.");
				break;
			}

		}
	}
}
