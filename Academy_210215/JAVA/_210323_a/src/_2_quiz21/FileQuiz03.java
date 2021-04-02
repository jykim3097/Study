package _2_quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz03 {

	public static void main(String[] args) {
		/*
		 * 1. Date 클래스를 이용해서 file 경로에 오늘날짜 20210323 폴더를 생성한다 
		 * 2. 파일명을 입력받고, 파일명.txt 파일을 쓴다 
		 * 3. exit를 입력받을 때까지 엔터를 포함해서 실시간으로 파일을 쓴다. 
		 * 4. exit으로 파일을 써졌다면, 아무방법으로나 파일을 읽으세요
		 */

		Scanner scan = new Scanner(System.in);

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);

		File folder = null;
		BufferedWriter bw = null;
		BufferedReader br = null;

		String fileName = "";

		try {
			folder = new File("C:\\DEV\\Academy_210215\\_210322_file\\" + today);

			if (!folder.exists()) {
				folder.mkdir();
				System.out.println("폴더 생성 성공");
			} else {
				System.out.println("폴더가 이미 존재합니다. 해당 폴더로 이동합니다.");
			}

			System.out.print("파일 이름 입력> ");
			fileName = scan.nextLine();
			bw = new BufferedWriter(new FileWriter(folder.getPath() + "\\" + fileName + ".txt"));

			System.out.println("파일 내용 입력> ");
			while (true) {
				String contents = scan.nextLine();

				if (contents.equals("exit"))
					break;
				bw.write(contents + "\r\n");
			}
			// while문 안에 있으면 쓰고 줄바꾸고 쓰고 줄바꾸고
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				scan.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

		System.out.println();
		// 파일 읽기

		try {

			br = new BufferedReader(new FileReader(folder.getPath() + "\\" + fileName + ".txt"));

			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();

			try {
				br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}
}
