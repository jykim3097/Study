
public class number5 {

	static int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
	static int k = 3;
	
	public static void main(String[] args) {
		int cnt = 0; // 몇 명이 건넜냐
		
		while(true) {
			if(zeroCheck()>k) {
				System.out.println(cnt);
				break;
			}
			
			else {
				for(int i = 0; i<stones.length;i++) {
					if(stones[i] > 0) {
						stones[i]--;
					}
				}
				cnt++;
			}
			
			for(int i=0; i<stones.length; i++) {
				System.out.println(stones[i]);
			}
		}
	}

	//연속된 0의 갯수 세기
	public static int zeroCheck() {
		int count=1;
		
		for(int i=0; i<stones.length; i++) {
			if( i == stones.length-1)
				break;
			if(stones[i] == stones[i+1])
				count++;
		}
		return count;
	}
}
