package _1_ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClassReview {

	public static void main(String[] args) {
	
		//리스트에 1~100까지의 랜덤한 수 40개 넣기
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<40; i++) {
			list.add(new Random().nextInt(100)+1);
		}
		System.out.println("원본 리스트: " + list.toString());
		
		//중간처리, 최종처리 메서드
		
		//distinct를 사용해서 중복 제거
		System.out.print("변경 리스트: [");
		list.stream().distinct().sorted().forEach((j) -> System.out.print(j+", "));
		
		//filter()를 사용해 짝수인 경우만 출력
		System.out.print("\n변경 리스트: [");
		list.stream().distinct().sorted()
			.filter((j) -> j%2 ==0)
			.forEach((j) -> System.out.print(j+", "));
		
		//map() - 새로운 Stream 타입 반환
		System.out.print("\n변경 리스트: [");
		list.stream().distinct().sorted()
			.filter((j) -> j%2 ==0)
			.map((j) -> j%2 == 0? "짝":"홀")
			.forEach((j) -> System.out.print(j+ ","));
		
		//50보다 크면 그대로, 작으면 0으로 값 변경
		System.out.print("\n변경 리스트: [");
		list.stream().distinct()
			.map((j) -> (j>=50 ? j : 0))
			.forEach((j) -> System.out.print(j+", "));
		
		//최종 처리 메서드 collect()
		//50보다 크면서 3의 배수인 수 filtering에서 새로운 배열에 넣기
		System.out.print("\n변경 리스트: ");
		List<Integer> newList = list.stream().distinct().sorted()
			.filter((j) -> (j >=50 && j%3 ==0))
			.collect(Collectors.toList());
		
		System.out.println(newList.toString());
		
		//MapToXXX
		double r1 = list.stream().distinct().sorted().mapToDouble((j) -> j).sum();
		System.out.println(r1);
		
		long r2 = list.stream().distinct().sorted().mapToLong((j) -> j).count();
		System.out.println(r2);
		
		OptionalInt r3 = list.stream().distinct().sorted().mapToInt((j)->j).max();
		System.out.println(r3.getAsInt());
	}
}
