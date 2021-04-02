
public class _4_OperatorEx03 {
	public static void main(String[] args) {
		//Day02
		
		int x = 10, y = 20;
		
		// 논리연산자 &, |
		if( x == 10 & ++y == 21) { //true & true = true
			System.out.print("True"); 
		} else {
			System.out.print("False");
		}
		
		System.out.println(", x의 값은 " + x + "이고, y의 값은 " + y);
		
		if(x == 10 | ++y == 21) { // true & false = true
			System.out.print("True");
		} else {
			System.out.print("False");
		}
		
		System.out.println(", x의 값은 " + x + "이고, y의 값은 " + y + "\n");
		
		// 논리연산자 &&, ||
		x = 10;
		y = 20;
		
		if( x == 10 && ++y == 21) { // 앞이 true여서 뒤에 값을 실행하지 않음
			System.out.print("True");
		} else {
			System.out.print("False");
		}
		
		System.out.println(", x의 값은 " + x + "이고, y의 값은 " + y);
		
		if(x == 10 || ++y == 21) { // 앞이 true여서 뒤에 값을 실행하지 않음
			System.out.print("True");
		} else {
			System.out.print("False");
		}
		
		System.out.println(", x의 값은 " + x + "이고, y의 값은 " + y);
		
	}
}
