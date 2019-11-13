package algorithm_PA;

public class QuickSort_version1 {

	static int[] A = InsertionSort.A;
	static int temp = -1;
	
	public static void main(String[] args) {
		//1. partition 함수 구현
		//1-1. version 1 - first or last element as a pivot
		//1-2. version 2 - random number as a pivot
		//1-3. version 3 - median of three partitioning as a pivot
		//2. quick sort 구현
		
		//시간 측정 시작
		long start = System.currentTimeMillis();

		quickSort_version1(A, 0, A.length-1);
		
		for(int i=0; i<A.length;i++) {
			System.out.print(A[i]+" ");
		}

		//시간 측정 종료
		long end = System.currentTimeMillis();

		//실행시간 출력 함수
		System.out.println();
		System.out.println( "실행 시간 : " + (end - start)/1000.0);
	
	}
	
	//1-1. partition version 1 - last element as a pivot
	//p : 첫 번째 인덱스 : 0
	//r : 마지막 인덱스 : A.length-1
	public static int partition_ver1(int[] A, int p, int r) {
		
		//x : pivot
		int x = A[r];
		
		int i = p - 1;
		
		//pivot보다 값이 크면 실행 x
		//pivot보다 값이 작으면 자리 옮김
		//마지막 pivot 위치 return
		for(int j=p; j<r; j++) {
			if(A[j] <= x) {
				i += 1;
				
				//pivot보다 작은 값과 큰 값 자리 바꾸기
				if(i != j) {
					temp = A[j];
					A[j] = A[i];
					A[i] = temp; 
				}
			}
		}
		
		//루프가 끝나면 pivot을 마지막 위치 다음 위치 값과 바꿈
		temp = A[i+1];
		A[i+1] = A[r];
		A[r] = temp;
		
		//pivot이 있는 index 출력
		return i+1;
	}
	
	//2. quick sort 구현 
	public static void quickSort_version1(int[] A, int p, int r) {
		if(p<r) {
			int q = partition_ver1(A, p, r);
			quickSort_version1(A, p, q-1);
			quickSort_version1(A, q+1, r);
		}
	}
}
