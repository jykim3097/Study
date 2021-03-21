package _4_Quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapQuiz01 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("kim", "kkk123");
		map.put("park", "park123");
		map.put("lee", "lee111");
		map.put("choi", "choi222");

		/*
		 * 1. 입력받은 아이디가 맵에 입력된 키값에 해당하는지 여부를 검사해서
		 * 	  존재한다면 비밀번호와 값도 비교한다. 그 다음 비밀번호가 일치하면 "로그인 성공"을
		 *    출력하고 반복문을 탈출하세요.
		 * 2. 아이디가 맵에 없는 값이라면 "아이디가 없습니다"를 출력
		 *    비밀번호가 틀렸다면 "비밀번호가 틀렸습니다"를 출력
		 *    하고 다시 입력받으세요
		 */

		Scanner scan = new Scanner(System.in);

		es:while(true) {
			System.out.print("id 입력>");
			String id = scan.next();

			if(map.containsKey(id)) {
				while(true) {	
					System.out.print("pw 입력>");
					String pw = scan.next();
					if(map.get(id).equals(pw)) {
						System.out.println("로그인 성공");
						break es;
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}
			} else {
				System.out.println("아이디가 없습니다.");
			}
		}
	}
}
