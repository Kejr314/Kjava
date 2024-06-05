package Kjava.benq.day02.control.condition.exercise;

import java.util.*;

public class Exercise_If1 {

	public static void main(String[] args) {
		// 문제 1
		// 점수와 학년을 정수로 입력받아 60점 이상이면 합격
		// 60점 미만이면 불합격으로 출력한다.
		// 단, 4학년의 경우 70점이상이어야 합격을 출력하는 프로그램을 작성하시오.
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("학년, 점수 : ");
	
	int grade = sc.nextInt();
	int score = sc.nextInt();
	
	if(grade < 4 && score >= 60) {
		System.out.println("합격입니다.");
	}
	else if(grade == 4 && score >= 70) {
		System.out.println("합격입니다.");
	}
	else {
		System.out.println("불합격입니다.");
	}
	
}
	
}
