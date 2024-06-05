package Kjava.benq.day02.printbasic;

import java.util.Scanner;

public class Exam_PrintSample {
	public static void main(String [] args) {
		// print 명령어는 ln이 없고 개행이 안되므로 개행하고 싶으면 \n 입력해야 함. ex) "지금까지 쓰던 출력 명령어\n");
		System.out.print("지금까지 쓰던 출력 명령어");
		System.out.println(); // 개행의 역할
		System.out.println("지금까지와는 다른 출력 명령어");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 수 입력 : ");
		int num = sc.nextInt();
		
		// print() 메소드
		System.out.printf("정수 출력 : %d", 57);
	}

}
