package algorithm_PA;

public class MergeSort {

	static int[] A = InsertionSort.A;
	static int BIG_INTEGER = 999999999;
	
	public static void main(String[] args) {
		//1. MergeSort - ��������� �ɰ��� �Լ�(Divide)
		//2. Merge - ����

		printMergeSort();
			
	}

	public static void printMergeSort() {
		
		//�ð� ���� ����
		long start = System.currentTimeMillis();

		mergeSort(A,0,A.length-1);
			
		System.out.print("MergeSort: ");
		for(int a=0;a<A.length; a++) {
			System.out.print(A[a]+" ");
		}
		
		//�ð� ���� ����
		long end = System.currentTimeMillis();

		//����ð� ��� �Լ�
		System.out.println();
		System.out.println();
		System.out.println( "���� �ð� : " + (end - start)/1000.0);
	}
	
	//p: �迭 ���� �ε���
	//r: �迭 �� �ε���
	public static void mergeSort(int[] A, int p, int r) {
		if(p<r) {
			//q: �迭 ũ�⸦ 1/2�� ���� �ε���
			int q = (p+r)/2;
			
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
	}
	
	public static void merge(int[] A, int p, int q, int r) {
		
		int i, j;
		 
		int l_size = q-p+1;
		int r_size = r-q;
		
		//�� ĭ ��� �迭 ����
		int[] L = new int[l_size+1];
		int[] R = new int[r_size+1];
		
		for(i=0;i<l_size;i++) {
			L[i] = A[p+i];
		}
		
		for(j=0; j<r_size;j++) {
			R[j] = A[q+j+1];
		}
		
		L[l_size] = BIG_INTEGER;
		R[r_size] = BIG_INTEGER;
		
		i = 0;
		j = 0;
		
		for(int k=p;k<=r;k++) {
			if(L[i] <= R[j]) {
				A[k] = L[i];
				i += 1;
			} else {
				A[k] = R[j];
				j += 1;
			}
		}
	}
}
