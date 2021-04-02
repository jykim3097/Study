
public class _8_BreakEx03 {
	public static void main(String[] args) {
		//Day04
		//중첩 반복문의 탈출
		
//		boolean flag = false; //탈출을 위한 변수
//		
//		for(char u = 'A'; u <= 'Z'; u++) {
//			System.out.print(u+" ");
//			for(char l = 'a'; l <='z'; l++) {
//				System.out.print(l);
//				if(l == 'c') {
//					flag = true;
//					break;
//				}
//			}
//			if(flag == true) break;
//			System.out.println();
//		}
		
		
		//라벨링 탈출 - 복잡할 때 활용하면 좋다
		es:for(char u = 'A'; u <= 'Z'; u++) {
			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(u+ " - " +l);
				 if(l=='c') break es;
			}
		}
	}
}
