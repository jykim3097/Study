import java.util.Arrays;

public class _910_ArrayEx {
	public static void main(String[] args) {
		//Day02
		//1. 배열의 선언
		int[] arr; // type에 대괄호 붙여준다. 변수에 붙이는 걸 허용하긴 하지만 올바른 방법은 아님
		
		//2. 배열의 생성 - 생성할 때 크기를 지정한다.
		arr = new int[5];
		
		//3. 배열의 초기화 (값을 지정하는 과정)
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 34;
		arr[4] = 50;
		
		//4. 배열의 사용
		System.out.println("arr[2]의 값은 " + arr[2]);
		arr[2] = 1000;
		System.out.println("arr[2]의 값은 " + arr[2]);
		
		//5. 배열의 저장된 값을 한눈에 확인하는 명령
		System.out.println("arr = " + Arrays.toString(arr));
		
		System.out.println("--------------- 210218 ---------------");
		
		//6. 배열의 길이를 확인하는 명령
		System.out.println("arr의 길이 = " + arr.length);
		
		//7. 배열의 선언과 생성을 동시에
		byte[] arr2 = new byte[7];
		
		//8. 배열의 선언, 생성, 초기화를 동시에
		short[] arr3 = {1,2,3,4,5};
		System.out.println("arr3 = " + Arrays.toString(arr3));
		
		//8-1. 배열의 선언, 생성, 초기화를 동시에 2번째 방법
		short[] arr4 = new short[] {1,2,3,4,5};
		
		//9. 배열의 초기값을 지정하지 않더라도 각 타입의 기본값으로 "자동으로" 초기화 된다. (0, 0.0, null)
		String[] arr5 = new String[5];
		System.out.println("arr5 = " + Arrays.toString(arr5));
		
		double[] arr6 = new double[5];
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		System.out.println("--------------------------------------");
		//1. 문자열 배열을 생성하고, 본인의 이름과 전화번호를 문자열로 저장해서 값을 확인해봐라
		String[] arr_jy = new String[] {"김지영", "010-1234-5678"};
		System.out.println("jy의 정보 = " + Arrays.toString(arr_jy));
		
		//2. 크기가 3인 int형 배열에 1~3까지의 랜덤값을 각각 저장해라
		int[] arr8 = new int[3];
		arr8[0] = (int)(Math.random()*3) + 1;
		arr8[1] = (int)(Math.random()*3) + 1;
		arr8[2] = (int)(Math.random()*3) + 1;
		System.out.println("arr8 = " + Arrays.toString(arr8));
		
	}
}
