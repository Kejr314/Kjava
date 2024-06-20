package Kjava.benq.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {

	public static void main(String[] args) {
		// 파일 복사
		// C:\Temp\java_exercise_img.jpg -> C:\Test\Exam_FileCopy.jpg
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Temp\\java_exercise_img.jpg");
			os = new FileOutputStream("C:\\Test\\Exam_FileCopy.jpg");
			byte [] byteImages = new byte[1024];
			int readCount;
			while (true) {
				readCount = is.read(byteImages);
				if(readCount == -1) break;
				os.write(byteImages, 0, readCount);
				os.flush();
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
