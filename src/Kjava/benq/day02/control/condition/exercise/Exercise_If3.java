package Kjava.benq.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {

	public static void main(String[] args) {
		// 문제 3
		// 점수를 입력받아 등급을 알려주는 프로그램을 작성하시오
		// 점수를 입력해주세요 : 92
		// 학점은 A입니다.
		// 단, 점수는 0 ~ 100 사이의 수를 입력하도록 함.
		// 점수를 입력해주세요 : 102
		// 0 ~ 100 사이의 수를 입력해주세요
		// 커트라임 ( 90 ~ 100 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60 : D, 그 외 F
	
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		
		int score = sc.nextInt();
		char level = 'F';
		
		
		if (0 <= score && score <= 100) {
			
			if (90 <= score && score < 100) {
				level = 'A';
			}
			else if (80 <= score && score < 90) {
				level = 'B';
			}
			else if (70 <= score && score < 80) {
				level = 'C';
			}
			else if (60 <= score && score < 70) {
				level = 'D';
			}
			else if (50 <= score && score < 60) {
				level = 'E';
			}
			else if (0 <= score && score < 50) {
				level = 'F';
			}
			
			System.out.println("학점은 " + level + "입니다.");
		}
		else {
			System.out.print("0 ~ 100 사이의 수를 입력해주세요.");
		}	
	
	}
	
}
