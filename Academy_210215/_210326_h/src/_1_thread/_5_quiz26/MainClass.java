package _1_thread._5_quiz26;

public class MainClass {
	
	public static void main(String[] args) {
		
//		VoteThread t1 = new VoteThread();
//		VoteThread t2 = new VoteThread();
//		VoteThread t3 = new VoteThread();
		
//		VoteThread_t t1 = new VoteThread_t();
//		VoteThread_t t2 = new VoteThread_t();
//		VoteThread_t t3 = new VoteThread_t();	
		
		VoteThreadReview t1 = new VoteThreadReview();
		VoteThreadReview t2 = new VoteThreadReview();
		VoteThreadReview t3 = new VoteThreadReview();
		
		Thread loc1 = new Thread(t1, "Location1");
		Thread loc2 = new Thread(t2, "Location2");
		Thread loc3 = new Thread(t3, "Location3");
		
		loc1.start();
		loc2.start();
		loc3.start();
	}

}
