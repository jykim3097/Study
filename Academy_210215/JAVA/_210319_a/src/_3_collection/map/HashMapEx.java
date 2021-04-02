package _3_collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		//Map - (키, 값)을 쌍으로 저장하는 구조, 키 값은 고유하다
		//Map 객체 생성
		HashMap<Integer, String> map = new HashMap<>();
		
		//map에 추가하는 기능 put(키, 값);
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "신사임당");
		
		System.out.println("map의 크기: " +map.size());
		System.out.println(map.toString());
		
		//map에 같은 key를 저장하면 key에 해당하는 value를 수정할 수 있다.
		map.put(4, "김유신"); //덮어쓰기가 된다
		System.out.println(map.toString());
		
		//map에 저장된 value 얻기 - get(키)
		String value = map.get(1);
		System.out.println("1번 키에 해당하는 값: " + value);
		
		System.out.println("----------------------------------------");
		
		//map에 들어있는 값을 순서대로 뽑고 싶을 때
		// keySet, entrySet을 이용해서 set형태로 바꿔서 사용해야한다
		Set<Integer> keySet = map.keySet(); //key만 뽑아서 Set으로 변경
		
		
		System.out.println(keySet.toString()); //key가 순서대로 나온다
		
		System.out.println("반복자 미사용");
		for(Integer i : keySet) {
			System.out.println(map.get(i));
		}
		
		System.out.println();
		System.out.println("반복자 사용");
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext()) {
			System.out.println(map.get(iter.next()));
		}
		
		System.out.println("------------------------------------");
		
		Set<Entry<Integer, String>> entSet = map.entrySet();
		
		for(Entry<Integer, String> e : entSet) {
			System.out.println(e.getKey() + ":" + e.getValue()); //순차적으로 key, value를 각각 뽑아낼 수 있다.
		}
		
		System.out.println("------------------------------------");
		//map에 있는 key여부 확인 containsKey(키)
		if(map.containsKey(3) ) { // key가 있다면 true, 없다면 false
			System.out.println(map.get(3));
			System.out.println("3번 키는 존재함");
		}
		
		System.out.println("------------------------------------");
		//map의 삭제 remove(key)
		map.remove(4);
		System.out.println(map.toString());
	}
}
