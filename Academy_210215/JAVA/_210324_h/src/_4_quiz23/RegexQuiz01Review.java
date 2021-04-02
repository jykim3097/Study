package _4_quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01Review {

	public static void main(String[] args) {
		
		//가격 형식만 찾아서 출력
		String str = "헠4,500원 헐~ 1,200원엏? 6000원ㅋ 120000원ㅎㅎ";
		
		String pattern = "\\d+(,|)\\d*원";
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
	}
}
