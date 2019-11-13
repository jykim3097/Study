package algorithm_PA;

public class HeapSort_MaxHeap {

	static int[] A = {7,6,4,2,10,11,12,5,1,15,9};
	static int heap_size = A.length;
	
	public static void main(String[] args) {
		//0. Unsorted array
		//1. Max Heapify - recurrence
		//2. Build Max Heap
		
		int tempM = -1;
		
		buildMaxHeap(A);
		
		for (int i=A.length-1;i>=0;i--) {
			System.out.print(A[0] + " ");
			tempM = A[0];
			A[0] = A[i];
			A[i] = tempM;
			
			heap_size = heap_size - 1;
			maxHeapify(A, 0);
		}
	} 

	public static void maxHeapify(int[] list, int i) {
		int l = 2*i+1;
		int r = 2*i+2;
		int largest = -1;
		int temp = -1;
		
		if(l<heap_size && list[l]>list[i]) {
			largest = l;
		}else {
			largest = i;
		}
		
		if(r<heap_size && list[r]>list[largest]) {
			largest = r;
		}
		
		if(largest != i) {
			temp = list[i];
			list[i] = list[largest];
			list[largest] = temp;
			
			maxHeapify(list, largest);
		}
	}
	
	public static void buildMaxHeap(int[] list) {
		for(int i = heap_size/2-1; i>=0 ; i--) {
			maxHeapify(list, i);
		}
	}
}
