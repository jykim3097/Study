package _1_exception.throws_;

public class ThrowsEx02 {
	
	//생성자
	public ThrowsEx02 () throws Exception {
		System.out.println("생성자 호출");
		bbb();
		System.out.println("생성자 종료");
	}
	
	public void aaa(int num) throws Exception {
		System.out.println("aaa 호출");
		
		System.out.println(10/num);
		
//		try {			
//			System.out.println(10/num);
//		} catch (Exception e ) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		System.out.println("aaa 종료");
	}
	
	public void bbb() throws Exception {
		System.out.println("bbb호출");
		try {
			aaa(0);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("bbb종료");
	}
}
