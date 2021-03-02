

import java.util.Scanner;

public class _4_Quiz05 {
	public static void main(String[] args) {
		//정수 2개를 입력받아서 어떤 값이 큰수인지 출력, 만약 같은수라면 "같은수입니다" 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		int a = scan.nextInt();
		
		System.out.print(">");
		int b = scan.nextInt();
		
		if(a==b) {
			System.out.println("같은 수 입니다.");
		} else if (a > b){
			System.out.println("더 큰 수는 " + a);
		} else {
			System.out.println("더 큰 수는 " + b);
		}
		
		//if문은 삼항연산자로도 표현할 수 있다.
		String result = a==b ? "같은 수 입니다." : (a>b? "더 큰 수는 " + a : "더 큰 수는 " + b);
		System.out.println(result);
		
		scan.close();
	}
}
