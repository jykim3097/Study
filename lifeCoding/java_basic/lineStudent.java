package org.javatutorials.lifecoding;

public class lineStudent {

	public static void main(String[] args) {
		
		int[] no_student = {1,2,3,4,5};
		int[] yes_student = new int[5];
		
		int studentNum = 0;
		
		for(int i=0; i<no_student.length; i++) {
			studentNum++;
			yes_student[i] = studentNum;
		}
		
		for(int j=0; j<yes_student.length; j++) {
			System.out.println(yes_student[j]);
		}
	}

}
