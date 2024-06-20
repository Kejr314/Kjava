package Kjava.benq.day15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/Kjava/benq/day15/stream/reader/reading.txt");
			char [] data = "Html/Css/Java".toCharArray();
			for (int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.flush(); // 버퍼 비우기
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	}

}
