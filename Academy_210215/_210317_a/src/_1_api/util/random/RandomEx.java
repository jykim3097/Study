package _1_api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		double r1 = ran.nextDouble();
		System.out.println(r1); // 0~1미만 랜덤 수
		
		int r2 = ran.nextInt();
		System.out.println(r2);
		
		int r3 = ran.nextInt(10); // 0~10미만
		System.out.println(r3);
		
		int r4 = ran.nextInt(10)+1; // 1~10
		System.out.println(r4);
		
	}
}
