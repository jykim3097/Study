package _1_collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		// Set계열은 순서가 x, 중복 x
		
		//HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//set에 추가 add()
		set.add("JAVA");
		set.add("JSP");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA");
		
		//set에 저장된 크기 size()
		System.out.println(set.size());
		System.out.println(set.toString());
		
		//set에 들어있는 객체를 검색하려면, 반복자를 통해서 하나씩 순서대로 확인한다
		Iterator<String> iter = set.iterator();
		
		for( ; iter.hasNext() ;) { //다음이 있다면 t, 없다면 f
			System.out.println(iter.next());
		}
		
		//set의 검색(포함여부) contains()
		if(set.contains("JAVA")) {
			System.out.println("JAVA가 포함되어 있음");
		}
		
		//set의 삭제 remove(값)
		set.remove("ORACLE");
		System.out.println(set.toString());
	}
}
