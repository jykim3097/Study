
public class _1_DoWhileEx {
	public static void main(String[] args) {
		//Day04
		/*
		 * do~while문은 조건을 마지막에 검사하기 때문에, false여도 한번은 실행이 된다.
		 * 그 이후부터는 while문과 동일하다.
		 */
		
		//while문 - 1~10까지의 합
		
		int i = 0;
		int sum = 0;
		
		while(i<10) {
			sum += ++i;
		}
		
		System.out.println("1부터 10까지의 합 : " + sum);
		
		//do-while문
		
		int k = 0;
		int sum2 =0;
		
		do {
			sum2 += ++k;
		}while(k<10);
		
		System.out.println("1부터 10까지의 합 : " + sum2);
		
	}
}
