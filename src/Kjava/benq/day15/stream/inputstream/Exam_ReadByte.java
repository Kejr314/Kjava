package Kjava.benq.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/Kjava/benq/day15/stream/inputstream/reading.txt");
			byte [] readBytes = new byte[3];
			int readCount;
			String result = "";
			/* while문 */
//			while(true) {
//				readCount = is.read(readBytes);
//				if(readCount == -1) break;
//				result += new String(readBytes, 0, readCount);
//			}
			
			/* do-while문 */
			do {
				readCount = is.read(readBytes);
				if(readCount == -1) break;
				result += new String(readBytes, 0, readCount); // 문자열로 변경
			} while(readCount != -1);
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
