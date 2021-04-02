package _1_thread._4_quiz25;

public class Video extends Thread{

	@Override
	public void run() {
		System.out.println("음악을 15초간 재생합니다.");
		
		for(int i=0; i<15; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("음악 재생이 끝났습니다.");
	}
}
