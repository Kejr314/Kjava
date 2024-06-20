package Kjava.benq.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {
	public static void main(String[] args) {
		// C:\Windows\system.ini -> C:\Temp\system.txt 
		// 문자기반 스트림
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("C:\\Windows\\system.ini");
			writer = new FileWriter("C:\\Temp\\system.txt ");
			int readCount;
			char [] cBuf = new char[10];
			while (true) {
				readCount = reader.read(cBuf);
				if(readCount == -1)break;
				writer.write(cBuf, 0, readCount);
				writer.flush();
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
