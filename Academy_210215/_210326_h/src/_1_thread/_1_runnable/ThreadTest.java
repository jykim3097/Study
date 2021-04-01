package _1_thread._1_runnable;

public class ThreadTest implements Runnable {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
		System.out.println("쓰레드 시작");
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
			try { //1000밀리초 = 1초
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
