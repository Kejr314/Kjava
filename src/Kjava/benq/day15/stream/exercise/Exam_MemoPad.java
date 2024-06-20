package Kjava.benq.day15.stream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {

	public static void main(String[] args) {
		
	// 저장할 파일 입력(확장자 제외) : snow
	// 종료 : exit
	// 1 : 오늘은
	// 2 : 눈이
	// 3 : 옵니다.
	// 4 : 펑펑
	// 5 : 옵니다.
	// 6 : exit
	// 파일 저장이 완료되었습니다. F5를 눌러 확인해보세요.
	// snow.txt -> 오늘은 \n 눈이 \n 옵니다 \n 펑펑 \n 옵니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력(확장자 제외) : ");
		String fileName = sc.nextLine();
		String dest = "src/Kjava/benq/day15/stream/exercise/" + fileName + ".txt"; // 입력받은 파일명으로 해당 경로 설정
		
		Writer writer = null; // 출력스트림 준비
		
		try {
			writer = new FileWriter(dest); // 파일 생성, 입력 받을 준비
			System.out.println("종료는 exit");
			for (int i = 1; ; i++) { // ; ; :루프가 계속 실행될지 여부에 조건이 없으므로 항상 true로 간주되어 무한 루프
				System.out.print(i + " : ");
				String input = sc.nextLine();
				if("exit".equals(input)) break; // 문자열 비교 시 NullPointerException 방지
				writer.write(input + "\n"); // 해당 경로 파일에 저장
				writer.flush(); // 버퍼 비우기
			}
			System.out.println("파일 저장이 완료되었습니다. F5를 눌러 확인해보세요.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close(); // 스트림 자원 해제
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
