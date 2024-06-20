package Kjava.benq.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/Kjava/benq/day15/stream/outputstream/writing.txt");
			byte [] input = "헬로우 입출력".getBytes();
			for (int i = 0; i < input.length; i++) {
				os.write(input[i]);
			}
			// FileWriter을 사용한 경우 flush, close 처리해줘야 함
			os.flush(); // 버퍼비우기, 자원해제는 안 됨
			os.close(); // 자원해제, 버퍼도 지워짐
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}

// 파일이 안보일 경우 패키지 누른 후 F5(새로고침)
