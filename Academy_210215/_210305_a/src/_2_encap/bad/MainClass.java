package _2_encap.bad;

public class MainClass {
	public static void main(String[] args) {
		
		//멤버변수가 public으로 선언되면 잘못된 값이 저장되거나 
		//누구든지 사용을 할 수 있다는 문제가 있다.
		MyBirth me = new MyBirth();
		
		me.year = 1993;
		me.month = 3;
		me.day = 3;
		me.ssn = "??";
		
		me.info();
	}
}
