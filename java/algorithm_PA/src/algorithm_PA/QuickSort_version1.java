package algorithm_PA;

public class QuickSort_version1 {

	static int[] A = InsertionSort.A;
	static int temp = -1;
	
	public static void main(String[] args) {
		//1. partition �Լ� ����
		//1-1. version 1 - first or last element as a pivot
		//1-2. version 2 - random number as a pivot
		//1-3. version 3 - median of three partitioning as a pivot
		//2. quick sort ����
		
		//�ð� ���� ����
		long start = System.currentTimeMillis();

		quickSort_version1(A, 0, A.length-1);
		
		for(int i=0; i<A.length;i++) {
			System.out.print(A[i]+" ");
		}

		//�ð� ���� ����
		long end = System.currentTimeMillis();

		//����ð� ��� �Լ�
		System.out.println();
		System.out.println( "���� �ð� : " + (end - start)/1000.0);
	
	}
	
	//1-1. partition version 1 - last element as a pivot
	//p : ù ��° �ε��� : 0
	//r : ������ �ε��� : A.length-1
	public static int partition_ver1(int[] A, int p, int r) {
		
		//x : pivot
		int x = A[r];
		
		int i = p - 1;
		
		//pivot���� ���� ũ�� ���� x
		//pivot���� ���� ������ �ڸ� �ű�
		//������ pivot ��ġ return
		for(int j=p; j<r; j++) {
			if(A[j] <= x) {
				i += 1;
				
				//pivot���� ���� ���� ū �� �ڸ� �ٲٱ�
				if(i != j) {
					temp = A[j];
					A[j] = A[i];
					A[i] = temp; 
				}
			}
		}
		
		//������ ������ pivot�� ������ ��ġ ���� ��ġ ���� �ٲ�
		temp = A[i+1];
		A[i+1] = A[r];
		A[r] = temp;
		
		//pivot�� �ִ� index ���
		return i+1;
	}
	
	//2. quick sort ���� 
	public static void quickSort_version1(int[] A, int p, int r) {
		if(p<r) {
			int q = partition_ver1(A, p, r);
			quickSort_version1(A, p, q-1);
			quickSort_version1(A, q+1, r);
		}
	}
}
