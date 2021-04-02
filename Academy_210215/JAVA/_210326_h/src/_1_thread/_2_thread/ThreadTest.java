package _1_thread._2_thread;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		System.out.println("현재 쓰레드 이름 : " + getName()); //클래스를 상속받았기 때문에 사용가능
		System.out.println("쓰레드 시작");
		
		for(int i=0; i<=10; i++) {
			System.out.print (i + " ");
			try {
				sleep(1000); //클래스를 상속받았기 때문에 사용가능
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
}
