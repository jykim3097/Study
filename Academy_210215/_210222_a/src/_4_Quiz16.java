

public class _4_Quiz16 {
	public static void main(String[] args) {
		//Day04
		//Math.random() 을 사용해서 2~9까지 랜덤변수를 만들고, 구구단을 세로로 출력
		
		int n = (int)(Math.random()*8)+2;
		
		System.out.println("구구단 "+n+"단");
		
		for(int i=1; i<10;i++) {
			System.out.printf("%d X %d = %d\n", n, i, n*i);
		}
	}
}
