package _1_collection.list;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		
		/*
		 * List<?> list - 무엇이든 다 들어갈 수 있음 - 와일드카드 문법
		 * List<? extends String> - String을 포함한 자식클래스는 전달 가능
		 * List<? super Integer> - Integer 형태를 가질 수 있다면 전달 가능
		 */
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		test01(list);
		test01(list2);
		test01(list3);
		
		test02(list);
//		test02(list2); 
//		test02(list3);
		
		//test03(list);
		test03(list2);
		test03(list3); //Integer의 부모니까 가능!
		
		
	}
	
	public static void test01(List<?> list) {
	
	}

	public static void test02(List<? extends String> list) {
		
	}
	
	public static void test03(List<? super Integer> list) { //integer의 형태를 가질 수 있다면!
		
	}
}
