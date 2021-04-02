package _2_Quiz19;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. Random 객체를 이용해서 1~45까지 랜덤정수를 만들고
		 * 2. Set 계열을 이용해서 중복되지 않는 로또번호를 만들어내는 코드 작성
		 */
		
		Random r = new Random();
		Set<Integer> set = new TreeSet<>();

		//쌤코드
		while(true) {
			int num = r.nextInt(45)+1;
			set.add(num);
			
			if(set.size() == 6) break;
		}
		System.out.println(set.toString());
		
//		은재님 코드		
//		while(set.size()<6) {
//			set.add(r.nextInt(45)+1);
//		}
//		System.out.println(set.toString());

	}
}
