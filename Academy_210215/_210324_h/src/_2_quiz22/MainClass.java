package _2_quiz22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 1. BufferedReader를 이용해 파일을 읽는다. readLine()
		 * 2. 콤마 기준으로 잘라서 Data 클래스에 멤버변수에 한줄 단위로 저장
		 * 	  Data 클래스는 getter, setter를 갖는 은닉클래스
		 * 	  변수명 : region, size, year, month, price
		 * 3. List<Data>에 추가
		 * 4. 람다식을 이용해 null이 아닌 데이터, 지역: 서울, (1분기)3,4,5월의, 분양가격 4000이상만 뽑아서
		 *    새로운 리스트로 정리
		 */

		BufferedReader br = null;
		String path = "";
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(path+""),"EUC-KR"));

			Data data;
			List<Data> dList = new ArrayList<>();
			
			String str;
			while((str = br.readLine()) != null) {
				
				//한줄씩 정제
				str = str.replace("\"", "");
				String[] t = str.split(",");
				
				if(t.length == 4) { //price가 빈칸일 때
					data = new Data(t[0], t[1], t[2], t[3], "-1");
				} else if (t.length == 5) { //일반적인 경우와 price가 공백일 때
					if(t[4].equals("  ") || t[4].equals("-")) t[4] = "-1";
					data = new Data(t[0], t[1], t[2], t[3], t[4]);
				} else { // price가 쪼개질 때
					data = new Data(t[0], t[1], t[2], t[3], t[4]+t[5]);
				}
				
				dList.add(data);
			}

			List<Data> newList = dList.stream()
				.filter((a) -> a.getPrice() != "-1")
				.filter((j) -> j.getRegion().equals("서울"))
				.filter((j) -> (Integer.parseInt(j.getMonth()) < 6))
				.filter((j) -> (Integer.parseInt(j.getPrice()) >= 4000))
				.collect(Collectors.toList());

			newList.stream().forEach((a) -> System.out.println(a.getData()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
