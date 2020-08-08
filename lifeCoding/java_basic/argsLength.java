package org.javatutorials.lifecoding;

public class argsLength {

	public static void main(String[] args) {
		
		for(String e : args) {
			System.out.println(e);
		}
		
		System.out.println("args.length : "+args.length);
	}

}
