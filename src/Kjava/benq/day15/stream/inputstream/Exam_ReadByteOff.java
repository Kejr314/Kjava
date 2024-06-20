package Kjava.benq.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src/Kjava/benq/day15/stream/inputstream/reading.txt");
			int readCount;
			byte [] readBytes = new byte[3];
			String result = "";
			while (true) {
				readCount = is.read(readBytes, 1, 2); // 1부터 2까지 읽도록 설정, 읽을 위치와 갯수 설정할 수 있음
				if(readCount == -1) break;
				result += new String(readBytes, 0, readCount);
			}
			is.close(); // readCount = is.read()에서 예외가 발생하면 close 되지 않음 -> finally 입력해줘야 함
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 예외가 발생하든 안하든 반드시 실행하는 코드
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
