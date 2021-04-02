import java.util.Scanner;

public class _6_WhileEx03 {
	public static void main(String[] args) {
		//Day03
		//어떤 값에 대한 검증. (조건 형태가 여러가지일 수 있다.)
		//입력받은 수가 소수인지 아닌지 검증
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력> ");
		int num = scan.nextInt();
		
		int i=2;
		while(num % i !=0) {
			
			i++;
		}
		
		System.out.println(num == i ? "소수" : "소수가 아니다");
		
		scan.close();
	}
}
