package basic;

public class _2_ContinueEx01 {
	public static void main(String[] args) {
		//Day04
		
		/*
		 * Continue
		 * 조건문과 함께 사용하고, 
		 * 실행하다가 코드가 continue와 만나면
		 * 반복문의 다음으로 이동시킨다
		 */
		
		for(int i = 1; i<=10; i++) {
			if(i % 2 == 0) {
				continue; // 아래를 실행하지 않고 바로 i++가 된다
			}
			System.out.println(i);
		}
		
		System.out.println("---");
		
		int i = 1;
		while(i <= 10) {
			
			if(i%2==0) {
				i++;
				continue;
			}
			
			System.out.println(i);
			i++;
		}
		
	}
}
