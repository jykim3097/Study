package algorithm_PA;

import algorithm_PA.MakeRandomArray;

public class InsertionSort {
	
	//32ĭ¥�� �迭 ���� 
	static int[] A = MakeRandomArray.randomeArray(1024);
	
	public static void main(String[] args) {
		
		//�ð� ���� ����
		long start = System.currentTimeMillis();
						
		insertionSort(A);
		
		//�ð� ���� ����
		long end = System.currentTimeMillis();
		
		//����ð� ��� �Լ�
		System.out.println();
		System.out.println( "���� �ð� : " + (end - start)/1000.0);
	}

	public static void insertionSort(int[] A) {
		
		for(int i=1;i<A.length;i++) { //�� ��° ������ ����
			int key = A[i]; 
			int j = i-1;
			while(j>=0 && A[j]>key) { //key ���� key ������ �տ� �ִ� ���� ��� ��
				A[j+1] = A[j];
				j = j-1;
			}
			A[j+1] = key; //key ������ ū ���� �� �Ű����� key ���� �� �տ� �ű�
		}
		
		//���ĵ� �迭 ��� �Լ�
		System.out.print("Insertion Sort: ");
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
}
