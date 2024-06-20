package Kjava.benq.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null;
		int readByte;
		try {
			// 파일 경로 입력
			// 파일 -> Properties -> src/ ~ /파일 ※ src 앞에 '/' 있으면 경로 없다고 함
			is = new FileInputStream("src/Kjava/benq/day15/stream/inputstream/reading.txt"); // reading.txt 호출하여 Console에 출력
			
//			int readByte = is.read(); // 읽는 메소드
//			System.out.println((char)readByte); // System.out. -> Stream, println() -> 메소드
			
			do {
				readByte = is.read();
				System.out.println((char)readByte);
			} while(readByte != -1); 
		} 
		// 최하위 catch가 부모
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
