package _1_thread._3_ex01;

public class MainClass {

	public static void main(String[] args) {
		
		//객체 2개, 쓰레드 2개(각각 실행)
		
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		Thread test1 = new Thread(t1, "A"); //쓰레드 이름 A
		Thread test2 = new Thread(t2, "B"); //쓰레드 이름 B
		
		test1.start();
		test2.start();
		
		System.out.println("메인 스레드 종료");
	}
}
