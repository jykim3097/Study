

public class _5_Quiz17 {
	public static void main(String[] args) {
		//Day04
		//for문으로 해결
		//1. 7~100까지 정수 중에 7의 배수를 가로로 출력 (증감식을 7씩 증가)
		System.out.print("1번: ");
		for(int i=7; i<101; i+=7) {
			System.out.print(i + " ");
		} 
		System.out.println();
		
		//2. 1~100까지 12의 배수를 가로로 출력
		System.out.print("2번: ");
		for(int i=1; i<101; i++) {
			if(i%12 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//3. 1~200까지 정수 중에 9의 배수의 개수
		int cnt = 0;
		for(int i=1; i<201; i++) {
			if(i%9 == 0) {
				cnt++;
			}
		}
		System.out.println("3번: "+cnt);
		
		//4. 50~100까지 두 수 사이의 합
		int sum=0;
		for(int i=50; i<101; i++) {
			sum += i;
		}
		System.out.println("4번: "+sum);
		
		//5. A~Z까지 가로로 출력 (A의 유니코드 65, Z유니코드 90)
		System.out.print("5번: ");
		for(int i=65; i<91; i++) {
			System.out.print((char)i + " ");
		}
	}
}
