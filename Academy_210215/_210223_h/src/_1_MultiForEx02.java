
public class _1_MultiForEx02 {
	public static void main(String[] args) {
		//Day04
		/*중첩반복문에서 조건이 변경되는 형태
		 * 
		 * 별 모양
		 *  
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----");
		
		for(int i=0; i<5; i++) {
			for(int j=5-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------");
		
		/*
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 * 
		 * 바깥반복분 - 행
		 * 내부반복문 - 공백용도, 출력용도
		 */
		
		for(int i=0; i<5; i++) {
			for(int j=5-i; j>1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
