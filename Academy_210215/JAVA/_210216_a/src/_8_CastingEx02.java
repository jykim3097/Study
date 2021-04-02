
public class _8_CastingEx02 {

	public static void main(String[] args) {
		//Day01
		/*
		 * 크기가 큰 타입을 작은 타입에 저장할 때는 
		 * (type) 캐스팅을 사용해 명시적 형변환을 해야 한다.		 * 
		 */
		
		int i = 65;
		char c = (char) i;
		short s = (short) i;
		System.out.println("c의 값은 : " + c);
		
		float f = 3.14f;
		int j = (int) f; // 정수 부분만 가져올 게
		System.out.println("j의 값은 : " + j);
		
		/*
		 * 강제 타입변환 시에 주의할 점은 값을 받아들일 수 없는 범위가 들어오면
		 * 잘려나간 쓰레기값을 저장하게 됩니다.
		 */
		
		int a = 1000;
		byte b = (byte) a;
		System.out.println("b의 값은 : " + b);
		
		/*
		 * 예외상황
		 * char 값을 short 형으로 변경할 때도 명시적으로 형변환 해야 한다.
		 * short는 부호 비트가 있고 char은 부호 비트가 없기 때문에 형변환을 해줘야한다.
		 */
		
		char cc = 'A';
		short ss = (short) cc;
		System.out.println("ss의 값은 " + ss);
	}
}
