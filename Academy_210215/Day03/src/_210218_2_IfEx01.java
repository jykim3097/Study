
public class _210218_2_IfEx01 {
	public static void main(String[] args) {
		
		//0~100 점수를 생성
		int point = (int)(Math.random()*101);
		System.out.println("점수 : "+ point + "점");
		
		if(point >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
