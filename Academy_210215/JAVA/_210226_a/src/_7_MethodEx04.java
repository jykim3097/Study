

import java.util.Arrays;

public class _7_MethodEx04 {
	public static void main(String[] args) {
		
		//메서드의 매개변수, 반환유형으로 배열을 전달하는 방법
		int[] arr = {1,2,3};
		String[] arr2 = {"김지영", "홍길동"};
		method1(arr,arr2);

		String[] arr3 = method2();
		System.out.println(Arrays.toString(arr3));
	}
	
	//매개변수로 배열을 전달 받는 메서드, 반환x
	static void method1(int[] a, String[] s) {
		 
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(s));
	}
	
	//String 배열을 반환하는 메서드
	static String[] method2() {
		
		String[] arr = {"월", "화", "수"};
		
		return arr;
	}
	
}
