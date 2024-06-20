package Kjava.benq.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {

	public static void main(String[] args) {
		// C:\Windows\Web\Wallpaper\Windows\img0.jpg -> C:\Temp\copyimg.jpg 복사
		
		InputStream is = null; // 입력스트림
		OutputStream os = null; // 출력스트림
		
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg"); // '\' = \\ 로 표시
			os = new FileOutputStream("C:\\Temp\\copyimg.jpg");
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
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
