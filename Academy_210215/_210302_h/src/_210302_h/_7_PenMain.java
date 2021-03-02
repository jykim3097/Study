package _210302_h;

public class _7_PenMain {
	public static void main(String[] args) {
		
		//Pen의 기능, 속성을 사용하려면 설계용 클래스를 생성해야 한다.
		_6_Pen black = new _6_Pen();
		
		black.ink = "검정";
		black.price = 2000;
		black.company = "korea";
		
		black.write();
		black.info();
		
		System.out.println();
		
		_6_Pen red = new _6_Pen();
		
		red.ink = "빨간";
		red.price = 2000;
		red.company = "korea";
		
		red.write();
		red.info();
		
		System.out.println();
		
		//계산기 생성
		_4_Calculator cal = new _4_Calculator();
		System.out.println("두 펜을 한 개씩 구매하면 "+cal.add(black.price+red.price)+"원입니다.");
	}
}
