package _1_thread._3_ex01;

public class MainClass2 {

	public static void main(String[] args) {
		
		//객체 1개, 스레드 n개(1개의 객체를 실행)
		//각자 실행되지만 객체 하나를 공유하기 때문에 값은 같다
		
		ThreadTest t = new ThreadTest();
		
		Thread test1 = new Thread(t, "A"); 
		Thread test2 = new Thread(t, "B");
		
		test1.start();
		test2.start();
		
		System.out.println("메인 쓰레드 종료");
		
	}
}
