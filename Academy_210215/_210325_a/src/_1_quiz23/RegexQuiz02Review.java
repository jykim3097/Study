package _1_quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02Review {

	public static void main(String[] args) {

		// 상품 번호, 편의점명, (도시락명), 가격으로 분리해서 출력

		String str = "123123-456456 GS25(마늘햄쌈) 4,400원";
		String str2 = "111111-222222 GS25(치킨도시락) 5,500원";
		String str3 = "222222-333333 MINISTOP(제육볶음) 5,700";

		String pNum = "[0-9]{6}-[0-9]{6}";
		String pName = "[A-Z]+[0-9]*";
		String pDName = "\\([가-힣]+\\)";
		String pPrice = "\\d+\\,\\d+원*";

		String[] sArr = { str, str2, str3 };

		for (String s : sArr) {
			Matcher mNum = Pattern.compile(pNum).matcher(s);
			Matcher mName = Pattern.compile(pName).matcher(s);
			Matcher mDName = Pattern.compile(pDName).matcher(s);
			Matcher mPrice = Pattern.compile(pPrice).matcher(s);

			if (mNum.find() && mName.find() && mDName.find() && mPrice.find()) {
				System.out.println(mNum.group());
				System.out.println(mName.group());
				System.out.println(mDName.group());
				System.out.println(mPrice.group());
			}
			System.out.println();
		}
	}

}
