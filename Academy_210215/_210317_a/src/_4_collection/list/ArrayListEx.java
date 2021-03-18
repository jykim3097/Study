package _4_collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//List - 순서(index), 중복을 허용
		//ArrayList 생성
		List<String> list = new ArrayList<>();

		
		//list에 추가 add()
		list.add("JAVA");
		list.add("JSP");
		list.add("DB");
		list.add("SPRING");
		list.add("JAVA");
		
		//list의 크기 : size()
		System.out.println("리스트 크기 : " + list.size()); // 크기를 지정하지 않았지만 넣은 만큼 생겼다
		
		//list에 저장된 값을 문자열로 확인 - toString()
		System.out.println(list.toString());
		
		//list 중간에 추가 add(idx, value)
		list.add(3, "ORACLE");
		
		System.out.println(list.toString());

		//list의 수정 set(인덱스, 값)
		list.set(3, "MYSQL");

		System.out.println(list.toString());

		//list의 값 얻기 get(인덱스)
		System.out.println("4번째 인덱스의 값: "+list.get(4));
		
		//list의 값의 포함 여부 contains()
		if(list.contains("JAVA")) { //하나라도 포함되어 있다면 true, false
			System.out.println("값이 포함되어 있음");
		} else System.out.println("값이 없음");
		
		//list의 삭제 remove(값), remove(idx)
		list.remove(2);
		System.out.println(list.toString());
		
		//list 전체삭제 clear() - 
		list.clear();
		System.out.println("list: "+list.toString());
		
		//addAll - 컬렉션을 통째로 마지막에 추가
		List<String> list2 = new ArrayList<>();
		list2.add("홍길동");
		list2.add("이순신");
		
		list.addAll(list2);
		System.out.println(list.toString());
		
		List<Integer> list3 = new ArrayList();
		list3.add(3);
		list3.add(4);
		
		List<Integer> list4 = new ArrayList();
		list4.add(2);
		list4.add(6);
		
		list3.addAll(1, list4);
		System.out.println(list3.toString());

		//Arrays.asList(arr) - 배열을 리스트로 바꾸는 방법
		String[] arr = {"박찬호", "이순신"};
		List<String> list5 = Arrays.asList(arr);
		System.out.println(list5.toString());
	}
}
