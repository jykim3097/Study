package _3_generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		ABC abc = new ABC();
		
		abc.setObj("홍길동"); //저장
		String name = (String)abc.getObj();
		
		abc.setObj(new DEF()); //저장
		DEF def = (DEF)abc.getObj();
		
		/*
		 * Object형으로 선언하면 무엇이든 저장할 수 있지만,
		 * 반대로 저장했던 값을 사용할 때
		 * 타입별로 형변환을 해야하는 문제가 발생
		 * 
		 * 그리고 잘못 형변환하면 오류가 발생한다.
		 */
	}
}
