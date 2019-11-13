package bj15650;
import java.util.Scanner;

public class bj15650 {
	public static void main(String[] args) {
		
		int n,m;
		Scanner scan = new Scanner(System.in);

		System.out.println("1<=m<=n<=8 범위의 숫자를 입력하세요");
		
		n = scan.nextInt();
		m = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=i+1; j<=n; j++) {
				System.out.println(i);
			}
		}
		
	}
}