package _210302_h;

import java.util.Arrays;

public class _2_MethodQuiz04_t {
	public static void main(String[] args) {
		
		int[] arr = lottoNum();
		long money = lottoRun(arr);
		System.out.println("당첨되기까지 사용한 금액: "+ money);
	}
	
	static int[] lottoNum() {
		int[] arr = new int[6];
		int index = 0;
		
		start:while(true) {
			int num = (int)(Math.random()*45)+1;
			
			//중복검사
			for(int i=0; i<index; i++) {
				if(num == arr[i]) continue start;
			}
			
			arr[index] = num;
			index++;
			
			if(index == arr.length) break;
		}
		
		Arrays.sort(arr);
		return arr;
	}
	
	static long lottoRun(int[] arr) {
		
		int cnt = 0;
		while(true) {
			
			//로또 번호 추첨
			int[] lotto = lottoNum();
			
			if(Arrays.equals(arr, lotto)) {
				return cnt *1000l;
			} else {
				cnt++;
			}
		}
	}
}
