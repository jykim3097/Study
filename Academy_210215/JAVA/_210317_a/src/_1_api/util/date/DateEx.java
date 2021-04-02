package _1_api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		//날짜 클래스
		Date date = new Date(); //import java.util 패키지
		//System.out.println(date);
		
		//날짜 포맷클래스
		/*
		 * MM - 월
		 * mm - 분
		 * 
		 * HH - 24시 형식으로
		 * hh - 12시 형식
		 */
		
		//주된 사용형식
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String result = sdf.format(date);
		System.out.println(result);
		
		sdf = new SimpleDateFormat("yyyyMMdd");
		String result2 = sdf.format(date);
		
		System.out.println(result2);
		
	}
}
