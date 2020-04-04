package algorithm_PA;

import algorithm_PA.MakeRandomArray;

public class InsertionSort {
	
	//32칸짜리 배열 생성 
	static int[] A = MakeRandomArray.randomeArray(1024);
	
	public static void main(String[] args) {
		
		//시간 측정 시작
		long start = System.currentTimeMillis();
						
		insertionSort(A);
		
		//시간 측정 종료
		long end = System.currentTimeMillis();
		
		//실행시간 출력 함수
		System.out.println();
		System.out.println( "실행 시간 : " + (end - start)/1000.0);
	}

	public static void insertionSort(int[] A) {
		
		for(int i=1;i<A.length;i++) { //두 번째 값부터 시작
			int key = A[i]; 
			int j = i-1;
			while(j>=0 && A[j]>key) { //key 값과 key 값보다 앞에 있는 값을 모두 비교
				A[j+1] = A[j];
				j = j-1;
			}
			A[j+1] = key; //key 값보다 큰 값을 다 옮겼으면 key 값을 그 앞에 옮김
		}
		
		//정렬된 배열 출력 함수
		System.out.print("Insertion Sort: ");
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
}
