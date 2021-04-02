package _7_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_1152 {
	public static void main(String[] args) throws IOException {
		/*
		 * https://www.acmicpc.net/problem/1152
		 * 단어의 개수
		 * 문자와 띄어쓰기로 구성되어있는 문자열에서 단어의 개수 구하기
		 * 
		 * 개행은 길이가 0이지만, 띄어쓰기는 길이가 1이다.
		 */

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String str = rd.readLine();

		int len = str.length();
		int cnt = 0;
		String s = "";

		if(len == 0) { //개행만 한 경우
			System.out.println(0);
		} else if (len == 1) { 
			if(str.charAt(0) == ' ') { // 띄어쓰기만 입력된 경우
				System.out.println(0);
			} else { //한 글자인 경우
				System.out.println(1);
			}
		} else { // 그 외 모든 경우
			es: for(int i=0; i<len; i++) {
				if(str.charAt(i) != ' ') { // 띄어쓰기가 아니라면

					if(i == str.length()-1) {
						cnt++;
						break es;
					}
					s += str.charAt(i);
					
				} else { //띄어쓰기를 만나면
					if( i == 0) { //첫글자가 띄어쓰기인 경우
						continue;
					}
					cnt++;
					s = "";
				}
			}
		System.out.println(cnt);
		}

	}
}
