package _2.api.lang.sys;

public class SystemEx {

	public static void main(String[] args) {
		
		/*
		 * System은 운영체제 관련된 내용을 확인할 수 있는 클래스
		 * 전부 static 멤버로 구성되어 있다.
		 * 생성자도 모두 private으로 설정되어 있다.
		 * 
		 * 프로그램의 간단한 시간 측정에 사용할 수 있다.
		 * 1970년 1월 1일 00시 기준으로 지금까지 흘러온 시간
		 */
		
		//UTC 기준 - 세계표준시로 영국 런던을 기준으로 하고 우리나라와 9시간 차이가 난다
		long start = System.currentTimeMillis();
		
		long sum = 0;
		for(long i = 1 ; i <10000000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("경과 시간: " + (end - start) * 0.001);
	}
}
