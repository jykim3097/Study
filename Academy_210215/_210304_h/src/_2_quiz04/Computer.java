package _2_quiz04;

public class Computer extends Calculator{

	double circle(int r) {
		return r*r*(Math.PI);
	}
	
	double rect(double d) {
		return d*d;
	}
	
	//메소드 오버로딩
	double rect(double d, double b) {
		return d*b;
	}
	
	//메소드 오버로딩
	double rect(double d, double b, double h) {
		return d*b*h;
	}
}
