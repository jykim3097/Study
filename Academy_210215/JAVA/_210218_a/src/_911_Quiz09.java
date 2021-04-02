

public class _911_Quiz09 {
	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "사요나라", "@#$"};
		
		/*
		 * 랜덤값을 이용해 0~3까지 랜덤수를 발생시켜주세요
		 * 나오는 수를 배열의 index에 적용해서 선택된 단어가 어느 나라 말인지 출력해주세요
		 */
		
		int idx = (int)(Math.random()*arr.length);
		
		switch(idx) {
		case 0 :
			System.out.println(arr[0]+", 대한민국");
			break;
			
		case 1 :
			System.out.println(arr[1]+", 미국");
			break;
			
		case 2 :
			System.out.println(arr[2]+", 일본");
			break;

		default :
			System.out.println("식별할 수 없습니다.");
			break;
		}
	}
}
