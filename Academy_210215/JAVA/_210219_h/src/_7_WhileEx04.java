import java.util.Scanner;

public class _7_WhileEx04 {
	public static void main(String[] args) {
		//Day03
		//10번 숫자를 입력 받고, 입력받은 값들의 합
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력> ");
		
		int i=0;
		int sum = 0;
		
		while(i<10) {
			int n = scan.nextInt();
			sum +=n;
			i++;
		}
		
		System.out.println(sum);
		
		scan.close();
	}
}
