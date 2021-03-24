package _1_ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 반복자 스트림은 
		 * 중간처리 메서드 - 처리한 결과를 Stream 형태로 반환
		 * 최종처리 메서드 - 처리한 결과를 정수나 실수 등으로 반환함
		 * 
		 * 람다를 적용하는 함수적 인터페이스 종류
		 * Consumer - 매개변수를 받고, 반환은 없는 유형
		 * Predicate - 메개변수를 받고, 반환은 boolean
		 */
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=40; i++) {
//			Random ran = new Random();
//			int num = ran.nextInt(100) + 1;
//			list.add(num);
			
			list.add(new Random().nextInt(100) + 1);
		}
		System.out.println(list.toString());
		
		//distinct - 중복제거
		System.out.print("[");
		list.stream().distinct().forEach( (a) -> {System.out.print(a + ", ");});

		//sorted - 정렬
		System.out.print("\n[");
		list.stream().distinct().sorted().forEach((a) -> System.out.print(a+", "));
		
//		list.stream().distinct().filter(new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer t) {
//				return false;
//			}
//		});
		
		System.out.print("\n[");
		list.stream()
			.distinct()
			.filter((a) -> a%2 == 0 ) //true인 경우에만 반환
			.sorted()
			.forEach((a) -> System.out.print( a + ", "));
		
		//map - 람다에 정의된 새로운 Stream 타입으로 반환
		System.out.print("\n[");
		list.stream().distinct().sorted().filter((a) -> a%2 == 0).map( (a) -> a%2 == 0 ? "짝" : "홀").forEach((a) -> System.out.print(a + ", "));
		
		System.out.print("\n[");
		list.stream().distinct().sorted().map((a) -> a >= 50 ? a : 0).forEach((a) -> System.out.print(a + ","));
		
		//최종처리 메서드 collect
		System.out.print("\n");
		List<Integer> newList = list.stream()
			.distinct()
			.sorted()
			.filter( (a) -> a >=50 && a%3 == 0)
			.collect(Collectors.toList());
		
		System.out.println(newList.toString()); //새로운 list
		
		//MapToInt, MapToDouble, ...
		long r1 = list.stream().distinct().sorted().mapToInt( (a) -> a).count(); //매개변수 있고 반환도 있다.
		System.out.println("개수:" + r1);
		
		int r2 = list.stream().distinct().sorted().mapToInt( (a) -> a).sum();
		System.out.println("요소의 합: " + r2);
		
		OptionalInt r3 = list.stream().distinct().sorted().mapToInt((a) -> a).max();
		System.out.println(r3.getAsInt());
	}
}
