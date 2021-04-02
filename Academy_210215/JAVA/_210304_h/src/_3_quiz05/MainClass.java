package _3_quiz05;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		String[] sArr = {"가", "나", "다"};
		int[] iArr = {1,2,3};
		double[] dArr = {1.0, 2.0, 3.0};
		
		ArrayPrint ap = new ArrayPrint();
		System.out.println(ap.printArray(sArr));
		System.out.println(ap.printArray(iArr));
		System.out.println(ap.printArray(dArr));
		
		//
		String a = "홍길동";
		ap.test(a);
		System.out.println("a="+a);
		
		String[] a2 = {"가", "나", "다"};
		ap.test(a2); // 배열 주소가 출력
		
		System.out.println("a2="+Arrays.toString(a2)); //값이 출력
	}
}
