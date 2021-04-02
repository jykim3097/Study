
public class _9_WhileEX05 {
	public static void main(String[] args) {
		//Day03
		//배열에 순차적인 접근은 0에서 길이 미만까지 반복문을 돈다.
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int i =0 ;
		int sum = 0;
		while ( i < arr.length) {
			sum += arr[i]; //배열 요소의 누적
			i++;
		}
		
		System.out.println(sum);
	}
}
