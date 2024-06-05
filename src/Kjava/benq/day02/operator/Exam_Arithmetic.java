package Kjava.benq.day02.operator;

import java.util.Scanner;

public class Exam_Arithmetic {

	public static void main(String[] args) {
		// 산술연산
		// +, - , *, /, %
		// % : 나머지를 구해주는 연산자
		/*
		 * 문제1 
		 * 초 단위의 정수를 입력받고, 몇시간, 몇분, 몇초인지 출력하는 프로그램을 작성하여라.
		 */
		 
		Scanner scanner = new Scanner(System.in); // import 통해 scanner 클래스 호출
		System.out.print("초 단위의 정수를 입력해주세요 : ");
		int time = scanner.nextInt(); // 초기화
		
		// 5000초 -> 몇시간 몇분 몇초인지 출력
		int hour = time / 60 / 60; // 5000/60 -> 83/60
		int minute = (time / 60) % 60; // 83 % 60
		int seccond = time % 60; // 5000 % 60
		System.out.println(hour + "시간 " + minute + "분 " + seccond + "초");
		
	}

}
