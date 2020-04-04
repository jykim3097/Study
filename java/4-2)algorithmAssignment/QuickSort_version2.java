package algorithm_PA;

import algorithm_PA.QuickSort_version1;
import java.util.Random;

public class QuickSort_version2 {
	
	static int[] A = InsertionSort.A;
	static int temp = QuickSort_version1.temp;
	
	public static void main(String[] args) {
		
		//�ð� ���� ����
		long start = System.currentTimeMillis();

		quickSort_version2(A, 0, A.length-1);
		
		for(int i=0; i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		
		//�ð� ���� ����
		long end = System.currentTimeMillis();

		//����ð� ��� �Լ�
		System.out.println();
		System.out.println( "���� �ð� : " + (end - start)/1000.0);
	}
	
	//1-2. partition version 2 - random number as a pivot
	public static int partition_ver2(int[] A, int p, int r) {
		
		//���� �Լ��� ���� p~r ������ ���� �������� ����
		//p���� ��� ���ϹǷ� ������ �� ������ �־���Ѵ�
		//�ּ� p���� �ִ� r-p+1����
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
