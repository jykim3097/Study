package _5_Quiz18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuiz01 {

	public static void main(String[] args) {
		
		//list에 1~20까지 정수를 저장
		List<Integer> list = new ArrayList<>(); //크기를 지정하지 않고 만들기 때문에 ㄴ크기가 0
		for(int i=1; i<21; i++) {
			list.add(i);
		}
		
		//저장한 값을 반복문으로 출력
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}
}
