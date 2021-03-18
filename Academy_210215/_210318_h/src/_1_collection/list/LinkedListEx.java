package _1_collection.list;

import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {

	public static void main(String[] args) {
		
		//List<String> list = new LinkedList<>();
		
		//Queue<String> list2 = new LinkedList<>();
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("홍길동");
		list.add("정길동");
		list.add("김길동");
		
		System.out.println(list.toString());
		
		//값 얻기
		System.out.println("0번째 인덱스 값: " + list.get(0));
		
		//처음에 추가
		list.addFirst("박찬호");
		System.out.println(list.toString());
		
		//마지막에 추가
		list.addLast("신사임당");
		System.out.println(list.toString());
		
		//push, pop
		list.push("강감찬"); //마지막에 추가
		System.out.println(list.toString());

		//pop - 마지막에 들어간 걸 뽑아냄
		System.out.println(list.pop());	// 삭제하면서 읽기
		System.out.println(list.toString());
		
		System.out.println(list.peek()); //삭제하지 않고 읽기
		System.out.println(list.toString());
		
		list.push("김지영");
		System.out.println(list.toString());
		
	}
}
