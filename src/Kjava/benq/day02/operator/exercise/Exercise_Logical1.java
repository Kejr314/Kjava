package Kjava.benq.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {

	public static void main(String[] args) {
		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요!
		// 변수 num에 초기화
		// 1부터 100사이의 숫자인가? : true
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요! \n");
		
		int num = scanner.nextInt();
		boolean result;
		
		result = (1 <= num) && (num <= 100);
		System.out.println("1부터 100사이의 숫자인가? : " + result);	
		
		
	}

}
