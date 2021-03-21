package _1_collection.list;

import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class LinkedListEx {

	public static void main(String[] args) {
		
		//List<String> list = new LinkedList<>();
		
		//Queue<String> list2 = new LinkedList<>();
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("홍길동");
		list.add("정길동");
		list.add("김길동");
		
		System.out.println(list.toString());
		
		//값 얻기 - List에서 사용했던 것과 똑같음
		System.out.println("0번째 인덱스 값: " + list.get(0));
		
		//처음에 추가 - index 0번에 추가
		list.addFirst("박찬호");
		System.out.println(list.toString());
		
		//마지막에 추가
		list.addLast("신사임당");
		System.out.println(list.toString());
		
		System.out.println("------------------------------------------");
		
		//전체 삭제
		list.clear();
		System.out.println(list.toString());
		
		//LinkedList는 stack처럼 동작 - LIFO(Last In First Out)
		//push, pop
		list.push("강감찬"); 
		list.push("이순신");
		list.push("박찬호");
		System.out.println(list.toString());

		list.pop(); //꺼내면서 삭제
		System.out.println(list.toString());
		
		System.out.println(list.peek()); //값만 읽기
		
		System.out.println("-----------------------------------------");
		//LinkedList는 queue처럼 동작 - FIFO(First In First Out)
		
		//전체 삭제
		list.clear();
		System.out.println(list.toString());
		
		//offer, poll, peek
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list.toString());

		list.poll();
		System.out.println(list.toString());
		
		System.out.println(list.peek());
		System.out.println(list.toString());
	}
}
