package algorithm_PA;

import algorithm_PA.QuickSort_version1;

public class QuickSort_version3 {
	// version 3 - median of three partitioning as a pivot
	
	static int[] A = InsertionSort.A;
	static int temp = QuickSort_version1.temp;
	
	public static void main(String[] args) {
	
		//시간 측정 시작
		long start = System.currentTimeMillis();
		
		quickSort_version3(A, 0, A.length-1);
		
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
		
		//시간 측정 종료
		long end = System.currentTimeMillis();

		//실행시간 출력 함수
		System.out.println();
		System.out.println( "실행 시간 : " + (end - start)/1000.0);

	}

	//1-3. partition version 3 - median of three partitioning as a pivot
	public static int partition_ver3(int[] A, int p, int r) {
		// q 배열의 가운데 값
		// A[p], A[q], A[r] 세 값 크기 비교
		// median 값의 인덱스를 리턴
		
		int q = (p+r)/2;
		
		//median을 구하는 식
		int median = ((A[p]>A[q])?((A[p]>A[r])?((A[q]>A[r])?q:r):p):((A[q]>A[r])?((A[p]>A[r])?p:r):q));
		
		temp = A[r];
		A[r] = A[median];
		A[median] = temp;
		
		return QuickSort_version1.partition_ver1(A, p, r);
	}
	
	public static void quickSort_version3(int[] A, int p, int r) {
		if(p<r) {
			// q = m_idx
			int q = partition_ver3(A, p, r);
			quickSort_version3(A, p, q-1);
			quickSort_version3(A, q+1, r);
		}
	}
}
