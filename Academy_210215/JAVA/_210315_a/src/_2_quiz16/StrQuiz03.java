package _2_quiz16;

import java.util.Scanner;

public class StrQuiz03 {

	public static void main(String[] args) {
		
		//실제 코딩테스트 문제
		/*
		 * 자연수의 자리수 합 구하기
		 * 자연수 n이 주어지면 n의 각 자리수의 합을 구해서 return하는 메서드를 작성
		 * 
		 * 조건
		 * n은 1억 이하의 자연수
		 * n을 자료형 변환해서 연산하면 안된다. - String 이용 불가
		 * String을 이용해서 test01 메서드
		 * String을 이욯하지 않고 test02 메서드
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("test01: "+test01(n));
		System.out.println("test02: "+test02(n));
		
	}
	
	//남이 봐도 이해하기 쉽게끔! 
	public static int test01(int n) {
		int sum = 0;
		
		String str = String.valueOf(n);
		for(int i=0; i<str.length(); i++) {
			//sum += (int)(str.charAt(i))-48;
			sum += Integer.parseInt(str.charAt(i)+ "");
		}
		return sum;
	}
	
	public static int test02(int n) {
		
//		int len = (int)(Math.log10(n))+1;
//		int sum = n % 10;
//		for(int i=1; i<len; i++) {
//			sum += (n / Math.pow(10, len-i)) % 10;
//		}
		
		//쌤 방법
		int sum = 0;
		for(int i= 100000000; i >=1; i/=10) {
			sum += ( n / i ); //몫
			//n -= ( n / i ) * i;
			n %= i;
		}
		
		return sum;
	}
}
