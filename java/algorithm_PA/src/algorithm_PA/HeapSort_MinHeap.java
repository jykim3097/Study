package algorithm_PA;

public class HeapSort_MinHeap {
	
	static int[] A = InsertionSort.A;
	static int heap_size = A.length;
	
	public static void main(String[] args) {
		//0. Unsorted array
		//1. Min Heapify
		//2. Build Min Heap
		
		//시간 측정 시작
		long start = System.currentTimeMillis();

		heapSort(A);
		
		//시간 측정 종료
		long end = System.currentTimeMillis();
		
		//실행시간 출력 함수
		System.out.println();
		System.out.println( "실행 시간 : " + (end - start)/1000.0);
	}
	
	public static void heapSort(int[] A) {
		
		int tempM = -1;
		
		buildMinHeap(A);
		
		for (int i=A.length-1;i>=0;i--) {
			
			//출력
			System.out.print(A[0] + " ");
			
			tempM = A[0];
			A[0] = A[i];
			A[i] = tempM;
			
			heap_size = heap_size - 1;
			minHeapify(A, 0);
		}
	}
	
	public static void minHeapify(int[] list, int i) {
		int l = 2*i+1;
		int r = 2*i+2;
		int smallist = -1;
		int temp = -1;
		
		if(l<heap_size && list[l]<list[i]) {
			smallist = l;
		}else {
			smallist = i;
		}
		
		if(r<heap_size && list[r]<list[smallist]) {
			smallist = r;
		}
		
		if(smallist != i) {
			temp = list[i];
			list[i] = list[smallist];
			list[smallist] = temp;
			
			minHeapify(list, smallist);
		}
	}
	
	public static void buildMinHeap(int[] list) {
		for(int i = heap_size/2-1; i>=0 ; i--) {
			minHeapify(list, i);
		}
	}
}
