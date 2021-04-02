package _4_ramda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * 반복자 스트림이란?
		 * - 컬렉션의 값을 조금 더 빠르고, 간결하게 사용할 수 있도록 제공해주는 구조물
		 * - 반복자 스트림은 함수적 인터페이스를 받고 있기 때문에 람다식을 지원
		 */
		
		String[] arr = {"홍길동", "이순신", "박찬호", "김유신", "감강찬"};
		List<String> list = Arrays.asList(arr); //배열을 리스트로 변환
		
		Stream<String> st = list.stream(); //리스트를 스트림으로 반환
		
		st.forEach(new Consumer<String>() { //함수적 인터페이스
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		//함수적 인터페이스니까 람다식으로 변환할 수 있다.
		list.stream().forEach( (t) -> System.out.println(t));
		
	}
}
