package bj1000;

import java.util.Scanner;

public class bj1000 {

	//1000 -> a+b
	//1001 -> a-b
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("���� �ΰ��� �Է��ϼ���.(0 < A, B < 10)");
		//�������� �ڵ尡 ���� ������ ��
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		//0 < A, B < 10
		if(a > 0 && b < 10) 
		{
			System.out.println(a+b);
			//System.out.println(a-b);
		}
	}
}
