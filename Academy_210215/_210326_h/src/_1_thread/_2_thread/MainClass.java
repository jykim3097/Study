package _1_thread._2_thread;

public class MainClass {

	public static void main(String[] args) {
		
		//Thread 클래스를 상속받아서 사용하는 방법
		ThreadTest t = new ThreadTest();
		t.setName("쓰레드1");
		t.start();
		
		System.out.println("메인쓰레드 종료");
	}
}
