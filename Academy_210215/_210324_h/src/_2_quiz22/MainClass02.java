package _2_quiz22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class MainClass02 {
	
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
		
		Data data;
		List<Data> list = new ArrayList<>();
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(path+""), "EUC-KR"));
			
			String str;
			while((str = br.readLine()) != null) {//csv 파일에서 한줄 단위로 읽어옴
			
				//price 값 정제1 : ", -, 두칸공백 삭제
				str = str.replace("\"", "").replace("-", "").replace("  ", "");

				data = new Data();
				StringTokenizer st = new StringTokenizer(str, ",");
				data.setRegion(st.nextToken());
				data.setSize(st.nextToken());
				data.setYear(st.nextToken());
				data.setMonth(st.nextToken());
				
				//price 값 정제2 : 
				//값 쪼개진 경우 처리, 값이 없는 경우 price 값에 null 입력
				String price = "";
				if(st.hasMoreTokens()) {
					price += st.nextToken();
					if(st.hasMoreTokens()) {
						price += st.nextToken();
					}
					data.setPrice(price);
				} else data.setPrice(null);
				
				list.add(data);
			}
			
			List<Data> nList = list.stream()
				.filter((j) -> (j.getPrice() != null))
				.filter((j) -> j.getRegion().equals("서울"))
				.filter((j) -> (Integer.parseInt(j.getMonth()) <= 6))
				.filter((j) -> (Integer.parseInt(j.getPrice()) >= 4000))
				.collect(Collectors.toList());
			
			//List에도 for each가 있다
			nList.forEach((j)-> System.out.println(j.getData()));
			System.out.println(nList.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
