package baekjoon.function;

//https://www.acmicpc.net/problem/4673
public class B4673 {

	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for(int i=1; i<check.length; i++) {
			if(d(i) < 10001)
				check[d(i)] = true;
		}
		
		for(int i=1; i<check.length; i++) {
			if(!check[i])
				System.out.println(i);
		}
	}
	
	//d(n)의 생성자는 n이다.
	//d(n) = n + n/10 + n%10
	//n을 넣어서  d(n) 값이 나오면 d(n)은 셀프넘버가 아니다.
	//남은 값이 셀프 넘버
	public static int d(int n) {
		int dn = n;
		
		while(n>0) {
			dn += n%10;
			n /= 10;
		}
		
		return dn;
	}

}
