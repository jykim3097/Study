import java.util.Arrays;

public class _6_MethodQuiz03 {
	public static void main(String[] args) {

		System.out.println("Quiz18 : " + java(5) + "\n");
		
		System.out.println("Quiz19 : " + sum(6) + "\n");
		
		System.out.println("Quiz20 : " + primeNum(10) + "\n");
		
		System.out.println("Quiz21");
		System.out.println("7~9사이의 수의 합: " + sumNum(7,9));
		System.out.println("9~7사이의 수의 합: " + sumNum(9,7));
		System.out.println("5~5사이의 수의 합: " + sumNum(5,5) + "\n");
	}

	
	//Quiz18
	static String java(int end) {

		String s = "";
		for(int i=0; i<end; i++) {
			if(i%2 == 0) {
				s += "자";
			} else {
				s += "바";
			}
		}

		return s;
	}

	//Quiz19
	static int sum(int n) {

		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}

		return sum;
	}
	
	//Quiz20
	static int primeNum(int a) {
		
		int prime = 0;
		for(int i=1; i<=a; i++) {
			int cnt = 0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					cnt++;
				}
				if(cnt>2) break;
			}
			if(cnt == 2)
				prime++;
		}
		return prime;
	}
	
	//Quiz21
	static int sumNum(int a, int b) {
		
//		내 코드
//		int max = a>b? a : b;
//		int min = a>b? b : a;
//		
//		int sum=0;
//	
//		if( min == max) {
//			sum = min;
//		} else {
//			for(int i=min; i<=max; i++) {
//				sum+= i;
//			}			
//		}
		
		//쌤코드
		int max, min, sum =0;
		
		if(a == b) {
			return a;
		} else if(a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		for(int i=min; i<=max; i++) {
			sum +=i;
		}

		return sum;
	}	
	
	
}
