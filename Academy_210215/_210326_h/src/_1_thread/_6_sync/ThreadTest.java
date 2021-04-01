package _1_thread._6_sync;

public class ThreadTest implements Runnable {

	int num = 0;
	
	@Override
	public synchronized void run() {
		
		for(int i=1; i<=10; i++) {
			
			if(Thread.currentThread().getName().equals("A")) num++;
			
			System.out.println("쓰레드 이름: " + Thread.currentThread().getName() + ", " + num);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}

}
