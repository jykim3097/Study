package _1_thread._4_quiz25;

public class Downlaod extends Thread{

	@Override
	public void run() {
		System.out.print("동영상을 다운로드합니다:");
		
		for(int i=0; i<10; i++) {
			System.out.print("*");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n다운로드가 완료되었습니다.");
	}
}
