package _1_api.util.calendar;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		//Calendar는 일반적인 객체 생성이 안됩니다. (싱글톤)
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get( Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+"년 " +month+"월 "+date+"일 "+hour+"시 "+minute+"분 "+second+"초");
	}
}
