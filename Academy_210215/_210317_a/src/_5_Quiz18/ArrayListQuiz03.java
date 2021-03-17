package _5_Quiz18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuiz03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1. User를 저장할 수 있는 list를 선언해 주세요.
		List<User> list = new ArrayList<>();
		
		while(true) {
			
			System.out.println("[1.등록 | 2.회원정보보기 |3.회원정보검색 | 4.회원정보삭제 | 5.종료");
			System.out.print("메뉴를 입력>");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				//스캐너로 이름, 나이를 입력받고 User에 저장, 리스트에 추가
				System.out.print("이름>");
				String name = scan.next();
				System.out.print("나이>");
				int age = scan.nextInt();
				
				User u = new User(name, age);
				list.add(u);

			} else if(menu == 2) {
				//list에 길이만큼 회전하면서 User객체의 이름, 나이를 순서대로 출력
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i).getName()+", "+list.get(i).getAge());
				}

			} else if(menu == 3) {
				//찾을 이름을 입력받습니다. 이름이 있다면, 이름과 나이를 출력합니다.
				//찾는 이름 없다면 "~~님은 목록에 없습니다" 를 출력합니다.
								
				System.out.print("이름>");
				String name = scan.next();
				
				String tmp = "";
				for(User u : list) {
					if(u.getName().equals(name)) {
						tmp = u.getName() + ", " + u.getAge();
					}
				}
				
				if(tmp.equals("")) {
					System.out.println(name +"님은 목록에 없습니다.");
				} else {
					System.out.println(tmp);
				}
				
			} else if(menu == 4) {
				//삭제할 이름을 입력받습니다. 입력받은 이름과 동일하다면 User객체를 삭제.
				System.out.print("이름>");
				String name = scan.next();
				
				int tmp =0;
				for(User u : list) {
					if(u.getName().equals(name)) {
						tmp = list.indexOf(u);
						break;
					}
				}
				
				list.remove(list.get(tmp));
				System.out.println("삭제되었습니다.");
				
			} else if(menu == 5) {
				//프로그램 종료
				return;
			} else {
				System.out.println("다시 입력하세요");
			}	
		}	
	}
}
