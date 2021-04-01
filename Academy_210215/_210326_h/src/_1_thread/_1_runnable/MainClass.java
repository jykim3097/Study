package _1_thread._1_runnable;

public class MainClass {

	public static void main(String[] args) {
		
		//Runnable 인터페이스를 상속하는 방법
		//쓰레드 클래스의 생성자 매개변수로 Runnable 인터페이스를 구현하는 클래스 전달
		
		ThreadTest test = new ThreadTest();
		Thread t = new Thread(test, "쓰레드1"); // 매개변수로 러너블 객체가 들어갈 수 있다
		t.start();
		
		System.out.println("메인쓰레드 종료");
		
	}
}
