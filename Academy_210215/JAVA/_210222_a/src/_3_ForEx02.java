import java.util.Scanner;

public class _3_ForEx02 {
	public static void main(String[] args) {
		//Day04
		//정수를 입력받아서 소수인지 판별
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력> ");
		int num = scan.nextInt();
		
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num % i == 0) { // num의 약수
				count++;
			}
		}
		
		System.out.println(count);
		
		scan.close();
	}
}
