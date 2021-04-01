package _1_thread._6_sync;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//객체를 한 번에 두번 쓴다는 건 상당히 위험함
		ThreadTest t = new ThreadTest();
		
		Thread test1 = new Thread(t, "A");
		Thread test2 = new Thread(t, "B");
		
		test1.start();
		test2.start();
		

	}
}
