package _1_thread._3_ex01;

public class ThreadTest implements Runnable {

	int num = 0; //멤버변수
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			
			if(Thread.currentThread().getName().equals("A")) { //A쓰레드라면
				System.out.println("---------------------");
				num++;
			}
			
			System.out.println("쓰레드명:" + Thread.currentThread().getName() + ", num : " + num);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
