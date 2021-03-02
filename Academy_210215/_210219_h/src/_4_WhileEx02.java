import java.util.Scanner;

public class _4_WhileEx02 {
	public static void main(String[] args) {
		//Day03
		//입력받은 값까지의 짝수의 개수를 확인
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력> ");
		int num = scan.nextInt();
		
		int cnt = 0;
		int i = 1;
		while(i <= num) {
			if(i%2==0) {
				cnt++;
			}
			i++;
		}
		
		System.out.println("짝수의 개수는 "+cnt+"개");
		
		scan.close();
	}
}
