package _2_quiz24;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReqexQuiz {

	public static void main(String[] args) {

		/*
		 * 상품번호, 지점, 등급, 이름, 가격
		 * 1. day, store, grade, detail, price를 은닉멤버변수로 갖는 Product 클래스 - getter, setter
		 * 2. Product를 제네릭으로 갖는 List 생성
		 * 3. BufferedReader를 이용해서 건담.txt를 읽어온다.
		 * 4. while문 안에서 readLine으로 한줄씩 읽어서 처리
		 * 5. 날짜, 지점, 등급, 상세, 가격 패턴을 분석해서 Product에 저장한 후 리스트에 추가
		 * 6. 외부 라이브러리(POI)를 사용해서 분석한 패턴을 xlsx 엑셀파일로 추출
		 * 
		 */

		List<Product> list = new ArrayList<>();

		BufferedReader br = null;
		FileOutputStream fos = null;
		XSSFWorkbook wb = null;
		String path = "";

		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(path+"건담.txt"), "UTF-8"));

			//pattern
			String pDay = "[0-9]+\\-[0-9]+\\-[0-9]+";
			String pStore = "[가-힣]+\s[가-힣]+";
			String pGrade = "\\[[A-Z가-힣]+\\]";
			String pDetail = "";
			String pPrice = "\\d+\\,*\\d+원";

			String str;
			while((str = br.readLine()) != null) {
				
				//패턴별로 뽑아냄
				Matcher mDay = Pattern.compile(pDay).matcher(str);
				Matcher mStore = Pattern.compile(pStore).matcher(str);
				Matcher mGrade = Pattern.compile(pGrade).matcher(str);
				Matcher mPrice = Pattern.compile(pPrice).matcher(str);

				//Product 객체에 저장
				Product p = new Product();
				if(mDay.find() && mStore.find() && mGrade.find() && mPrice.find()) {

					p.setDay(mDay.group());
					p.setStore(mStore.group());
					p.setGrade(mGrade.group());
					p.setPrice(mPrice.group());

					//패턴이 없는 상세 내용 자르기
					pDetail = str.substring(mGrade.end()+1, mPrice.start()-1);
					p.setDetail(pDetail);
				}
				list.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		//엑셀 파일 쓰기
		try {

			wb = new XSSFWorkbook(); //확장자명이 .xlsx인 엑셀파일 생성
			XSSFSheet sheet = wb.createSheet("건담"); //sheet 이름 설정
			XSSFRow row = null;
			XSSFCell cell = null;

			//날짜, 지점, 등급, 상세, 가격
			row = sheet.createRow(0);
			
			cell = row.createCell(0); // 셀 한칸 만들기
			cell.setCellValue("날짜");
			cell = row.createCell(1);
			cell.setCellValue("지점");
			cell = row.createCell(2);
			cell.setCellValue("등급");
			cell = row.createCell(3);
			cell.setCellValue("상세");
			cell = row.createCell(4);
			cell.setCellValue("가격");
			
			if(list != null && list.size() > 0) {
				int i =1; //i는 줄의 의미, 0이면 첫번째 줄
				for(Product p : list) {
					row = sheet.createRow(i);
					i++;
					cell = row.createCell(0); // 셀 한칸 만들기
					cell.setCellValue(p.getDay());
					cell = row.createCell(1);
					cell.setCellValue(p.getStore());
					cell = row.createCell(2);
					cell.setCellValue(p.getGrade());
					cell = row.createCell(3);
					cell.setCellValue(p.getDetail());
					cell = row.createCell(4);
					cell.setCellValue(p.getPrice());
				}
			}

			fos = new FileOutputStream(path+"건담.xlsx");
			wb.write(fos);
			System.out.println("엑셀 파일 생성 완료");
			
		} catch (Exception e) {
			try {
				br.close();
				fos.close();
				wb.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
