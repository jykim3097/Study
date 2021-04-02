
public class _3_VariableScope { //변수의 범위
	
	public static void main(String[] args) {
		//Day01
		int num1 = 10;
		int num2 = 20;
		
		//같은 타입 변수는 한 줄에서 선언할 수도 있다.
		int n1 = 10, n2 = 20; 
		
		int num3;
		
		if(true) {
			num3 = num1 + num2;
		}
		
//		int num3 = 100;
//		System.out.println(num3); // 100
		System.out.println("num3 = " + num3); // num1 + num2 = 30
	
	}
}
