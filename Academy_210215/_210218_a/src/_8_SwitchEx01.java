
public class _8_SwitchEx01 {
	public static void main(String[] args) {
		//Day03
		int a = 2;
		
		//switch 구문의 소괄호에는 변수나 변수의 대한 연산식이 들어감
		switch(a) {
		
		case 1:
			System.out.println("1입니다");
			break; // 가장 가까운 중괄호를 빠져나간다. (switch구문 빠져나감)
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		default :
			System.out.println("1~3이 아닙니다.");
			break;
		}
	}
}
