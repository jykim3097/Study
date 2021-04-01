package _1_thread._5_quiz26;

import java.util.Random;

public class VoteThread implements Runnable{

	/*
	 * 쓰레드 객체는 3개가 생성되어야한다
	 * run	()메서드에서는 랜덤값을 이용해서 각 구의 개표진행사항을 화면에 출력한다
	 * StringBuffer를 이용해 출력
	 * 조건 : 개표율은 100%를 넘지 않는다
	 */

	StringBuffer sb = new StringBuffer();
	Random ran = new Random();

	@Override
	public void run() {

		int ratio = 0;
		String name = Thread.currentThread().getName();

		while(true) {

			int n = ran.nextInt(5)+1;
			ratio += n;

			if(ratio >100) {
				ratio = 100;
			}

			sb.append(name + "개표율" + ratio + "%:");
			for(int i=0; i<ratio; i++) {
				sb.append("*");
			}
			System.out.println(sb);

			if(ratio == 100) {
				System.out.println(name + "의 개표가 완료되었습니다");
				break;
			}
			sb.setLength(0);
		}
	}
}
