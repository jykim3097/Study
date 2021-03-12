package _1_exception.myexception;

public class MainClass {

	public static void main(String[] args) {
		
		_1_Account ac = new _1_Account("홍길동", "1234", 100000);
		ac.deposit(5000);
		
		System.out.println(ac.getBalance());
		
		try {
			ac.withDraw(500000);			
			System.out.println(ac.getBalance());
		} catch (MyException m) {
			//MyException에서 정의한 메서드
			System.out.println(m.errorMessage());
		}
		
		
	}
}
