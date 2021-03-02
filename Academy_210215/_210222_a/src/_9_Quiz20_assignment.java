

public class _9_Quiz20_assignment {
	public static void main(String[] args) {
		
		//Day04
		
		//구구단 2단~9단까지 세로로 출력
		//줄맞춤 - 서식 문자 \t
		//8칸 범위 띄어쓰기
		//바깥 증감이 3씩 증가 1,4,7
		
		for(int i=1; i<10; i++) {
			for( int j=1; j<10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
}
