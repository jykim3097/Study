
public class _7_OperatorCondition {
	public static void main(String[] args) {
		//Day02
		/*
		 *  Math.random() - double 형태의 0.0 이상 ~ 1.0 미만의 랜덤 수
		 */
		System.out.println("0.0 이상 1.0 미만의 랜덤한 수 : " + Math.random());
		System.out.println("0 이상 10 미만의 랜덤한 수 : " +(int)(Math.random()*10));
		System.out.println("1 이상 10이상의 랜덤한 수 : " +(int)(Math.random()*10 + 1));
		
		int r = (int) (Math.random()*10 + 1);
		System.out.println("r = " + r);
		
		//삼항 연산식 (조건 ? 연산 1 : 연산 2 )
		String result = r%2 == 0 ? "짝수" : "홀수";
		System.out.println(r+"은 "+result);
	}
}
