package _1_api.lang.sb;

public class StringBufferEx {

	public static void main(String[] args) {
		
		String str = new String("java");
		StringBuffer sb = new StringBuffer("java");
		
		System.out.println(str);
		System.out.println(sb);
		
		//차이점
		str += " program"; // 새롭게 문자열이 생성된 것
		sb.append(" program"); //다시 변경하거나 대입하지 않아도
		
		System.out.println(str);
		System.out.println(sb); //그 자체가 변경이 된다. > 1개의 객체 재활용
		
		//문자열 추가
		sb.append(" study");
		System.out.println(sb);
		
		//문자열 중간에 추가
		sb.insert(12, "ming");
		System.out.println(sb);
		
		//문자열 삭제
		sb.delete(5, 17);
		System.out.println(sb);
		
		//문자열 거꾸로 reverse()
		sb.reverse();
		System.out.println(sb);
		
		//문자열 변경
		sb.replace(5, 10, "book");
		System.out.println(sb);
		
		
	}
}
