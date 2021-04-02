import java.util.Arrays;

public class _4_Quiz23 {
	public static void main(String[] args) {
		//Day04
		//선택정렬 - 오름차순 정렬 - 가장 작은 수를 앞으로 땡겨온다.
		//기준 숫자와 그 숫자보다 인덱스가 큰 나머지 수와 비교
		int[] arr = {23,5,1,43,100,200,40};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i] > arr[j]) { //부등호 방향만 바꾸면 내림차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

		//버블정렬 - 오름 차순 - 큰 숫자를 뒤로 밀어냄
		//두개씩 비교해서 큰 숫자를 뒤로 민다.
		int[] ar = {26,16,5,99,65};
		
		for(int i=0; i<ar.length-1; i++) { //회전수
			for(int j=0; j<ar.length-i-1; j++) {
				if (ar[j] > ar[j+1]) { //부등호 방향만 바꾸면 내림차순
					int tmp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = tmp;
				}				
			}
		}
		System.out.println(Arrays.toString(ar));
		
	}
}
