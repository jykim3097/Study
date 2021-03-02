
public class _6_BreakEx01 {
	public static void main(String[] args) {
		//Day04
		/*
		 * 무한 반복문 - 정확히 반복 횟수를 모를 때 사용하고,
		 * 특정 조건에서 반복문을 종료시키는 형태로 사용한다.
		 */
		
		int i =1;
		while(true) {
			System.out.println(i);
			
			if(i == 15) break;
			
			i++;
		}
	}
}
