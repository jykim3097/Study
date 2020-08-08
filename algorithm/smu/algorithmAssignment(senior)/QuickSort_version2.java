package algorithm_PA;

import algorithm_PA.QuickSort_version1;
import java.util.Random;

public class QuickSort_version2 {
	
	static int[] A = InsertionSort.A;
	static int temp = QuickSort_version1.temp;
	
	public static void main(String[] args) {
		
		//시간 측정 시작
		long start = System.currentTimeMillis();

		quickSort_version2(A, 0, A.length-1);
		
		for(int i=0; i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		
		//시간 측정 종료
		long end = System.currentTimeMillis();

		//실행시간 출력 함수
		System.out.println();
		System.out.println( "실행 시간 : " + (end - start)/1000.0);
	}
	
	//1-2. partition version 2 - random number as a pivot
	public static int partition_ver2(int[] A, int p, int r) {
		
		//랜덤 함수를 통해 p~r 사이의 값을 랜덤으로 고른다
		//p값이 계속 변하므로 범위를 잘 지정해 주어야한다
		//최소 p부터 최대 r-p+1까지
		Random random = new Random();
		int i = random.nextInt(r-p+1)+p;
		
		temp = A[r];
		A[r] = A[i];
		A[i] = temp;
		
		return QuickSort_version1.partition_ver1(A, p, r);
	}
	
	public static void quickSort_version2(int[] A, int p, int r) {
		if(p<r) {
			int q = partition_ver2(A, p, r);
			quickSort_version2(A, p, q-1);
			quickSort_version2(A, q+1, r);
		}
	}
}
