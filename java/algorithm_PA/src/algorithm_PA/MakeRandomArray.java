package algorithm_PA;

import java.util.Random;

public class MakeRandomArray {
	
	public static int[] randomeArray(int n) {
		
		int[] A = new int[n];
		
		Random random = new Random();
		for(int i=0; i<A.length; i++) {
			A[i] = random.nextInt(10000);
		}
		
		return A;
	}
	
}
