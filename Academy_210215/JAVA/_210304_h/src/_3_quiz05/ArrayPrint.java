package _3_quiz05;

public class ArrayPrint {

	String printArray(String[] sArr) {
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
	String printArray(int[] iArr) {
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
	String printArray(double[] dArr) {
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
