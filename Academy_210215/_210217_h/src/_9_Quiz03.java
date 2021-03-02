

public class _9_Quiz03 {
	public static void main(String[] args) {
		//숙제
		//-10 ~ 10까지의 랜덤 수를 만들고, 이 값이 0인지, 양수인지, 음수인지 판별
		//조건 - ifelse 쓰지 않는다.
		int n = (int)(Math.random()*21)-10;
		String result = n > 0 ? "양수" : (n == 0 ? "0":"음수");
		//String result_t = n == 0 ? "0" : (n < 0 ? "음수" : "양수");
		System.out.println(n +"은 " + result);
	}
}
