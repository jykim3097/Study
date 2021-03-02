package _210302_h;

public class _913_PhoneMain {
	public static void main(String[] args) {
		
		_912_Phone basic = new _912_Phone();
		basic.info();
		
		_912_Phone g = new _912_Phone("빨간");
		g.info();
		
		_912_Phone any = new _912_Phone(200000, "은");
		any.info();
		
		_912_Phone lg = new _912_Phone("lg", "파란");
		lg.info();
		
		//모든 멤버변수를 받아서 초기화하는 생성자
		//green, 900000, 샤오미를 저장해서 객체 생성
		_912_Phone xio = new _912_Phone("샤오미", 900000, "초록");
		xio.info();
		
		System.out.println(basic == any);
	}
}
