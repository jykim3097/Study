package _2_encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth me = new MyBirth();
		
		me.setYear(2021);
		me.setMonth(3);
		me.setDay(5);
		me.setSsn("2103051111111");
		
		System.out.println("생일은 " + me.getYear()+"년 " + me.getMonth() + "월 " + me.getDay() + "일");
		System.out.println("주민번호: " + me.getSsn());
	}
}
