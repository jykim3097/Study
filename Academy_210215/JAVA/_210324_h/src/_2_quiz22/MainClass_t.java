package _2_quiz22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass_t {

	public static void main(String[] args) {
		
		List<Data> list = new ArrayList<>();
		
		BufferedReader br = null;
		String path = "";
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(path+""), "EUC-KR"));
			br.readLine();
			
			String str;
			while((str = br.readLine())!= null) {
				System.out.println(str);
				String[] arr = str.split(",", 5);
				
				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				arr[4] = arr[4].replace(",", "").replace(" ", "").replace("\"", "").replace("-", "");

				String price;
				if(arr[4].equals("")) {
					price = "0";
				} else {
					price = arr[4];
				}
				
				Data data = new Data(region, size, year, month, price);
				list.add(data);
				
			}
			
			//람다식(지역: 서울, (1분기) 6월 이하의, 분양가격 4000 이상만
			List<Data> newList = list.stream()
				.filter((data) -> data.getRegion().equals("서울")) // 지역 서울
				.filter((data) -> Integer.parseInt( data.getMonth() ) <= 6) // 6월 이하
				.filter((data) -> Integer.parseInt( data.getPrice() ) >= 4000) // 4000 이상
				.collect(Collectors.toList());
			
			System.out.println(newList.size());
			
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
