

import java.util.Arrays;

public class _7_Quiz19 {
	public static void main(String[] args) {
		//Day04
		/*
		 * arr에서 절대 값이 중복되지 않게 추출된 3개의 값을 새로운 배열로 옮겨담고
		 * 배열의 길이만큼 회전하고 랜덤요소를 0,1,2 인덱스로 옮긴다.
		 */
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int[] temp = new int[3];
		
		for(int i=0; i<temp.length; i++) {
			int index = (int)(Math.random()*(arr.length));
			temp[i] = index;
			
			//중복된 index 값 제거
			for(int j=0; j<i; j++) {
				if(temp[i] == temp[j]) {
					i--;
				}
			}
		}
		
		int tmp = 0;
		for(int i=0; i<temp.length; i++) {
			tmp = arr[i];
			arr[i] = arr[temp[i]];
			arr[temp[i]] = tmp;
		}
		
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("---------------------------");
		
		
		//쌤 힌트로
		int[] arrT = {1,2,3,4,5,6,7,8,9};
		int[] newArr = new int[3];
		
		for(int i=0; i< arrT.length; i++) {
			int r = (int)(Math.random()*arrT.length);
			
			//값을 바로 바꿔버리니까 중복이 생기지 않는다.
			int t = arrT[i];
			arrT[i] = arrT[r];
			arrT[r] = t;
			
		}
		
		for(int i=0; i<newArr.length; i++) {
			newArr[i] = arrT[i];
		}
		
		System.out.println(Arrays.toString(arrT));
		System.out.println(Arrays.toString(newArr));
	}
}
