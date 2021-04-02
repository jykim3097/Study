
public class _2_OperatorEx01 {
	public static void main(String[] args) {
		//Day02
		//단항 연산자와 부호연산자(+,-)
		int i = +3;
		int j = -i;
		
		//증감 연산자 ++, -- (후위 연산)
		int k = 1;
		int h = k++; // 대입을 한 다음에 연산
		
		System.out.println("k의 값 : " + k);
		System.out.println("h의 값 : " + h + "\n");
		
		//전위 연산자
		int m = 1;
		int n = ++m; //연산을 한 다음에 대입
		
		System.out.println("m의 값 : " + m);
		System.out.println("n의 값 : " + n);
		
		System.out.println("---------------");
		
		int x = 1;
		int y = 1;
		
		System.out.println("x++를 하면 " + x++); //출력은 1, x = 2
		System.out.println("다음 ++x를 하면 " + ++x); //출력, x값 둘 다 3
		
		x = 10;
		y = 10;
		
		int result = (x++) + (++y) + 10;
		System.out.println("result의 값은 " + result); //31
	
		System.out.println("---------------");
		
		//예외
		x = 10;
		y = 10;
		
		int result2 = x++ + x++ + x++; //30 + 31 + 32
		System.out.println("result2의 값은 " + result2);
		
		System.out.println("---------------");
		
		// 보수란 더해서 0을 만드는 값, 컴퓨터는 덧셈밖에 못하니까 (+(-x))
		byte b = 10; // 0000 1010
		System.out.println("b의 값은 " + b + ", ~b의 값은 " + ~b);
		// ~b = 1111 0101
		// ~b는 b에서 숫자 0과 1만 바꿔준 값, 보수는 여기에 +1을 해줘야 함
		
		byte bc = (byte)(~b + 1); // bc : b의 보수
		System.out.println("b의 보수 값은 (~b + 1) = " + bc);
		
		byte b1 = (byte)(~bc + 1);
		System.out.println("bc의 보수는 " + b1 + " = b");		
		
		System.out.println("---------------");
		
		//논리 반전 연산자 ! - 부정
		boolean bool1 = true;
		System.out.println("!bool1 의 값은 " + !bool1); //f
		System.out.println("!false 의 값은 " + !false); //t
		
	}	
}
