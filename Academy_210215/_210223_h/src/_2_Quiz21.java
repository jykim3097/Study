import java.util.Scanner;

public class _2_Quiz21 {
	public static void main(String[] args) {
		//Day04
		/*
		 * 가로, 세로를 스캐너를 통해 입력받는다.
		 * 가로길이, 세로길이 만큼 사각형을 출력
		 * 단 윤곽만 나타나면됨
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로>");
		int n = scan.nextInt();
		System.out.print("세로>");
		int m = scan.nextInt();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || i==m-1) {
					System.out.print("*");
				} else {
					if(j==0 || j==n-1) {						
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
		
		scan.close();
	}
}
