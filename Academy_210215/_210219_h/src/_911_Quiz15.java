

public class _911_Quiz15 {
	public static void main(String[] args) {
		//Day03
		
		//금액을 큰 금액부터 거슬러서 몇개가 나오는 지 출력
		//몫과 나머지 이용
		int[] arr = {1000, 500, 100, 50, 10}; //돈
		int money = 17780; //금액
		
		int i =0;
		while(i<arr.length) {
			
			int k = money / arr[i];
			money = money % arr[i];
			System.out.println(arr[i]+"원 : "+k);
			i++;
		}
	}
}
