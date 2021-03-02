
public class _5_EnhancedForEx {
	public static void main(String[] args) {
		//Day04
		int[] arr = {1,2,3,4,5};
		
		//일반 for문
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("----------");
		
		//향상된 for문
		for(int i : arr) { // (값을 받을 변수 : 배열명)
			System.out.print(i+" "); //인덱스가 아니라 배열 요소를 출력
		}
		System.out.println();
		System.out.println("----------");
		
		String[] arr2 = {"월","화","수","목","금","토","일"};
		
		for(String i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("----------");
		
		//향상된 for문을 써서 평균과 합계를 구하여라
		int[] arr3 = {40,20,54,33,50}; 
		
		int sum = 0;
		for(int i : arr3) {
			sum+= i;
		}
		System.out.printf("합계 = %d, 평균 = %.2f", sum, (double)sum/arr3.length);
	}
}
