package bj1000;

import java.util.Scanner;

public class bj1000 {

	//1000 -> a+b
	//1001 -> a-b
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("숫자 두개를 입력하세요.(0 < A, B < 10)");
		//쓸데없는 코드가 들어가면 에러가 뜸
		
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
