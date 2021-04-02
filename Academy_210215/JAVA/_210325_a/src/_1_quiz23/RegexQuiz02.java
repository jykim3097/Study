package _1_quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		// 상품 번호, 편의점명, (도시락명), 가격으로 분리해서 출력
		
		String str = "123123-456456 GS25(마늘햄쌈) 4,400원";
		String str2 = "111111-222222 GS25(치킨도시락) 5,500원";
		String str3 = "222222-333333 MINISTOP(제육볶음) 5,700";
		
		String num = "\\d{6}-\\d{6}"; //[0-9]{6}-[0-9]{6}, \\d{6}-\\{6}
		String gName = "[A-Z]+[0-9]*";
		String name = "[(][가-힣]+[)]"; //\\([가-힣]+\\)
		String price = "\\d+,\\d*원*"; //"[0-9]+\\,[0-9]+원*"
		
		String[] sArr = {str, str2, str3};
		String[] pArr = {num, gName, name, price};
	
		for(int i=0; i<sArr.length; i++) {
			for(int j=0; j<pArr.length; j++) {
				Matcher m = Pattern.compile(pArr[j]).matcher(sArr[i]);
				if(m.find()) {
					System.out.println(m.group());
				}
			}
			System.out.println();
		}
	}
}
