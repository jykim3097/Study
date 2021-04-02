package _2_static_.basic;

public class ArrayPrint {

	//Arrays.toString()처럼 사용될 수 있도록 각각 메서드를 처리
	//외부에서 객체 생성을 할 수 없도록 처리
	
	//생성자를 private으로 막으면 외부에서 객체를 생성할 수 없다.
	private ArrayPrint() {}
	
	public static String printArray(String[] sArr) {
		String s = "[";

		for(int i=0; i<sArr.length; i++) {
			s += sArr[i];
			if(i != sArr.length-1) {
				s += ", ";
			}
		}
		s += "]";

		return s;
	}

	//메소드 오버로딩
	public static String printArray(int[] iArr) {
		String s = "[";

		for(int i=0; i<iArr.length; i++) {
			s += iArr[i];
			if(i != iArr.length-1) {
				s += ", ";
			}
		}
		s += "]";

		return s;	
	}

	//메소드 오버로딩
	public static String printArray(double[] dArr) {
		String s = "[";

		for(int i=0; i<dArr.length; i++) {
			s += dArr[i];
			if(i != dArr.length-1) {
				s += ", ";
			}
		}
		s += "]";

		return s;
	}
	
	void test(String str) {
		System.out.println("1. "+str);
		str = "가나다";
		System.out.println("1. "+str);
	}
	
	void test(String[] sArr) {
		System.out.println("2. " + sArr);
		sArr[0] = "가나다";
	}
}
