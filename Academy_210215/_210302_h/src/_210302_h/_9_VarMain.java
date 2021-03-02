package _210302_h;

public class _9_VarMain {
	public static void main(String[] args) {
		
		_8_Variable var = new _8_Variable();
		
		System.out.println("멤버변수: " + var.a +" (초기화 전)");
		var.a = 1000;
		var.printNumber(5);
	}
}
