package _2_quiz17;

import java.util.Arrays;

public class Quiz02_t {

	public static void main(String[] args) {
		/*
		 * 프로그래머스
		 * 
		 * participant는 마라톤 참가자 명단
		 * completion은 마라톤 완주자 명단
		 * 
		 * completion은 participant의 길이보다 -1이 작다
		 * 참가자는 동일인이 있을 수 있다
		 * 어떤 배열이 주어지던 간에 마라톤을 완주하지 못한 이름(String)을 찾아내는 메서드 작성
		 */

		String[] participant = {"이순신", "이순신", "신사임당", "신사임당", "이순신"};
		String[] completion = {"이순신", "이순신", "이순신", "신사임당"};

		System.out.println("완주하지 못한 사람 : " + solution(participant, completion));
	}

	public static String solution(String[] p, String[] c) {

		String answer = "";

		Arrays.sort(p);
		Arrays.sort(c);

		System.out.println(Arrays.toString(p));
		System.out.println(Arrays.toString(c));

		for(int i=0; i<c.length; i++) {
			if(!c[i].equals(p[i])) {
				answer = p[i];
			}
		}
		
		answer = p[p.length-1];
		return answer;
	}
}
