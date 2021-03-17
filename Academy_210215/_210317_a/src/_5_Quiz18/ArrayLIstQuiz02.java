package _5_Quiz18;

import java.util.ArrayList;

public class ArrayLIstQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. User클래스는 은닉된 변수로 name, age를 선언.
		 *    User클래스의 생성자도 선언.
		 * 
		 * 2. User클래스를 저장할 수 있는 ArrayList선언
		 * 3. User객체를 2개 생성해서 리스트에 추가하세요.
		 * 
		 * 4. list에 저장된 모든 이름,나이를 for문으로 출력, 향상된 for문으로 출력
		 * 5. list에 "홍길자" 가 있다면 홍길자의 이름, 나이만 출력
		 * 
		 * 6. list에 "홍길동" 이 있다면 객체를 삭제.   
		 */
	
		//2.
		ArrayList<User> list = new ArrayList<>();
		
		//3.
		User u1 = new User("홍길동", 20);
		User u2 = new User("홍길자", 21);
		
		list.add(u1);
		list.add(u2);
		
		//4.
		System.out.print(4 + "번) ");
		for(User u : list) {
			System.out.println(u.getName() + ", " + u.getAge());
		}
		
		//5.
		System.out.print(5 + "번) ");
		for(User u : list) {
			if(u.getName().equals("홍길자")) {
				System.out.println(u.getName()+", " + u.getAge());
			}
		}
		
		//6.
		System.out.print(6 + "번) ");
		for(User u : list) {
			if(u.getName().equals("홍길동")) {
				list.remove(u);
				System.out.println("삭제되었습니다.");
			}
		}
	}

}
