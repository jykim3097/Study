package _1_thread._5_quiz26;

import java.util.Random;

public class VoteThread_t extends Thread{

	int num = 0;
	Random ran = new Random();
	StringBuffer sb = new StringBuffer();

	@Override
	public void run() {

		String name = Thread.currentThread().getName();
		while(true) {
			int r = ran.nextInt(10) + 1;
			num += r;

			if(num >= 100) {
				sb.delete(0, num);
				num = 100;
				for(int i= 1; i<= num; i++) {
					sb.append("*");
				}

				System.out.println(name+"개표율:" + num + "%" + sb.toString());
				System.out.println(name+"의 개표가 완료되었습니다.");
				
				break; //탈출
			} else {
				for(int i= 1; i<=r; i++) {
					sb.append("*");
				}

				System.out.println(name+"개표율:" + num + "%" + sb.toString());
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
