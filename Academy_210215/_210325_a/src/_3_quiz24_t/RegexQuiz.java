package _3_quiz24_t;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz {

	public static void main(String[] args) {
		
		/*
		 * 1. day, store, grade, detail, price을 멤버변수로 갖는 Product를 클래스 
		 * 	  (getter, setter를 사용하는 은닉클래스) 
		 * 
		 * 2. Product를 제네릭으로 갖는 List를 생성합니다.
		 * 3. BufferedReader를 이용해서 건담.txt 읽어들입니다.
		 * 4. while문 안에서 readLine으로 한줄씩 읽어서 처리
		 * 5. 날짜, 지점, 등급, 상세, 가격 패턴을 분석해서 Product에 저장한 후에 리스트에 추가
		 * 	  상세 - 앞뒤 인덱스를 이용해서 추출.
		 * 
		 * 6. 외부 라이브러리(POI)를 사용해서 분석한 패턴을 xlsx엑셀파일로 추출하면 됩니다.
		 * 
		 */
		String path = "";
		
		List<Product> list = new ArrayList<>();
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8") );
			
			String str;
			while( (str = br.readLine()) != null ) {
				System.out.println(str);
				
				//패턴
				String pattern1 = "\\d{8}-\\d{2}-\\d{12,13}";
				String pattern2 = "[가-힣]+ [가-힣]+";  //"건담베이스|건담 [가-힣]+";
				String pattern3 = "\\[[A-Z가-힣]+\\]"; //등급패턴
				String pattern4 = "\\d+,*\\d+원"; //가격패턴
				
				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m4 = Pattern.compile(pattern4).matcher(str);
				
				while( m1.find() && m2.find() && m3.find() && m4.find() ) {
					
					//System.out.println(m1.group());
					//System.out.println(m2.group());
					//System.out.println(m3.group());
					//System.out.println(m4.group());
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					
					String detail = str.substring(m3.end()+1, m4.start()-1);
					String price = m4.group();
					
					//상품객체에 저장
					Product p = new Product(day, store, grade, detail, price);
					//리스트 추가
					list.add(p);

				}
				
			} 
			
			//액셀 생성
			Workbook workbook = new XSSFWorkbook();
			
			//내용물 생성
			//시트 생성
			Sheet sheet = workbook.createSheet();
			
			//행, 열 생성
			Row row;
			Cell cell;
			
			row = sheet.createRow(0); //행
			
			cell = row.createCell(0); //열
			cell.setCellValue("날짜");
			
			cell = row.createCell(1); //열
			cell.setCellValue("지점");
			
			cell = row.createCell(2); //열
			cell.setCellValue("등급");
			
			cell = row.createCell(3); //열
			cell.setCellValue("상세");
			
			cell = row.createCell(4); //열
			cell.setCellValue("가격");
			
			//데이터 출력
			for(int i = 0; i < list.size(); i++) {
				
				Product p = list.get(i);
				
				//행생성
				row = sheet.createRow(i+1); //alt + shift + r 변수명 한번에 변경
				
				//열생성
				cell = row.createCell(0); //열
				cell.setCellValue(p.getDay());
				
				cell = row.createCell(1); //열
				cell.setCellValue(p.getStore());
				
				cell = row.createCell(2); //열
				cell.setCellValue(p.getGrade());
				
				cell = row.createCell(3); //열
				cell.setCellValue(p.getDetail());
				
				cell = row.createCell(4); //열
				cell.setCellValue(p.getPrice());
			}
			//파일 출력
			OutputStream out = new FileOutputStream("C:\\Users\\user\\Desktop\\course\\java\\workspace\\Quiz\\src\\quiz24\\건담.xlsx");
			workbook.write(out);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {}
		}
		
		
		
		
		
		
		
	}
}





