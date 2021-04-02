package _1_api.util.array;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		int[] arr = {4, 3, 6, 3, 1, 7};
		
		//sort - 정렬
		Arrays.sort(arr);
		
		//toString - 문자열 확인
		System.out.println(Arrays.toString(arr));
		
		//binarySearch - 값의 위치 확인 (선행조건 : 정렬)
		int index = Arrays.binarySearch(arr, 7);
		System.out.println(index); // 없는 값이면 음수값 반환
		
		//copyOf, copyOfRange - 배열의 복사
		int[] newArr = Arrays.copyOf(arr, arr.length); //arr.length : 배열의 전체 type
		System.out.println(Arrays.toString(newArr));
		
		int[] newArr2 = Arrays.copyOfRange(arr, 3, 5); //index 3~5 미만까지
		System.out.println(Arrays.toString(newArr2));
		
		//equals - 배열 내부요소가 동일한지 확인 - 정렬이 선행되어야 함
		System.out.println(arr == newArr); //배열 주소 비교
		
		if(Arrays.equals(arr, newArr)) {
			System.out.println("내부 값이 동일함");
		}
	}
}
