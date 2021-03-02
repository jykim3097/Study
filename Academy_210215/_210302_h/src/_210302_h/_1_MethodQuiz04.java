package _210302_h;

import java.util.Arrays;

public class _1_MethodQuiz04 {
	public static void main(String[] args) {

		//배열의 정렬
		int[] arr = {5,4,3,2,1};
		int[] arr2 = {5,3,4,1,2};

		Arrays.sort(arr);
		Arrays.sort(arr2);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println();

		//배열의 비교 (배열의 내부 요소가 동일하면 true 반환)
		System.out.println(Arrays.equals(arr, arr2));
		System.out.println();
		
		System.out.println("Quiz22");
		int[] iArr = lottoNum();
		long money = lottoRun(iArr);
		System.out.println("당첨되기까지 사용한 금액: "+money+"원");
	}
	
	//Quiz22
	static int[] lottoNum() {

		int[] numList = new int[6];
		
		//내 코드 - 중복 검사 안함..
		for(int i=0; i<numList.length; i++) {
			numList[i] = (int)(Math.random()*45)+1;
		}

		return numList;
	}

	static long lottoRun(int[] arr) {
		
		long money = 0;
		int cnt = 0;
		
		while(true) {
			
			//새 배열 생성
			int[] lotto = new int[6];
			
			//로또 번호 추첨
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45)+1;
			}
			
			Arrays.sort(arr);
			Arrays.sort(lotto);

			if(Arrays.equals(arr, lotto)) {
				break;
			} else {
				cnt++;
			}
		}
		
		money = cnt * 1000l;
		
		return money;
	}
}
