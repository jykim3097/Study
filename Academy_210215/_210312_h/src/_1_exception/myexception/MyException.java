package _1_exception.myexception;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	//사용자 정의 예외는 Exception 클래스를 상속받아서 예외클래스로 사용한다.
	//일반적으로 기본생성자, 예외메세지를 받아서 저장해주는 생성자 2개를 만든다.
	public MyException() {
		
	}
	
	public MyException(String message) {
		super(message);
	}
	
	//필요한 사용자 정의 메서드
	public String errorMessage() {
		return this.getMessage();
	}
}
